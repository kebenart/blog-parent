package org.meiling.service;

import java.util.List;

import org.meiling.entity.Label;

public interface LabelService {
	//添加标签
	public void addLabel(Label label);
	
	//根据标签名称查找标签
	public Label findLabelByLName(String lName);
	
	//删除标签
	public void deleteLabelById(String labelId);
	
	//统计标签下文章个数
	public int countLabelByEssayId(String labelId);
	
	//根据文章id查询该文章所有标签
	public List<Label> findLabelByEssayId(String essayId);
	
	//查询所有标签
	public List<Label> findAllLabel();
	
	//删除文章与标签的关联
	public void deleteEssayLabel(String essayId);
	
	//文章和标签添加关联
	public void addEssayLabel(String essayId,String labelId);
}
