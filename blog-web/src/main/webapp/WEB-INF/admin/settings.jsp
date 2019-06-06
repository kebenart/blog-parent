<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>系统设置</title>
		<link href="${pageContext.request.contextPath}/js/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
	    
	    <!-- Font Awesome -->
	    <link href="${pageContext.request.contextPath}/js/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/css/style2.css" rel="stylesheet">
		   <!-- Custom Theme Style -->
	    <link href="${pageContext.request.contextPath}/css/custom.min.css" rel="stylesheet">
	    <!-- file input -->
	     <link rel="stylesheet" href="${pageContext.request.contextPath}/js/fileinput/css/fileinput.css" type="text/css" />
	    <style type="text/css">
	  	.menuItemColor{background-color:#272C35}
	  </style>
		
	</head>
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
        <!-- /top navigation -->









        <!-- page content -->
        <div class="right_col" role="main">
        	<div class="row"  style="width: 1500px;">
			<div class="col-sm-12">
				<h4 class="page-title">系统设置</h4>
			</div>
			<div class="col-md-6">
		        <div class="panel panel  panel-pink">
		            <div class="panel-heading"  style="background-color:#6E8CD7;height:50px">
		                <h3 class="panel-title"  style="color:#FFFFFF;">站点设置</h3>
		            </div>
		            <div class="panel-body">
		                <form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/admin/updateZD.action" enctype="multipart/form-data" method="post" id="global-form">
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">首页背景</label>
		                        <div class="col-md-9">
		                          <input id="background" name="background" type="file" class="file fileloading" autoReplace="true"  data-show-upload="false" data-allowed-file-extensions='["jpg","png","gif"]'>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">头像背景</label>
		                        <div class="col-md-9">
		                            <input id="headBack" name="headBack" type="file" class="file fileloading" autoReplace="true"  data-show-upload="false" data-allowed-file-extensions='["jpg","png","gif"]'>
		                        </div>
		                    </div>
		                    
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">网站名称</label>
		                        <div class="col-md-9">
		                            <input type="text" class="form-control" name="sTitle" id="sTitle" placeholder="网站名称"
		                                   value="${settings.sTitle}" required aria-required="true"/>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">网站描述</label>
		                        <div class="col-md-9">
		                            <input type="text" class="form-control" id="sRemark" name="sRemark" placeholder="网站描述"
		                                   value="${settings.sRemark}" required aria-required="true"/>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">qq号</label>
		                        <div class="col-md-9">
		                            <input type="text" class="form-control" id="sQq" name="sQq" placeholder="qq号"
		                                   value="${settings.sQq}" required aria-required="true"/>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">微信二维码</label>
		                        <div class="col-md-9">
		                            <input id="wxTwo" name="wxTwo" type="file" class="file fileloading" autoReplace="true"  data-show-upload="false" data-allowed-file-extensions='["jpg","png","gif"]'>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">微博号</label>
		                        <div class="col-md-9">
		                            <input type="text" class="form-control" id="sWeibo" name="sWeibo" placeholder="微博号"
		                                   value="${settings.sWeibo}" required aria-required="true"/>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">qq群</label>
		                        <div class="col-md-9">
		                            <input type="text" class="form-control" id="sQqs" name="sQqs" placeholder="qq群"
		                                   value="${settings.sQqs}" required aria-required="true"/>
		                        </div>
		                    </div>
		
		                    <div class="clearfix pull-right">
		                        <button type="button" class="btn btn-primary waves-effect waves-light" onclick="saveZD()">
		                            保存设置
		                        </button>
		                    </div>
		                </form>
		            </div>
		        </div>
		    </div>
		
		    <div class="col-md-6">
		        <div class="panel panel  panel-pink">
		            <div class="panel-heading"  style="background-color:#6E8CD7;height:50px">
		                <h3 class="panel-title"  style="color:#FFFFFF;">高级设置</h3>
		            </div>
		            <div class="panel-body">
		                <form class="form-horizontal" action="${pageContext.request.contextPath}/admin/updateGJ.action" enctype="multipart/form-data" method="post" role="form" id="advanced-form">
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">博主名称</label>
		                        <div class="col-md-9">
		                            <input type="text" class="form-control" id="sName" name="sName" value="${settings.sName}" placeholder="博主名称"/>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">博主描述</label>
		                        <div class="col-md-9">
		                            <input type="text" class="form-control" id="sHeadremark" name="sHeadremark" value="${settings.sHeadremark}" placeholder="博主描述"/>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">支付宝收款二维码</label>
		                        <div class="col-md-9">
		                            <input id="alipayBuy" name="alipayBuy" type="file" class="file fileloading" autoReplace="true"  data-show-upload="false" data-allowed-file-extensions='["jpg","png","gif"]'>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">微信收款二维码</label>
		                        <div class="col-md-9">
		                            <input id="wxBuy" name="wxBuy" type="file" class="file fileloading" autoReplace="true"  data-show-upload="false" data-allowed-file-extensions='["jpg","png","gif"]'>
		                        </div>
		                    </div>
		                     <div class="form-group">
		                        <label class="col-md-3 control-label">头像</label>
		                        <div class="col-md-9">
		                             <input id="headImg" name="headImg" type="file" class="file fileloading" autoReplace="true"  data-show-upload="false" data-allowed-file-extensions='["jpg","png","gif"]'>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">黑名单IP列表</label>
		                        <div class="col-md-9">
		                            <textarea rows="3" class="form-control" name="sHmd" id="sHmd"
		                                      placeholder="请输入黑名单IP，如：123.123.33.23,123.123.33.24">${settings.sHmd}</textarea>
		                        </div>
		                    </div>
		
		                    
		                   
		                    <div class="clearfix pull-right">
		                        <button type="button" class="btn btn-primary waves-effect waves-light" onclick="saveAdvanced()">
		                            保存设置
		                        </button>
		                    </div>
		                </form>
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
   
    <script src="${pageContext.request.contextPath}/js/fileinput/js/fileinput.js"></script>
	
	<!--配置中文，但是没有汉化成功，只能在配置里重写-->
	<script src="${pageContext.request.contextPath}/js/fileinput/js/locales/zh.js"></script>
	
		<script type="text/javascript">
				function saveZD(){
					document.forms[0].submit();
				}
				
				function saveGJ(){
					document.forms[1].submit();
				}
				$(function(){
					$("#menuList li:eq(5)").addClass("active");
					
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