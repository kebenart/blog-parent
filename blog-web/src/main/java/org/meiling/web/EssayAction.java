package org.meiling.web;

import java.io.IOException;
import java.util.ArrayList;
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
import org.meiling.entity.Settings;
import org.meiling.service.ClassifyService;
import org.meiling.service.DiscussService;
import org.meiling.service.EssayService;
import org.meiling.service.GoodService;
import org.meiling.service.LabelService;
import org.meiling.service.SettingsService;
import org.meiling.util.BlogUtil;
import org.meiling.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EssayAction {
	@Autowired
	private EssayService essayService;
	@Autowired
	private ClassifyService classifyService;
	@Autowired
	private GoodService goodService;
	@Autowired
	private DiscussService discussService;
	@Autowired
	private SettingsService settingsService;
	@Autowired
	private LabelService labelService;
	
	//查看/预览文章
	@RequestMapping({"/user/showEssay","/admin/showEssay"})
	public String showEssay(HttpSession session,HttpServletRequest request,String essayId){
		essayService.addViewSize(essayId);
		Essay essay = essayService.findEssayById(essayId);
		Classify classify = null;
		List<Label> labels = null;
		List<Discuss> discusss = null;
		Settings settings = null;
		int goods = 0;
		String gooder = null;
		if (essay!=null) {
			classify = essayService.findClassifyByEssayId(essayId);
			labels = labelService.findLabelByEssayId(essayId);
			discusss = discussService.findAllDiscuss(essayId);
			if (discusss!=null) {
				discusss = tjDiscuss(discusss);
			}
			goods = goodService.totalGoods(essayId);
			settings = settingsService.findFirst();
			try {
				gooder = (String) session.getAttribute("USER_NAME");
				Good findGoodById = goodService.findGoodById(essayId,gooder);
				request.setAttribute("good",findGoodById);
			} catch (Exception e) {
				gooder = null;
				request.setAttribute("good",null);
			}
		}else{
			return "state/page_404";
		}
		request.setAttribute("essay",essay);
		request.setAttribute("classify", classify);
		request.setAttribute("labels", labels);
		request.setAttribute("goods", goods);
		request.setAttribute("settings", settings);
		request.setAttribute("discusss",discusss);
		return "user/content";
	}
	
	public List<Discuss> tjDiscuss(List<Discuss> discusss){
		List<Discuss> removeList = new ArrayList<Discuss>();
		for (Discuss discuss : discusss) {
			if (discuss.getdLevel()==1) {
				for (Discuss d : discusss) {
					if (d.getdPid()!=null) {
						if(d.getdPid().equals(discuss.getdId())){
							discuss.getChildDiscuss().add(d);
							removeList.add(d);
						}
					}
				}
			}
		}
		discusss.removeAll(removeList);
		return discusss;
	}

	//加载文章管理页面数据
	public @ResponseBody PageResult ajaxEssayManager(int page,int pageSize){
		if (page<1) {
			page = 1;
		}
		PageResult pageResult = essayService.findPaginationAll(page, pageSize);
		return pageResult;
	}
	
	//点赞
	@RequestMapping("/user/praise")
	public void praise(HttpSession session,HttpServletResponse response,String essayId,String praiser) throws IOException{
		session.setAttribute("USER_NAME",praiser);
		Good good = new Good();
		good.setGoodId(UUID.randomUUID().toString().replaceAll("-",""));
		good.seteId(essayId);
		good.setGoodName(praiser);
		good.setGoodDate(new Date());
		goodService.help(good);
		response.getWriter().write("true");
	}

	//跳转到添加文章页面
	@RequestMapping("/admin/writerEssay")
	public String addEssayPage(HttpServletRequest request){
		request.setAttribute("classifys",classifyService.findAllClassifys());
		return "admin/writerEssay";
	}
	
	//保存文章
	@RequestMapping("/admin/save")
	public void save(HttpServletResponse response,HttpSession session,Essay essay,String tags,String htmlString) throws IOException{
		essay.seteId(UUID.randomUUID().toString().replaceAll("-",""));
		essay.setePageview((long)0);
		Admin ad = (Admin) session.getAttribute("SYS_ADMIN");
		if (ad.getName()!=null&&StringUtils.isNotBlank(ad.getName())) {
			essay.setePromulgator(ad.getName());
		}else{
			essay.setePromulgator(ad.getAccount());
		}
		System.out.println(htmlString);
		if (htmlString!=null&&StringUtils.isNotBlank(htmlString)) {
			String topImgSrc = BlogUtil.getTopImgSrc(htmlString);
			System.out.println(topImgSrc+"==================================");
			if (topImgSrc!=null&&StringUtils.isNotBlank(topImgSrc)) {
				essay.setePhoto(topImgSrc);
			}
		}
		essay.seteCreatetime(new Date());
		essay.seteSettingtime(new Date());
		essayService.addEssay(essay);
		if (tags!=null&&StringUtils.isNotBlank(tags)) {
			String tag[] = tags.split(",");
			for (String s : tag) {
				Label label = labelService.findLabelByLName(s);
				if (label!=null) {
					labelService.addEssayLabel(essay.geteId(),label.getlId());
				}else{
					label = new Label();
					label.setlId(UUID.randomUUID().toString().replaceAll("-",""));
					label.setlName(s);
					labelService.addLabel(label);
					labelService.addEssayLabel(essay.geteId(),label.getlId());
				}
			}
		}
		response.getWriter().write("true");
	}
	
	//跳转到编辑页面
	@RequestMapping("/admin/toUpdatePage")
	public String toUpdatePage(HttpServletRequest request,String essayId){
		Essay essay = essayService.findEssayById(essayId);  
		Classify classify = null;
		List<Label> labels = null;
		String tags = "";
		if (essay!=null) {
			classify = essayService.findClassifyByEssayId(essayId);
			labels = labelService.findLabelByEssayId(essayId);
		}else{
			return "state/page_404";
		}
		for (Label label : labels) {
			tags+=label.getlName()+",";
			System.out.println(tags);
		}
		int index = tags.lastIndexOf(",");
		if (index!=-1) {
				tags = tags.substring(0,index);
		}
		request.setAttribute("essay",essay);
		request.setAttribute("classify",classify);
		request.setAttribute("labels",labels);
		request.setAttribute("tags",tags);
		System.out.println(tags);
		request.setAttribute("classifys",classifyService.findAllClassifys());
		return "admin/updateEssay";
	}
	
	//更新文章
	@RequestMapping("/admin/updateEssay")
	public void updateEssay(HttpServletResponse response,HttpSession session,Essay essay,String tags,String htmlString) throws IOException{
		System.out.println(essay.geteId());
		labelService.deleteEssayLabel(essay.geteId());
		Admin ad = (Admin) session.getAttribute("SYS_ADMIN");
		if (ad.getName()!=null&&StringUtils.isNotBlank(ad.getName())) {
			essay.setePromulgator(ad.getName());
		}else{
			essay.setePromulgator(ad.getAccount());
		}
		essay.seteSettingtime(new Date());
		if (htmlString!=null&&StringUtils.isNotBlank(htmlString)) {
			String topImgSrc = BlogUtil.getTopImgSrc(htmlString);
			System.out.println(topImgSrc+"==================================");
			if (topImgSrc!=null&&StringUtils.isNotBlank(topImgSrc)) {
				essay.setePhoto(topImgSrc);
			}
		}
		essayService.updateEssay(essay);
		if (tags!=null&&StringUtils.isNotBlank(tags)) {
			String tag[] = tags.split(",");
			for (String s : tag) {
				Label label = labelService.findLabelByLName(s);
				if (label!=null) {
					labelService.addEssayLabel(essay.geteId(),label.getlId());
				}else{
					label = new Label();
					label.setlId(UUID.randomUUID().toString().replaceAll("-",""));
					label.setlName(s);
					labelService.addLabel(label);
					labelService.addEssayLabel(essay.geteId(),label.getlId());
				}
			}
		}
		response.getWriter().write("true");
	}
	
	
	@RequestMapping("/admin/essayManager")
	public String  essayManager(HttpServletRequest request){
		List<Essay> findEssays = essayService.findEssays();
		request.setAttribute("essays",findEssays);
		Map<String,String> classifys = new HashMap<String,String>();
		List<Classify> findAllClassifys = classifyService.findAllClassifys();
		for (Classify classify : findAllClassifys) {
			classifys.put(classify.getcId(),classify.getcName());
		}
		request.setAttribute("classifys",classifys);
		return "admin/essayManager";
	}
	
	//删除文章
	@RequestMapping("/admin/deleteEssay")
	public String deleteEssay(HttpServletRequest request,String essayId){
		labelService.deleteEssayLabel(essayId);
		List<Label> labels = labelService.findAllLabel();
		if (labels!=null) {
			for (Label label : labels) {
				int count = labelService.countLabelByEssayId(label.getlId());
				if (count<1) {
					labelService.deleteLabelById(label.getlId());
				}
			}
		}
		goodService.deleteGoods(essayId);
		discussService.deleteDiscusss(essayId);
		essayService.deleteEssay(essayId);
		return essayManager(request);
	}
	
}
