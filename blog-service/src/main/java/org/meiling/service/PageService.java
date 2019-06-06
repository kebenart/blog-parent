package org.meiling.service;

import java.util.List;

import org.meiling.entity.Page;
import org.meiling.util.PageResult;

public interface PageService {
	//添加页面
	public void addPage(Page page);
	//删除页面
	public void deletePageById(String pageId);
	//查看页面
	public Page findPageById(String pageId);
	//修改页面
	public void updatePage(Page page);
	
	//保存为草稿
	public void roughPage(Page page);
	
	//更改页面状态		草稿		发布
	public void updatePageState(String pageId,String state);
	
	//查询所有页面
	public List<Page> findAllPages();
	
	//分页查询所有页面
	public PageResult findPaginationAll(int thisPage,int pageSize);
	
	//根据地址查询文章
	public Page findPageByPath(String path);

}
