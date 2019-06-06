package org.meiling.web;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.meiling.entity.Classify;
import org.meiling.service.ClassifyService;
import org.meiling.service.EssayService;
import org.meiling.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchAction {
	@Autowired
	private EssayService essayService;
	
	@Autowired
	private ClassifyService classifyService;
	
	@RequestMapping("/user/search")
	public String search(HttpServletRequest request,String keyword){
		PageResult pageResult = essayService.searchEssay(keyword,1);
		System.out.println(keyword);
		System.out.println(pageResult);
		List<Classify> findAllClassifys = classifyService.findAllClassifys();
		Map<String,String> classifyMap = new HashMap<String,String>();
		for (Classify classify : findAllClassifys) {
			classifyMap.put(classify.getcId(),classify.getcName());
		}
		request.setAttribute("keyword",keyword);
		request.setAttribute("pageResult",pageResult);
		request.setAttribute("classifyMap",classifyMap);
		return "user/searchShow";
	}

	@RequestMapping("/user/pageTurning")
	public String pageTurning(HttpServletRequest request,String keyword,int page) throws UnsupportedEncodingException{
		keyword = new String(keyword.getBytes("ISO8859-1"),"UTF-8");
		PageResult pageResult = essayService.searchEssay(keyword,1);
		System.out.println(keyword);
		System.out.println(pageResult);
		List<Classify> findAllClassifys = classifyService.findAllClassifys();
		Map<String,String> classifyMap = new HashMap<String,String>();
		for (Classify classify : findAllClassifys) {
			classifyMap.put(classify.getcId(),classify.getcName());
		}
		request.setAttribute("keyword",keyword);
		request.setAttribute("pageResult",pageResult);
		request.setAttribute("classifyMap",classifyMap);
		return "user/searchShow";
	}
	
	@RequestMapping("/user/searchHtml")
	public String searchHtml(){
		return "user/search";
	}
}
