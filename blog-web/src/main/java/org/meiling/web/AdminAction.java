package org.meiling.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.meiling.entity.Admin;
import org.meiling.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminAction {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/login")
	public void login(HttpServletRequest request,HttpServletResponse response,HttpSession session,Admin admin) throws IOException{
		Admin login = adminService.login(admin);
		if (login!=null) {
			session.setAttribute("SYS_ADMIN",login);
			response.getWriter().write("true");
		}else{
			response.getWriter().write("false");
		}
	}
	
	@RequestMapping("/myself")
	public String myself(){
		return "admin/myself";
	}
	
	@RequestMapping("/reviseName")
	public String reviseName(String adminId,String newName){
		Admin admin = new Admin();
		admin.setId(adminId);
		admin.setName(newName);
		adminService.reviseName(admin);
		return myself();
	}
	
	@RequestMapping("/ajaxPwd")
	public void ajaxPwd(HttpServletResponse response,HttpSession session,String pwd) throws IOException{
		Admin admin = (Admin) session.getAttribute("SYS_ADMIN");
		if (!admin.getPassword().equals(pwd)) {
			response.getWriter().write("false");
		}else{
			response.getWriter().write("true");
		}
	}
	
	@RequestMapping("/revisePwd")
	public String revisePwd(HttpServletResponse response,HttpSession session,String adminId,String newpassword){
		Admin ad= (Admin) session.getAttribute("SYS_ADMIN");
		ad.getPassword();
		Admin admin = new Admin();
		admin.setId(adminId);
		admin.setPassword(newpassword);
		adminService.revisePwd(admin);
		return myself();
	}
	
	@RequestMapping("/exit")
	public String exit(HttpSession session){
		session.removeAttribute("SYS_ADMIN");
		return "redirect:/admin/toLogin.action";
	}
}
