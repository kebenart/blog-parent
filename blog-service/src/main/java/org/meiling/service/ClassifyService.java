package org.meiling.service;

import java.util.List;

import org.meiling.entity.Classify;

public interface ClassifyService {
	 //查询所有分类
	public List<Classify> findAllClassifys();
	
	//删除分类
	public void deleteClassifyById(String classifyId);
	
	//添加分类
	public void addClassify(Classify classify);
	
	//修改分类
	public void updateClassify(Classify classify);

	//根据分类名称查找分类
	public Classify findClassifyByName(String getcName);
}
