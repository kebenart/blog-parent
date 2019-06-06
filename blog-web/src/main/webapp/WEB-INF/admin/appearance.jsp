<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>仪表盘</title>
		
    <link href="${pageContext.request.contextPath}/js/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/js/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/style2.css" rel="stylesheet">
	   <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/css/custom.min.css" rel="stylesheet">
    <style type="text/css">
  	.menuItemColor{background-color:#272C35}
  </style>
	</head>
	
	    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/js/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="${pageContext.request.contextPath}/js/bootstrap/dist/js/bootstrap.min.js"></script>


    <script src="${pageContext.request.contextPath}/js/custom.js"></script>
	 <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0; background:#FFFFFF">
              <a href="${pageContext.request.contextPath}/admin/appearance.action" class="site_title"><img src="${pageContext.request.contextPath}/images/headImg.png"style="margin-bottom: 20px;" height="60px" width="60px"/>&nbsp;&nbsp;<span style="color:#000000">Cat BLOG</span></a>
            </div>
            <div class="clearfix"></div>
            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                
                <ul id="menuList" class="nav side-menu" style="margin-top:0px;">
									<li id="firstItem">
										<a style="margin-bottom: 0px;padding-bottom:18px;"><i class="fa fa-tachometer" aria-hidden="true"></i>&nbsp;&nbsp;&nbsp;&nbsp;<span>仪表盘</span></a>
									</li>
									<li>
										<a style="margin-bottom: 0px;padding-bottom:18px;"><i class="fa fa-pencil-square-o"></i>&nbsp;&nbsp;&nbsp;&nbsp;<span>发布文章</span></a>
									</li>
									<li id="essayManager">
										<a style="margin-bottom: 0px;padding-bottom:18px;"><i class="fa fa-list"></i>&nbsp;&nbsp;&nbsp;&nbsp;<span>文章管理</span></a>
									</li>
									<li>
										<a style="margin-bottom: 0px;padding-bottom:18px;"><i class="fa fa-file-text"></i>&nbsp;&nbsp;&nbsp;&nbsp;<span>页面管理</span></a>
									</li>
									<li><a  style="margin-bottom: 0px;padding-bottom:18px;"><i class="fa fa-cubes"></i>&nbsp;&nbsp;&nbsp;&nbsp;<span>其他管理</span><span class="fa fa-plus md-add"></span></a>
										<ul id="qtItem" class="nav child_menu">
											<li><a href="javascript:void(0);" style="color:#75798B">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-comments"></i><span>评论管理</span></a></li>
											<li><a href="javascript:void(0);" style="color:#75798B">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-tags"></i><span>分类/标签</span></a></li>
										</ul>
									</li>
									<li>
										<a style="margin-bottom: 0px;padding-bottom:18px;"><i class="fa fa-gear"></i>&nbsp;&nbsp;&nbsp;&nbsp;<span>系统设置</span>
									</a>
                   
                  </li>
                </ul>
              </div>
             

            </div>
         
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="" id="rightLi" >
                  <a id="rightHeadImg" href="javascript:;" class="user-profile dropdown-toggle"  data-toggle="dropdown" aria-expanded="false">
                    <img src="${pageContext.request.contextPath}/images/img.jpg" style="width:50px; height:50px;" alt="">
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right" style="width:160px; height: 120px;border:1px solid #D6D6D6">
                    <li style="margin: 0px;"><a href="${pageContext.request.contextPath}/index.jsp"><i class="fa fa-eye"></i>&nbsp;&nbsp;<span>查看网站</span></a></li>
                    <li><a href="${pageContext.request.contextPath}/admin/myself.action"><i class="fa fa-sun-o"></i>&nbsp;&nbsp;<span>个人设置</span></a></li>
                    <li><a href="${pageContext.request.contextPath}/admin/exit.action"><i class="fa fa-sign-out"></i>&nbsp;&nbsp;<span>注销</span></a></li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>

        <!-- page content -->
        <div class="right_col" role="main">
		   <div class="row"  style="width: 900px;">
			<div class="col-sm-12">
				<h4 class="page-title">Cat仪表盘</h4>
			</div>
			<div class="row">
				<div class="col-sm-4 col-lg-2">
					<div class="mini-stat clearfix bx-shadow bg-info">
						<span class="mini-stat-icon">
							<i class="fa fa-quote-right" aria-hidden="true"></i>
						</span>
						<div class="mini-stat-info text-right">
							发表了
							<span>${requestScope.map["totalSurvey"].essaySize}</span>
							篇文章
						</div>
					</div>
				</div>
				<div class="col-sm-4 col-lg-2">
					<div class="mini-stat clearfix bx-shadow bg-purple">
						<span class="mini-stat-icon">
							<i class="fa fa-comments-o" aria-hidden="true"></i>
						</span>
						<div class="mini-stat-info text-right">
							收到了
							<span>${requestScope.map["totalSurvey"].discussSize}</span>
							条留言
						</div>
					</div>
				</div>
				<div class="col-sm-4 col-lg-2">
					<div class="mini-stat clearfix bx-shadow bg-red">
						<span class="mini-stat-icon">
							<i class="fa fa-thumbs-o-up" aria-hidden="true"></i>
						</span>
						<div class="mini-stat-info text-right">
							获得了
							<span>${requestScope.map["goodSize"]}</span>
							个赞
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">最新文章</h4>
						</div>
						<div class="panel-body">
							<ul class="list-group">
								<c:forEach items="${requestScope.map['newTopEssays']}" var="essay">
									<li style="padding: 12px 20px" class="list-group-item"><a target="_blank" href="${pageContext.request.contextPath}/admin/showEssay.action?essayId=${essay.eId}">${essay.eTitle}</a><span style="float:right"><fmt:formatDate value="${essay.eCreatetime}" pattern="MM-dd"/></span></li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">最新评论</h4>
						</div>
						<div class="panel-body">
							<ul class="list-group">
								<c:forEach items="${requestScope.map['discusss']}" var="discuss">
									<li style="padding: 12px 20px" class="list-group-item">
										${discuss.dName}<span style="color:#B1AEAE">&nbsp;于<fmt:formatDate value="${discuss.dTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
										<a target="_blank" href="${pageContext.request.contextPath}/admin/showEssay.action?essayId=${discuss.eId}"><p>${discuss.dContent}</p></a>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">最新点赞</h4>
						</div>
						<div class="panel-body">
							<ul class="list-group">
								<c:forEach items="${requestScope.map['goods']}" var="good">
									<li style="padding: 12px 20px" class="list-group-item">
										${good.goodName} 点了一个&nbsp;<i class="fa fa-thumbs-o-up" style="color:#29B6F6"aria-hidden="true"></i>!&nbsp;&nbsp;&nbsp;<span style="color:#B1AEAE"><fmt:formatDate value="${good.goodDate}" pattern="MM/dd HH:mm:ss"/></span>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	    </div>
        
        </div>
      
      </div>
    </div>

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/js/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="${pageContext.request.contextPath}/js/bootstrap/dist/js/bootstrap.min.js"></script>


    <script src="${pageContext.request.contextPath}/js/custom.js"></script>
	
		<script type="text/javascript">
		
				$(function(){
					//$("li a span:not(:empty)").each(function(){alert($(this).text());});
					$("#firstItem").addClass("active");
					$("li").mouseup(function(){
							var vv = $(this);
							var value = vv.find("span:first").text();
							if(contains(value,"仪表盘")){
								$(location).attr("href","${pageContext.request.contextPath}/admin/appearance.action");
							}else if(contains(value,"发布文章")){
								$(location).attr("href","${pageContext.request.contextPath}/admin/writerEssay.action");
							}else if(contains(value,"文章管理")){
								$(location).attr("href","${pageContext.request.contextPath}/admin/essayManager.action");
							}else if(contains(value,"页面管理")){
								$(location).attr("href","${pageContext.request.contextPath}/admin/pageManager.action");
							}else if(contains(value,"评论管理")){
								$(location).attr("href","${pageContext.request.contextPath}/admin/commentManager.action");
							}else if(contains(value,"分类/标签")){
								$(location).attr("href","${pageContext.request.contextPath}/admin/classAndLabelManager.action");
							}else if(contains(value,"系统设置")){
								$(location).attr("href","${pageContext.request.contextPath}/admin/settings.action");
							}
							if(contains(value,"其他管理")){
								$("#qtItem").css("background-color","#2F353F");
							}
					});
					
				});
				
				//判断父字符串是否包含子串
				function contains(parent,child){
					if(parent.indexOf(child)>=0){
						return true;
					}
					return false;
				}
				
				//跳转到个人设置
				function grSetting(){
					$("li.active").removeClass("active");
					$("#contentPage").attr("src","${pageContext.request.contextPath}/admin/myself.action");
					
				}
		</script>
  </body>
</html>
