package org.meiling.service.impl;

import java.util.List;

import org.meiling.dao.GoodMapper;
import org.meiling.entity.Good;
import org.meiling.entity.GoodExample;
import org.meiling.entity.GoodExample.Criteria;
import org.meiling.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl implements GoodService{
	@Autowired
	private GoodMapper goodMapper;

	@Override
	public void help(Good good) {
		goodMapper.insert(good);
	}

	@Override
	public void cancelGood(Good good) {
		Good g = findGoodById(good.geteId(),good.getGoodName());
		if (g!=null) {
			goodMapper.deleteByPrimaryKey(g.getGoodId());
		}
	}

	@Override
	public int totalGoods(String essayId) {
		GoodExample example = new GoodExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andEIdEqualTo(essayId);
		return goodMapper.countByExample(example);
	}

	@Override
	public List<Good> findTopNew() {
		GoodExample goodExample = new GoodExample();
		goodExample.setOrderByClause("good_date DESC");
		List<Good> selectByExample = goodMapper.selectByExample(goodExample);
		if (selectByExample!=null) {
			if (selectByExample.size()>10) {
				return selectByExample.subList(0,5);
			}else{
				return selectByExample;
			}
		}
		return null;
	}


	@Override
	public Good findGoodById(String essayId, String helper) {
		GoodExample ge = new GoodExample();
		Criteria createCriteria = ge.createCriteria();
		createCriteria.andEIdEqualTo(essayId);
		createCriteria.andGoodNameEqualTo(helper);
		List<Good> selectByExample = goodMapper.selectByExample(ge);
		if (selectByExample!=null&&selectByExample.size()>0) {
			return selectByExample.get(0);
		}
		return null;
	}

	@Override
	public int totalAllGoods() {
		GoodExample example = new GoodExample();
		int countByExample = goodMapper.countByExample(example);
		return countByExample;
	}

	@Override
	public void deleteGoods(String essayId) {
		GoodExample example = new GoodExample();
		example.createCriteria().andEIdEqualTo(essayId);
		goodMapper.deleteByExample(example);
	}

}
