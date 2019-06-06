package org.meiling.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.meiling.entity.Admin;
import org.meiling.entity.Settings;
import org.meiling.service.SettingsService;
import org.meiling.util.IpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class LoginFilter implements Filter{
	
	private SettingsService settingsService;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		ServletContext context = filterConfig.getServletContext(); 
		ApplicationContext ac = WebApplicationContextUtils .getWebApplicationContext(context); 
		settingsService = ac.getBean(SettingsService.class); 
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		Settings settings = (Settings) req.getSession().getAttribute("SYS_SETTINGS");
		if (settings == null) {
			settings = settingsService.findFirst();
			req.getSession().setAttribute("SYS_SETTINGS",settings);
		}
		if (settings.getsHmd()!=null&&StringUtils.isNotBlank(settings.getsHmd())) {
			
			if (settings.getsHmd().contains(IpUtils.getIpAddr(req))) {
				//若是黑名单用户则跳转到404页面
				resp.sendRedirect(req.getContextPath()+"/admin/aaaa");
			}
		}
		String url = req.getRequestURL().toString();
		if (url.contains("/admin/")) {
			if (url.contains("toLogin")) {
				chain.doFilter(request, response);
			}else if(url.contains("login")){
				chain.doFilter(request, response);
			}else{
				Admin admin = (Admin) req.getSession().getAttribute("SYS_ADMIN");
				if (admin!=null) {
					chain.doFilter(request, response);
				}else{
					resp.sendRedirect(req.getContextPath()+"/admin/toLogin.action");
				}
			}
		}else{
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		
	}

}
