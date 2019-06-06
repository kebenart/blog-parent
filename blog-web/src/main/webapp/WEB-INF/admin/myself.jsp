<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>个人设置</title>
		<link href="${pageContext.request.contextPath}/js/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
	    
	    <!-- Font Awesome -->
	    <link href="${pageContext.request.contextPath}/js/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/css/style2.css" rel="stylesheet">
		   <!-- Custom Theme Style -->
	    <link href="${pageContext.request.contextPath}/css/custom.min.css" rel="stylesheet">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/limonte-sweetalert2/6.4.1/sweetalert2.min.css">
	    <style type="text/css">
	  	.menuItemColor{background-color:#272C35}
	  </style>
		<script src="${pageContext.request.contextPath}/js/jquery/dist/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/bootstrap/dist/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/limonte-sweetalert2/6.4.1/sweetalert2.min.js"></script>
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
        <!-- page content -->
        <div class="right_col" role="main">
        	<div class="row"  style="width: 1500px;">
			<div class="col-sm-12">
				<h4 class="page-title">个人设置</h4>
			</div>
			<div class="col-md-6">
		        <div class="panel panel  panel-pink">
		            <div class="panel-heading"  style="background-color:#337AB7;height:50px">
		                <h3 class="panel-title" style="color:#FFFFFF;">个人信息</h3>
		            </div>
		            <div class="panel-body">
		                <form class="form-horizontal" action="${pageContext.request.contextPath}/admin/reviseName.action" method="post" role="form" id="user-form">
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">账号</label>
		                        <div class="col-md-9">
		                        	<input type="hidden" value="${sessionScope.SYS_ADMIN.id}" id="adminId" name="adminId"/>
		                            <input type="text"  class="form-control" value="${sessionScope.SYS_ADMIN.account}" readonly disabled/>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">姓名</label>
		                        <div class="col-md-9">
		                            <input type="text" class="form-control" id="newName" name="newName" placeholder="输入您的姓名"
		                                   value="${SYS_ADMIN.name}" required aria-required="true"/>
		                        </div>
		                    </div>
		                                                                                                                
		                    <div class="clearfix pull-right">
		                        <button type="button" class="btn btn-primary waves-effect waves-light" onclick="setName()">
		                         	保存信息
		                        </button>
		                    </div>
		                </form>
		                <script type="text/javascript">
		                	function setName(){
		                		var name = $("#newName").val();
		                		if(name.length<1){
		                			swal({  
							            title: '温馨提示',
							            type: "info",
							            text: "昵称不能为空！",  
							            confirmButtonText: '确认',  
							            confirmButtonColor: '#3085D6', 
							            timer: 3000
							        })
		                		}else{
		                			document.forms[0].submit();
		                		}
		                	}
		                </script>
		            </div>
		        </div>
		    </div>
		    <div class="col-md-6">
		        <div class="panel panel  panel-pink">
		            <div class="panel-heading"  style="background-color:#D9534F;height:50px">
		                <h3 class="panel-title" style="color:#FFFFFF;">修改密码</h3>
		            </div>
		            <div class="panel-body">
		                <form class="form-horizontal" action="${pageContext.request.contextPath}/admin/revisePwd.action" role="form" id="pwd-form">
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">输入旧密码</label>
		                        <div class="col-md-9">
		                        	<input type="hidden" value="${sessionScope.SYS_ADMIN.id}" id="adminId" name="adminId"/>
		                            <input type="password" id="oldpassword" class="form-control" name="oldpassword" required
		                                   aria-required="true"/><font color="red" size="10px"><span id="oldError"></span></font>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">输入新密码</label>
		                        <div class="col-md-9">
		                            <input type="password" name="newpassword" id="newpassword" class="form-control" required
		                                   aria-required="true" rangelength="[6,14]"/>
		                                  <font color="red" size="10px"><span id="newError"></span></font>
		                        </div>
		                    </div>
		                    <div class="form-group">
		                        <label class="col-md-3 control-label">确认新密码</label>
		                        <div class="col-md-9">
		                            <input type="password" name="repassword" id="repassword" class="form-control" equalTo="#password1"/>
		                        	<font color="red" size="10px"><span id="reError"></span></font>
		                        </div>
		                    </div>
		                    <div class="clearfix pull-right">
		                        <button type="button" onclick="setPwd()" class="btn btn-danger waves-effect waves-light">
		                            	设置密码
		                        </button>
		                    </div>
		                </form>
		            </div>
		            <script type="text/javascript">
						function setPwd(){
	                		var flag = true;
	                		flag = validataOld();
	                		flag = validataNew();
	                		flag = validataRe();
	                		if(flag){
	                			document.forms[1].submit();
	                		}
	                	}
						
						function validataOld(){
							var oldpassword = $("#oldpassword").val();
							if(oldpassword.length<1){
	                			$("#oldError").text("旧密码不能为空");
	                			return false;
	                		}
							var url = "${pageContext.request.contextPath}/admin/ajaxPwd.action";
							var data = {"pwd":oldpassword};
							$.post(url,data,function(msg){
								if(msg=="true"){
									return true;
								}else{
									$("#oldError").text("旧密码输入错误");
									return false;
								}
							});
						}
						
						function validataNew(){
							var newpassword = $("#newpassword").val();
							if(newpassword.length<1){
	                			$("#newError").text("新密码不能为空");
								return false;
	                		}
							return true;
						}
						
						function validataRe(){
							var newpassword = $("#newpassword").val();
							var repassword = $("#repassword").val();
							if(newpassword!=repassword){
	                			$("#reError").text("两次输入不一致");
								return false;
	                		}
							return true;
						}
						
						$(function(){
							$("#oldpassword").blur(function(){
								validataOld();
							});
							$("#newpassword").blur(function(){
								validataNew();
							});
							$("#repassword").blur(function(){
								validataRe();
							});
						});
						
						/* swal({  
				            title: '温馨提示',
				            type: "info",
				            text: "新密码不能为空！",  
				            confirmButtonText: '确认',  
				            confirmButtonColor: '#3085D6', 
				            timer: 3000
				        }) */
		            </script>
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
					var v = null;
					//$("li a span:not(:empty)").each(function(){alert($(this).text());});
					$("#firstItem").addClass("active");
					
					$("li").mouseup(function(){
							var vv = $(this);
							if(v==null){
								$("#firstItem").css("background-color","#2F353F");
								v =vv;
							}
							if(v.text()==vv.text()){
							 			vv.css("background-color","#272C35");
							}else{
									v.css("background-color","#2F353F");
									v=vv;
							}
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