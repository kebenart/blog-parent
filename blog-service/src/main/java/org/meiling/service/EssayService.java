package org.meiling.service;

import java.util.List;

import org.meiling.entity.Classify;
import org.meiling.entity.Essay;
import org.meiling.util.PageResult;

public interface EssayService {
	//添加文章
	public void addEssay(Essay essay);
	
	//修改文章
	public void updateEssay(Essay essay);
	
	//删除文章
	public void deleteEssay(String essayId);
	
	//保存为草稿
	public void roughEssay(Essay essay);
	
	//更改文章状态		发布	草稿
	public void updateEssayState(String essayId,String state);
	
	//根据文章id查询分类
	public Classify findClassifyByEssayId(String essayId);
	

	//统计该分类下所有文章总数
	public int countEssayByClassifyId(String classifyId);
	
	//获取该分类下所有文章总数
	public List<Essay> findEssaysByClassifyId(String classifyId);
	
	//获取该分类下所有文章总数
	public List<Essay> findEssaysByLabelId(String labelId);
	
	//查看文章
	public Essay findEssayById(String essayId);
	
	//添加浏览量
	public void addViewSize(String essayId);
	
	//查询所有文章
	public List<Essay> findEssays();
	
	//分页查询文章
	public PageResult findPaginationAll(int thisPage,int pageSize);
	
	//查询最新的10文章
	public List<Essay> findTopNew();
	
	//查询访问最多的10文章
	public List<Essay> findTopView();
	
	//更新浏览量
	public void updatePageView(String essayId);
	
	//搜索文章
	public PageResult searchEssay(String keyword,int thisPage);
}
