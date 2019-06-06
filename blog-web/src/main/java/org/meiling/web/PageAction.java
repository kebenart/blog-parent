package org.meiling.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.meiling.entity.Admin;
import org.meiling.entity.Classify;
import org.meiling.entity.Discuss;
import org.meiling.entity.Essay;
import org.meiling.entity.Good;
import org.meiling.entity.Label;
import org.meiling.entity.Page;
import org.meiling.entity.Settings;
import org.meiling.entity.Total;
import org.meiling.service.ClassifyService;
import org.meiling.service.DiscussService;
import org.meiling.service.EssayService;
import org.meiling.service.GoodService;
import org.meiling.service.LabelService;
import org.meiling.service.PageService;
import org.meiling.service.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageAction {
	@Autowired
	private SettingsService settingsService;
	@Autowired
	private EssayService essayService;
	@Autowired
	private ClassifyService classifyService;
	@Autowired
	private LabelService labelService;
	@Autowired
	private DiscussService discussService;
	@Autowired
	private GoodService goodService;
	@Autowired
	private PageService pageService;
	
	//前台管理页面
	@RequestMapping("/user/page/{path}")
	public String viewManager(@PathVariable String path){
		return "user/"+path;
	}
	
	@RequestMapping("/admin/toLogin")
	public String toLogin(){
		return "admin/login";
	}

	@RequestMapping("/user/index")
	public String index(HttpServletRequest request){
		Settings settings = settingsService.findFirst();
		List<Essay> newTopEssays = essayService.findTopNew();
		List<Essay> viewTopEssays = essayService.findTopView();
		Total totalSurvey = settingsService.totalSurvey();
		List<Essay> essays = essayService.findEssays();
		List<Classify> classifys = classifyService.findAllClassifys();
		List<Label> labels = labelService.findAllLabel();
		List<Discuss> discusss = discussService.findTopNew();
		List<Page> pages = pageService.findAllPages();
		//初始化首页数据
		request.setAttribute("settings",settings);
		request.setAttribute("newTopEssays",newTopEssays);
		request.setAttribute("viewTopEssays",viewTopEssays);
		request.setAttribute("totalSurvey",totalSurvey);
		request.setAttribute("essays",essays);
		request.setAttribute("classifys",classifys);
		request.setAttribute("labels",labels);
		request.setAttribute("discusss",discusss);
		request.setAttribute("pages",pages);
		return "user/main";
	}
	
	@RequestMapping("/user/showEssaysByClassify")
	public String showEssaysByClassify(HttpServletRequest request,String cId){
		Settings settings = settingsService.findFirst();
		List<Essay> newTopEssays = essayService.findTopNew();
		List<Essay> viewTopEssays = essayService.findTopView();
		Total totalSurvey = settingsService.totalSurvey();
		List<Essay> essays = essayService.findEssaysByClassifyId(cId);
		List<Classify> classifys = classifyService.findAllClassifys();
		List<Label> labels = labelService.findAllLabel();
		List<Discuss> discusss = discussService.findTopNew();
		List<Page> pages = pageService.findAllPages();
		//初始化首页数据
		request.setAttribute("settings",settings);
		request.setAttribute("newTopEssays",newTopEssays);
		request.setAttribute("viewTopEssays",viewTopEssays);
		request.setAttribute("totalSurvey",totalSurvey);
		request.setAttribute("essays",essays);
		request.setAttribute("classifys",classifys);
		request.setAttribute("labels",labels);
		request.setAttribute("discusss",discusss);
		request.setAttribute("pages",pages);
		return "user/main";
	}
	
	@RequestMapping("/user/showEssaysByLabel")
	public String showEssaysByLabel(HttpSession session,HttpServletRequest request,String lId){
		String realPath = session.getServletContext().getRealPath("").replaceAll("\\\\","/");
		System.out.println(realPath+"=================");
		Settings settings = settingsService.findFirst();
		List<Essay> newTopEssays = essayService.findTopNew();
		List<Essay> viewTopEssays = essayService.findTopView();
		Total totalSurvey = settingsService.totalSurvey();
		List<Essay> essays = essayService.findEssaysByLabelId(lId);
		List<Classify> classifys = classifyService.findAllClassifys();
		List<Label> labels = labelService.findAllLabel();
		List<Discuss> discusss = discussService.findTopNew();
		List<Page> pages = pageService.findAllPages();
		//初始化首页数据
		request.setAttribute("settings",settings);
		request.setAttribute("newTopEssays",newTopEssays);
		request.setAttribute("viewTopEssays",viewTopEssays);
		request.setAttribute("totalSurvey",totalSurvey);
		request.setAttribute("essays",essays);
		request.setAttribute("classifys",classifys);
		request.setAttribute("labels",labels);
		request.setAttribute("discusss",discusss);
		request.setAttribute("pages",pages);
		return "user/main";
	}
	
	//加载仪表盘数据
	@RequestMapping("/admin/appearance")
	public String  loadAppearance(HttpServletRequest request){
		Map<String,Object> map = new HashMap<String,Object>();
		List<Essay> newTopEssays = essayService.findTopNew();
		Total totalSurvey = settingsService.totalSurvey();
		List<Discuss> discusss = discussService.findTopNew();
		List<Good> goods = goodService.findTopNew();
		map.put("goodSize",goodService.totalAllGoods());
		map.put("newTopEssays",newTopEssays);
		map.put("totalSurvey",totalSurvey);
		map.put("discusss",discusss);
		map.put("goods",goods);
		request.setAttribute("map",map);
		return "admin/appearance";
	}
	
	
	//加载页面数据
	@RequestMapping("/admin/pageManager")
	public String  pageManager(HttpServletRequest request){
		List<Page> pages = pageService.findAllPages();
		request.setAttribute("pages",pages);
		return "admin/pageManager";
	}
	
	//查看/预览页面
	@RequestMapping({"/user/showPage","/admin/showPage"})
	public String showPage(HttpServletRequest request,String path){
		Page page = pageService.findPageByPath(path);
		request.setAttribute("page",page);
		return "user/showPage";
	}
	
	//保存页面
	@RequestMapping("/admin/pageSave")
	public void savePage(HttpServletResponse response,HttpSession session,Page page) throws IOException{
		Admin ad = (Admin) session.getAttribute("SYS_ADMIN");
		if (ad.getName()!=null&&StringUtils.isNotBlank(ad.getName())) {
			page.setpName(ad.getName());
		}else{
			page.setpName(ad.getAccount());
		}
		page.setpId(UUID.randomUUID().toString().replaceAll("-",""));
		page.setpCreatetime(new Date());
		pageService.addPage(page);
		response.getWriter().write("true");
	}
	
	//跳转编辑页面
	@RequestMapping("/admin/toPageUpdate")
	public String toPageUpdate(HttpServletRequest request,String pageId){
		Page page = pageService.findPageById(pageId);
		request.setAttribute("page",page);
		System.out.println(page);
		return "admin/updatePage";
	}
	//更新为发布页面
	@RequestMapping("/admin/updatePage")
	public void updateSend(HttpServletResponse response,Page page) throws IOException{
		pageService.updatePage(page);
		response.getWriter().write("true");
		
	}
	
	//删除页面
	@RequestMapping("/admin/deletePage")
	public String deletePage(HttpServletRequest request,String pageId){
		pageService.deletePageById(pageId);
		return pageManager(request);
		
	}
	
}
