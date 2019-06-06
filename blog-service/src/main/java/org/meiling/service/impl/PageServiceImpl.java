package org.meiling.service.impl;

import java.util.List;

import org.meiling.dao.PageMapper;
import org.meiling.entity.Page;
import org.meiling.entity.PageExample;
import org.meiling.entity.PageExample.Criteria;
import org.meiling.service.PageService;
import org.meiling.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class PageServiceImpl implements PageService{
	@Autowired
	private PageMapper pageMapper;

	@Override
	public void addPage(Page page) {
		pageMapper.insert(page);
	}

	@Override
	public void deletePageById(String pageId) {
		pageMapper.deleteByPrimaryKey(pageId);
	}

	@Override
	public Page findPageById(String pageId) {
		PageExample pe = new PageExample();
		Criteria createCriteria = pe.createCriteria();
		createCriteria.andPIdEqualTo(pageId);
		createCriteria.andPStateEqualTo(Page.PAGE_STATE_SEND);
		return pageMapper.selectByPrimaryKey(pageId);
	}

	@Override
	public void updatePage(Page page) {
		pageMapper.updateByPrimaryKeyWithBLOBs(page);
	}

	@Override
	public void roughPage(Page page) {
		pageMapper.insert(page);
	}

	@Override
	public void updatePageState(String pageId, String state) {
		Page selectByPrimaryKey = pageMapper.selectByPrimaryKey(pageId);
		selectByPrimaryKey.setpState(state);
		pageMapper.updateByPrimaryKeySelective(selectByPrimaryKey);
	}

	@Override
	public List<Page> findAllPages() {
		List<Page> selectByExample = pageMapper.selectByExampleWithBLOBs(new PageExample());
		if (selectByExample!=null && selectByExample.size()>0) {
			return selectByExample;
		}
		return null;
	}

	@Override
	public PageResult findPaginationAll(int thisPage,int pageSize) {
		PageHelper.startPage(thisPage, pageSize);
		PageExample pageExample = new PageExample();
		List<Page> selectByExample = pageMapper.selectByExampleWithBLOBs(pageExample);
		PageResult pageResult = new PageResult();
		pageResult.setRows(selectByExample);
		PageInfo<Page> info = new PageInfo<>(selectByExample);
		pageResult.setTotal(((Long)info.getTotal()).intValue());
		pageResult.setPage(thisPage);
		pageResult.setPageSize(pageSize);
		pageResult.setTotalPage(pageResult.getTotal()%pageResult.getPageSize() == 0 ? pageResult.getTotal()/pageResult.getPageSize():pageResult.getTotal()/pageResult.getPageSize()+1);
		return pageResult;
	}

	@Override
	public Page findPageByPath(String path) {
		PageExample example = new PageExample();
		example.createCriteria().andPPathEqualTo(path);
		List<Page> selectByExampleWithBLOBs = pageMapper.selectByExampleWithBLOBs(example);
		if (selectByExampleWithBLOBs!=null&&selectByExampleWithBLOBs.size()>0) {
			return selectByExampleWithBLOBs.get(0);
		}
		return null;
	}

}
