package org.meiling.service;

import java.util.List;

import org.meiling.entity.Good;

public interface GoodService {
	//点赞
	public void help(Good good);
	
	//取消赞	传参数 点赞人昵称
	public void cancelGood(Good good);
	
	//根据文章id统计该文章所有赞
	public int totalGoods(String essayId);
	
	//统计所有赞
	public int totalAllGoods();
	
	//获取最新的十条点赞消息
	public List<Good> findTopNew();
	
	public Good findGoodById(String essayId,String helper);
	
	//删除某文章的所有赞
	public void deleteGoods(String essayId);
	
}
