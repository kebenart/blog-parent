package org.meiling.service.impl;

import java.util.List;

import org.meiling.dao.ClassifyMapper;
import org.meiling.dao.EssayMapper;
import org.meiling.entity.Classify;
import org.meiling.entity.ClassifyExample;
import org.meiling.entity.Essay;
import org.meiling.entity.EssayExample;
import org.meiling.entity.ClassifyExample.Criteria;
import org.meiling.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ClassifyServiceImpl implements ClassifyService{
	@Autowired
	private ClassifyMapper classifyMapper;
	
	@Autowired
	private EssayMapper essayMapper;
	
	@Override
	public List<Classify> findAllClassifys() {
		List<Classify> classifys = classifyMapper.selectByExample(new ClassifyExample());
		if (classifys!=null&&classifys.size()>0) {
			return classifys;
		}
		return null;
	}

	@Override
	public void deleteClassifyById(String classifyId) {
		ClassifyExample example = new ClassifyExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCNameEqualTo("默认分类");
		List<Classify> select = classifyMapper.selectByExample(example);
		if (select!=null&&select.size()>0) {
			Classify classify = select.get(0);
			EssayExample ee = new EssayExample();
			org.meiling.entity.EssayExample.Criteria cc = ee.createCriteria();
			cc.andCIdEqualTo(classifyId);
			List<Essay> selectByExample = essayMapper.selectByExample(ee);
			for (Essay essay : selectByExample) {
				essay.setcId(classify.getcId());
				essayMapper.updateByPrimaryKey(essay);
			}
		}
		classifyMapper.deleteByPrimaryKey(classifyId);
		
	}

	@Override
	public void addClassify(Classify classify) {
		classifyMapper.insert(classify);
	}

	@Override
	public void updateClassify(Classify classify) {
		classifyMapper.updateByPrimaryKeySelective(classify);
	}

	@Override
	public Classify findClassifyByName(String getcName) {
		ClassifyExample example = new ClassifyExample();
		example.createCriteria().andCNameEqualTo(getcName);
		List<Classify> selectByExample = classifyMapper.selectByExample(example);
		if (selectByExample!=null&&selectByExample.size()>0) {
			return selectByExample.get(0);
		}
		return null;
	}

}
