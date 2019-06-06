package org.meiling.service.impl;

import java.util.List;

import org.meiling.dao.ClassifyMapper;
import org.meiling.dao.EssayLabelMapper;
import org.meiling.dao.EssayMapper;
import org.meiling.dao.LabelMapper;
import org.meiling.entity.Classify;
import org.meiling.entity.Essay;
import org.meiling.entity.EssayExample;
import org.meiling.entity.EssayExample.Criteria;
import org.meiling.entity.EssayLabelExample;
import org.meiling.entity.EssayLabelKey;
import org.meiling.service.EssayService;
import org.meiling.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class EssayServiceImpl implements EssayService{
	@Autowired
	private EssayMapper essayMapper;
	
	@Autowired
	private LabelMapper labelMapper;
	
	@Autowired
	private EssayLabelMapper essayLabelMapper;
	
	@Autowired
	private ClassifyMapper classifyMapper;
	
	@Override
	public void addEssay(Essay essay) {
		essay.seteState(Essay.ESSAY_STATE_SEND);
		essayMapper.insert(essay);
	}

	@Override
	public void updateEssay(Essay essay) {
		essayMapper.updateByPrimaryKeyWithBLOBs(essay);
	}

	@Override
	public void deleteEssay(String essayId) {
		essayMapper.deleteByPrimaryKey(essayId);
	}

	@Override
	public void roughEssay(Essay essay) {
		essay.seteState(Essay.ESSAY_STATE_ROUGH);
		essayMapper.insert(essay);
	}

	@Override
	public void updateEssayState(String essayId, String state) {
		Essay essay = new Essay();
		essay.seteId(essayId);
		essay.seteState(state);
		essayMapper.updateByPrimaryKeySelective(essay);
	}

	@Override
	public Classify findClassifyByEssayId(String essayId) {
		EssayExample essayExample = new EssayExample();
		Essay e = essayMapper.selectByPrimaryKey(essayId);
		return classifyMapper.selectByPrimaryKey(e.getcId());
	}

	@Override
	public int countEssayByClassifyId(String classifyId) {
		EssayExample ee = new EssayExample();
		Criteria createCriteria = ee.createCriteria();
		createCriteria.andCIdEqualTo(classifyId);
		int countByExample = essayMapper.countByExample(ee);
		return countByExample;
	}

	@Override
	public Essay findEssayById(String essayId) {
		return essayMapper.selectByPrimaryKey(essayId);
	}

	@Override
	public List<Essay> findEssays() {
		EssayExample ee = new EssayExample();
		ee.setOrderByClause("e_createtime DESC");
		List<Essay> selectByExample = essayMapper.selectByExampleWithBLOBs(ee);
		if (selectByExample!=null&&selectByExample.size()>0) {
			return selectByExample;
		}
		return null;
	}
	
	@Override
	public void updatePageView(String essayId) {
		Essay selectByPrimaryKey = essayMapper.selectByPrimaryKey(essayId);
		int v = selectByPrimaryKey.getePageview().intValue()+1;
		selectByPrimaryKey.setePageview((long)v);
	}

	@Override
	public PageResult findPaginationAll(int thisPage,int pageSize) {
		PageHelper.startPage(thisPage, pageSize);
		EssayExample example = new EssayExample();
		List<Essay> essays = essayMapper.selectByExample(example);
		int countByExample = essayMapper.countByExample(example);
		PageResult pageResult = new PageResult();
		pageResult.setRows(essays);
		pageResult.setTotal(countByExample);
		pageResult.setPage(thisPage);
		pageResult.setPageSize(pageSize);
		pageResult.setTotalPage(pageResult.getTotal()%pageResult.getPageSize() == 0 ? pageResult.getTotal()/pageResult.getPageSize():pageResult.getTotal()/pageResult.getPageSize()+1);
		return pageResult;
	}

	@Override
	public List<Essay> findTopNew() {
		PageHelper.startPage(1,5);
		EssayExample example = new EssayExample();
		example.setOrderByClause("e_createtime DESC");
		List<Essay> selectByExample = essayMapper.selectByExample(example);
		return selectByExample;
	}

	@Override
	public List<Essay> findTopView() {
		PageHelper.startPage(1,5);
		EssayExample example = new EssayExample();
		example.setOrderByClause("e_pageview DESC");
		List<Essay> selectByExample = essayMapper.selectByExample(example);
		return selectByExample;
	}

	//搜索文章
	@Override
	public PageResult searchEssay(String keyword,int thisPage) {
		if (thisPage<1) {
			thisPage = 1;
		}
		EssayExample example = new EssayExample();
		example.setOrderByClause("e_createtime DESC");
		Criteria criteria1 = example.createCriteria();
		criteria1.andETitleLike("%"+keyword+"%");
		
		Criteria criteria2 = example.createCriteria();
		criteria2.andEContentLike("%"+keyword+"%");
		example.or(criteria2);
		int countByExample = essayMapper.countByExample(example);
		List<Essay> selectByExampleWithBLOBs = essayMapper.selectByExampleWithBLOBs(example);
		PageResult pageResult = new PageResult();
		if (selectByExampleWithBLOBs==null||selectByExampleWithBLOBs.size()>1) {
			selectByExampleWithBLOBs=null;
		}
		pageResult.setRows(selectByExampleWithBLOBs);
		pageResult.setTotal(countByExample);
		pageResult.setPage(thisPage);
		pageResult.setPageSize(10);
		pageResult.setTotalPage(pageResult.getTotal()%pageResult.getPageSize() == 0 ? pageResult.getTotal()/pageResult.getPageSize():pageResult.getTotal()/pageResult.getPageSize()+1);
		return pageResult;
	}

	@Override
	public void addViewSize(String essayId) {
		Essay e = essayMapper.selectByPrimaryKey(essayId);
		if (e!=null) {
			if (e.getePageview()!=null) {
				e.setePageview(e.getePageview()+1);
			}else{
				e.setePageview((long)1);
			}
			essayMapper.updateByPrimaryKey(e);
		}
	}

	@Override
	public List<Essay> findEssaysByClassifyId(String classifyId) {
		EssayExample example = new EssayExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andCIdEqualTo(classifyId);
		List<Essay> selectByExampleWithBLOBs = essayMapper.selectByExampleWithBLOBs(example);
		return selectByExampleWithBLOBs;
	}

	@Override
	public List<Essay> findEssaysByLabelId(String labelId) {
		EssayLabelExample example = new EssayLabelExample();
		org.meiling.entity.EssayLabelExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andLIdEqualTo(labelId);
		List<EssayLabelKey> selectByExample = essayLabelMapper.selectByExample(example);
		for (EssayLabelKey essayLabelKey : selectByExample) {
			EssayExample exam = new EssayExample();
			Criteria createCriteria2 = exam.createCriteria();
			createCriteria2.andEIdEqualTo(essayLabelKey.geteId());
			List<Essay> selectByExampleWithBLOBs = essayMapper.selectByExampleWithBLOBs(exam);
			return selectByExampleWithBLOBs;
		}
		return null;
	}
	



}
