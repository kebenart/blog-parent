package org.meiling.web;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.meiling.entity.Admin;
import org.meiling.entity.Discuss;
import org.meiling.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DiscussAction {
	@Autowired
	private DiscussService discussService;
	
	//加载评论管理页面数据
	@RequestMapping("/admin/commentManager")
	public  String discussManager(HttpServletRequest request){
		List<Discuss> discusss = discussService.findAll();
		request.setAttribute("discusss",discusss);
		return "admin/commentManager";
	}
	
	//回复评论
	@RequestMapping(value={"/user/ajaxDiscussManager","/admin/ajaxDiscussManager"})
	public void replyDiscuss(HttpServletResponse response,HttpSession session,Discuss discuss) throws IOException{
		Discuss d = discussService.findDiscussById(discuss.getdPid());
		discuss.seteId(d.geteId());
		discuss.setdLevel(d.getdLevel()+1);
		discuss.setdId(UUID.randomUUID().toString().replaceAll("-",""));
		discuss.setdTime(new Date());
		Admin ad = (Admin) session.getAttribute("SYS_ADMIN");
		if (ad.getName()!=null&&StringUtils.isNotBlank(ad.getName())) {
			discuss.setdName(ad.getName());
		}else{
			discuss.setdName(ad.getAccount());
		}
		discussService.replyDiscuss(discuss);
		response.getWriter().write("true");
	}
	
	//删除评论
	@RequestMapping("/admin/deleteDiscuss")
	public String deleteDiscuss(HttpServletRequest request,String discussId){
		deleteLoopDiscuss(discussId);
		return discussManager(request);
	}
	
	//添加评论
	@RequestMapping("/user/addDiscuss")
	public void addDiscuss(HttpServletResponse response,Discuss discuss) throws IOException{
		discuss.setdId(UUID.randomUUID().toString().replaceAll("-",""));
		System.out.println(discuss.geteId());
		discuss.setdLevel((long)1);
		discuss.setdTime(new Date());
		discussService.addDiscuss(discuss);
		response.getWriter().write("true");
	}
	
	
	//删除评论并删除该评论下的所有子评论
	public void deleteLoopDiscuss(String discussId){
		Discuss discuss = discussService.findDiscussById(discussId);
		List<Discuss> discusss = discussService.findDiscussByParentId(discussId);
		if (discusss!=null) {
			for (Discuss d : discusss) {
				deleteLoopDiscuss(d.getdId());
			}
		}else{
			discussService.deleteDiscussById(discussId);
		}
	}
	
}
