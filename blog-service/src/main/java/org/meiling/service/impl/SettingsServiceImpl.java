package org.meiling.service.impl;

import java.util.List;

import org.meiling.dao.ClassifyMapper;
import org.meiling.dao.DiscussMapper;
import org.meiling.dao.EssayMapper;
import org.meiling.dao.LabelMapper;
import org.meiling.dao.SettingsMapper;
import org.meiling.entity.ClassifyExample;
import org.meiling.entity.DiscussExample;
import org.meiling.entity.Essay;
import org.meiling.entity.EssayExample;
import org.meiling.entity.EssayExample.Criteria;
import org.meiling.entity.LabelExample;
import org.meiling.entity.Settings;
import org.meiling.entity.SettingsExample;
import org.meiling.entity.Total;
import org.meiling.service.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsServiceImpl implements SettingsService{
	@Autowired
	private SettingsMapper settingsMapper;
	
	@Autowired
	private EssayMapper essayMapper;
	
	@Autowired
	private DiscussMapper discussMapper;
	
	@Autowired
	private ClassifyMapper classifyMapper;
	
	@Autowired
	private LabelMapper labelMapper;
	

	@Override
	public void save(Settings settings) {
		settingsMapper.updateByPrimaryKeySelective(settings);
	}


	@Override
	public Total totalSurvey() {
		Total total = new Total();
		total.setClassifySize(classifyMapper.countByExample(new ClassifyExample()));
		total.setDiscussSize(discussMapper.countByExample(new DiscussExample()));
		total.setEssaySize(essayMapper.countByExample(new EssayExample()));
		total.setLabelSize(labelMapper.countByExample(new LabelExample()));
		List<Essay> selectByExample = essayMapper.selectByExample(new EssayExample());
		int view = 0;
		for (Essay essay : selectByExample) {
			view = view+essay.getePageview().intValue();
		}
		total.setViewSize(view);
		EssayExample example = new EssayExample();
		example.setOrderByClause("e_settingtime DESC");
		List<Essay> selectByExample2 = essayMapper.selectByExample(example);
		if (selectByExample2!=null&&selectByExample2.size()>0) {
			total.setNewTime(selectByExample2.get(0).geteSettingtime());
		}else{
			total.setNewTime(null);
		}
		return total;
	}

	@Override
	public Settings findFirst() {
		SettingsExample example = new SettingsExample();
		List<Settings> selectByExample = settingsMapper.selectByExampleWithBLOBs(example);
		if (selectByExample!=null&&selectByExample.size()>0) {
			return selectByExample.get(0);
		}
		return null;
	}

}
