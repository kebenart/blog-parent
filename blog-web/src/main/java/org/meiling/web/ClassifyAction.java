package org.meiling.web;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.meiling.entity.Classify;
import org.meiling.entity.Label;
import org.meiling.service.ClassifyService;
import org.meiling.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassifyAction {
	@Autowired
	private ClassifyService classifyService;
	@Autowired
	private LabelService labelService;
	
	//加载分类/标签页面数据
	@RequestMapping("/admin/classAndLabelManager")
	public String classifyAndLabel(HttpServletRequest request){
		List<Classify> classifys = classifyService.findAllClassifys();
		List<Label> labels = labelService.findAllLabel();
		request.setAttribute("classifys",classifys);
		request.setAttribute("labels",labels);
		return "admin/classAndLabelManager";
	}
	
	//添加分类
	@RequestMapping("/admin/addClassify")
	public void addClassify(HttpServletResponse response,String classifyName) throws IOException{
		Classify findClassifyByName = classifyService.findClassifyByName(classifyName);
		if (findClassifyByName==null) {
			Classify classify = new Classify();
			classify.setcId(UUID.randomUUID().toString().replaceAll("-",""));
			classify.setcName(classifyName);
			classifyService.addClassify(classify);
			response.getWriter().write("true");
		}else{
			response.getWriter().write("false");
		}
		
	}
	
	//删除分类
	@RequestMapping("/admin/deleteClassify")
	public void deleteClassify(HttpServletResponse response,String classifyId) throws IOException{
		classifyService.deleteClassifyById(classifyId);
		response.getWriter().write("true");
		
	}
	
	//修改分类
	@RequestMapping("/admin/updateClassify")
	public void updateClassify(HttpServletResponse response,Classify classify) throws IOException{
		Classify c = classifyService.findClassifyByName(classify.getcName());
		if (c!=null) {
			response.getWriter().write("false");
		}else{
			classifyService.updateClassify(classify);
			response.getWriter().write("true");
		}
	}
	
	//添加标签
	@RequestMapping("/user/addLabel")
	public void addLabel(Label label){
		label.setlId(UUID.randomUUID().toString().replaceAll("-",""));
		labelService.addLabel(label);
	}
	
	//删除标签
	@RequestMapping("/admin/deleteLabel")
	public String deleteLabel(HttpServletRequest request,String labelId){
		labelService.deleteLabelById(labelId);
		return classifyAndLabel(request);
	}
	
}
