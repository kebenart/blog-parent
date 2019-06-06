package org.meiling.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.meiling.dao.EssayLabelMapper;
import org.meiling.dao.LabelMapper;
import org.meiling.entity.EssayLabelExample;
import org.meiling.entity.EssayLabelExample.Criteria;
import org.meiling.entity.EssayLabelKey;
import org.meiling.entity.Label;
import org.meiling.entity.LabelExample;
import org.meiling.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelServiceImpl implements LabelService{
	@Autowired
	private LabelMapper labelMapper;
	@Autowired
	private EssayLabelMapper elMapper;
	
	@Autowired
	private EssayLabelMapper essayLabelMapper;
	

	@Override
	public void addLabel(Label label) {
		labelMapper.insert(label);
	}

	@Override
	public void deleteLabelById(String labelId) {
		EssayLabelExample example = new EssayLabelExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andLIdEqualTo(labelId);
		essayLabelMapper.deleteByExample(example);
		labelMapper.deleteByPrimaryKey(labelId);
	}

	@Override
	public int countLabelByEssayId(String labelId) {
		EssayLabelExample ele = new EssayLabelExample();
		org.meiling.entity.EssayLabelExample.Criteria createCriteria = ele.createCriteria();
		createCriteria.andLIdEqualTo(labelId);
		return elMapper.countByExample(ele);
	}

	@Override
	public List<Label> findLabelByEssayId(String essayId) {
		EssayLabelExample ele = new EssayLabelExample();
		org.meiling.entity.EssayLabelExample.Criteria createCriteria = ele.createCriteria();
		createCriteria.andEIdEqualTo(essayId);
		List<EssayLabelKey> selectByExample = elMapper.selectByExample(ele);
		List<Label> list = new ArrayList<Label>();
		for (EssayLabelKey essayLabelKey : selectByExample) {
			list.add(labelMapper.selectByPrimaryKey(essayLabelKey.getlId()));
		}
		return list;
	}

	@Override
	public List<Label> findAllLabel() {
		LabelExample ex = new LabelExample();
		List<Label> labels = labelMapper.selectByExample(ex);
		if (labels!=null&&labels.size()>0) {
			return labels;
		}
		return null;
	}

	@Override
	public void deleteEssayLabel(String essayId) {
		List<Label> findLabelByEssayId = findLabelByEssayId(essayId);
		for (Label label : findLabelByEssayId) {
			EssayLabelKey essayLabelKey = new EssayLabelKey();
			essayLabelKey.seteId(essayId);
			essayLabelKey.setlId(label.getlId());
			essayLabelMapper.deleteByPrimaryKey(essayLabelKey);
		}
	}

	@Override
	public Label findLabelByLName(String lName) {
		LabelExample example = new LabelExample();
		example.createCriteria().andLNameEqualTo(lName);
		List<Label> labels = labelMapper.selectByExample(example);
		if (labels!=null&&labels.size()>0) {
			return labels.get(0);
		}
		return null;
	}

	@Override
	public void addEssayLabel(String essayId, String labelId) {
		EssayLabelKey essayLabelKey = new EssayLabelKey();
		essayLabelKey.seteId(essayId);
		essayLabelKey.setlId(labelId);
		essayLabelMapper.insert(essayLabelKey);
	}

}
