package org.meiling.service;

import java.util.List;

import org.meiling.entity.Discuss;
import org.meiling.util.PageResult;

public interface DiscussService {
	//根据文章id查询所有评论 按照最新时间往下排名
	public List<Discuss> findAllDiscuss(String essayId);
	
	//查询所有文章的评论
	public List<Discuss> findAll();
	
	//查询所有文章的评论分页
	public PageResult findPaginationAll(int thisPage,int pageSize);
	
	//删除某文章所有评论
	public void deleteDiscusss(String essayId);
	//删除评论
	public void deleteDiscussById(String discussId);
	
	//根据评论id查询评论
	public Discuss findDiscussById(String discussId);
	
	//根据父ID查找评论
	public List<Discuss> findDiscussByParentId(String pId);
	
	//回复评论
	public void replyDiscuss(Discuss discuss);
	
	//评论
	public void addDiscuss(Discuss discuss);
	
	//查询最新的10条评论
	public List<Discuss> findTopNew();
}
