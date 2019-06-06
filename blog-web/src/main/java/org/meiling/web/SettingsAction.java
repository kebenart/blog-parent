package org.meiling.web;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.meiling.entity.Settings;
import org.meiling.service.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
@RequestMapping("/admin")
public class SettingsAction {
	@Autowired
	private SettingsService settingsService;
	
	//加载设置页面数据
	@RequestMapping("/settings")
	public String settingsManager(HttpServletRequest request){
		Settings settings = settingsService.findFirst();
		request.setAttribute("settings",settings);
		return "admin/settings";
	}
	
	//保存站点设置
	@RequestMapping("/updateZD")
	public String updateZD(HttpServletRequest request,HttpSession session,@RequestParam("background") CommonsMultipartFile background,@RequestParam("headBack") CommonsMultipartFile headBack,@RequestParam("wxTwo") CommonsMultipartFile wxTwo,Settings settings) throws IOException{
		String realPath = session.getServletContext().getRealPath("").replaceAll("\\\\","/");
		String path = realPath+"/upload/";
		if (background!=null&&background.getSize()>0) {
			String backgroundName = UUID.randomUUID().toString().replaceAll("-","")+background.getOriginalFilename().substring(background.getOriginalFilename().lastIndexOf("."),background.getOriginalFilename().length());
			File newFile=new File(path,backgroundName); 
			if(!newFile.exists()){
				newFile.mkdirs();
				}
	        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
	        background.transferTo(newFile);
	        settings.setsBgimg(backgroundName);
		}
		if (headBack!=null&&headBack.getSize()>0) {
			String headBackName = UUID.randomUUID().toString().replaceAll("-","")+headBack.getOriginalFilename().substring(headBack.getOriginalFilename().lastIndexOf("."),headBack.getOriginalFilename().length());
			File newFile=new File(path,headBackName);
			if(!newFile.exists()){
				newFile.mkdirs();
				}
	        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
	        headBack.transferTo(newFile);
	        settings.setsHeadimgbg(headBackName);
		}
		if (wxTwo!=null&&wxTwo.getSize()>0) {
			String wxTwoName = UUID.randomUUID().toString().replaceAll("-","")+wxTwo.getOriginalFilename().substring(wxTwo.getOriginalFilename().lastIndexOf("."),wxTwo.getOriginalFilename().length());
			
			File newFile=new File(path,wxTwoName);
			if(!newFile.exists()){
				newFile.mkdirs();
				}
	        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
	        wxTwo.transferTo(newFile);
			settings.setsMywx(wxTwoName);
		}
		Settings findFirst = settingsService.findFirst();
		settings.setsId(findFirst.getsId());
		settingsService.save(settings);
		return settingsManager(request);
	}
	
	//保存高级设置
	@RequestMapping("/updateGJ")
	public String updateGJ(HttpServletRequest request,HttpSession session,@RequestParam("headImg") CommonsMultipartFile headImg,@RequestParam("alipayBuy") CommonsMultipartFile alipayBuy,@RequestParam("wxBuy") CommonsMultipartFile wxBuy,Settings settings) throws IOException{
		String realPath = session.getServletContext().getRealPath("").replaceAll("\\\\","/");
		String path = realPath+"/upload/";
		if (headImg!=null&&headImg.getSize()>0) {
			String headImgName = UUID.randomUUID().toString().replaceAll("-","")+headImg.getOriginalFilename().substring(headImg.getOriginalFilename().lastIndexOf("."),headImg.getOriginalFilename().length());
			File newFile=new File(path,headImgName);
			if(!newFile.exists()){
				newFile.mkdirs();
				}
	        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
	        headImg.transferTo(newFile);
	        settings.setsHeadimg(headImgName);
		}
		if (alipayBuy!=null&&alipayBuy.getSize()>0) {
			String alipayBuyName = UUID.randomUUID().toString().replaceAll("-","")+headImg.getOriginalFilename().substring(headImg.getOriginalFilename().lastIndexOf("."),headImg.getOriginalFilename().length());
			
			File newFile=new File(path,alipayBuyName);
			if(!newFile.exists()){
				newFile.mkdirs();
				}
	        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
	        alipayBuy.transferTo(newFile);
	        settings.setsZfbpay(alipayBuyName);
		}
		if (wxBuy!=null&&wxBuy.getSize()>0) {
			String wxBuyName = UUID.randomUUID().toString().replaceAll("-","")+wxBuy.getOriginalFilename().substring(wxBuy.getOriginalFilename().lastIndexOf("."),wxBuy.getOriginalFilename().length());

			File newFile=new File(path,wxBuyName);
			if(!newFile.exists()){
				newFile.mkdirs();
				}
	        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
	        wxBuy.transferTo(newFile);
	        settings.setsWxpay(wxBuyName);
		}
		Settings findFirst = settingsService.findFirst();
		settings.setsId(findFirst.getsId());
		settingsService.save(settings);
		return settingsManager(request);
	}

}
