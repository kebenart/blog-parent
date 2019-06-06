<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>分类/标签管理</title>
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
    <!-- Bootstrap -->
    <script src="${pageContext.request.contextPath}/js/bootstrap/dist/js/bootstrap.min.js"></script>


    <script src="${pageContext.request.contextPath}/js/custom.js"></script>
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
										<ul id="qtItem" class="nav side_menu">
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
				<h4 class="page-title">分类/标签管理</h4>
			</div>
			<div class="col-md-6" style="border:0">
		        <div class="panel panel  panel-pink">
		            <div class="panel-heading" style="background-color:#6E8CD7;height:50px">
		                <h1 class="panel-title" style="color:#FFFFFF;">分类列表</h1>
		            </div>
		            <div class="panel-body">
		            	<c:forEach items="${requestScope.classifys}" var="classify">
		            		<c:if test="${classify.cName =='默认分类'}">
	            				<div class="btn-group m-b-10">
				                    <button type="button" class="btn btn-purple waves-effect waves-light">${classify.cName}</button>
				                </div>
		            		</c:if>
		            		<c:if test="${classify.cName !='默认分类'}">
		            			<div class="btn-group m-b-10">
				                    <button type="button" class="btn btn-inverse dropdown-toggle waves-effect waves-light"
				                            data-toggle="dropdown" aria-expanded="false">${classify.cName}<span class="caret"></span></button>
				                    <ul class="dropdown-menu" role="menu">
				                        <li onclick="updateClassify('${classify.cId}')"><a href="javascript:void(0)" mid="5" cname="aaa" class="edit-category">修改</a>
				                        </li>
				                        <li  onclick="deleteClassify('${classify.cId}')"><a href="javascript:void(0)" mid="5" class="del-category">删除</a></li>
				                    </ul>
				                </div>
		            		</c:if>
		            	</c:forEach>  
		            </div>
		        </div>
		    </div>
		    <script type="text/javascript">
		    	function updateClassify(cId){
		    		swal({  
			            title: '修改分类',  
			            confirmButtonText: '修改',  
			            confirmButtonColor: '#3085D6',
			            cancelButtonText: '取消', 
			            cancelButtonColor: '#AAAAAA',
			            input: 'text',
			            inputValidator: function(value) {  
			                return new Promise(function(resolve, reject) {  
			                    if(value) {  
			                        resolve();  
			                    } else {  
			                        reject('至少要输入一个值哦！');  
			                    }  
			                });  
			            }  
			        }).then(function(result) {
			        	var url = "${pageContext.request.contextPath}/admin/updateClassify.action";
			        	var data={
			        			"cId":cId,
			        			"cName":result
			        	};
			        	$.post(url,data,function(msg){
			        		if(msg=="true"){
			        			swal({  
						            title: '温馨提示',
						            type: "success",
						            text: "修改成功！",  
						            confirmButtonText: '确认',  
						            confirmButtonColor: '#3085D6', 
						            timer: 3000
						        })
						       location.onload();
			        		}else{
			        			swal({  
						            title: '温馨提示',
						            type: "error",
						            text: "该分类已存在！",  
						            confirmButtonText: '确认',  
						            confirmButtonColor: '#3085D6', 
						            timer: 3000
						        })
			        		}
			        	});
			        });  
		    	}
		    	
		    	function deleteClassify(cId){
		    		var url = "${pageContext.request.contextPath}/admin/deleteClassify.action";
		        	var data={
		        			"classifyId":cId
		        	};
		        	$.post(url,data,function(msg){
		        		if(msg=="true"){
		        			swal({  
					            title: '温馨提示',
					            type: "success",
					            text: "删除成功！",  
					            confirmButtonText: '确认',  
					            confirmButtonColor: '#3085D6', 
					            timer: 3000
					        })
					       location.onload();
		        		}else{
		        			swal({  
					            title: '温馨提示',
					            type: "error",
					            text: "删除失败！",  
					            confirmButtonText: '确认',  
					            confirmButtonColor: '#3085D6', 
					            timer: 3000
					        })
		        		}
		        	});
		    	}
		    </script>
		
		    <div class="col-md-6">
		        <div class="panel  panel-pink">
		            <div class="panel-heading" style="background-color:#EC407A;height:50px">
		                <h1 class="panel-title" style="color:#FFFFFF;">标签列表</h1>
		            </div>
		            <div class="panel-body">
		                
		                <c:forEach items="${requestScope.labels}" var="label">
		                	<div class="btn-group m-b-10">
			                    <button type="button" class="btn btn-warning dropdown-toggle waves-effect waves-light"
			                            data-toggle="dropdown" aria-expanded="false">${label.lName}<span
			                            class="caret"></span></button>
			                    <ul class="dropdown-menu" role="menu">
			                        <li><a href="${pageContext.request.contextPath}/admin/deleteLabel.action?labelId=${label.lId}" mid="4" class="del-category">删除</a></li>
			                    </ul>
			                </div>
		                </c:forEach>
		            </div>
		        </div>
		    </div>
		
		    <div class="col-md-12">
		        <div class="panel panel-default">
		            <div class="panel-body">
		                <form id="cform" class="form-inline" role="form">
		                    <input type="hidden" id="mid"/>
		                    <div class="form-group">
		                        <input type="text" class="form-control" id="cname" placeholder="请输入分类名称">
		                    </div>
		                    <button id="save-category-btn" type="button" onclick="saveClassify()"
		                            class="btn btn-success waves-effect waves-light m-l-10">保存分类
		                    </button>
		                </form>
		            </div>
		        </div>
		    </div>
		</div>
		<script>
				function saveClassify(){
					var classifyName = $("#cname").val();
					var url = "${pageContext.request.contextPath}/admin/addClassify.action";
					var data = {
							"classifyName":classifyName
					};
					$.post(url,data,function(msg){
						if(msg=="true"){
							swal({  
					            title: '温馨提示',
					            type: "success",
					            text: "保存成功！",  
					            confirmButtonText: '确认',  
					            confirmButtonColor: '#3085D6', 
					            timer: 3000
					        })
					        location.reload();
						}else{
							swal({  
					            title: '温馨提示',
					            type: "error",
					            text: "保存失败！",  
					            confirmButtonText: '确认',  
					            confirmButtonColor: '#3085D6', 
					            timer: 3000
					        })
						}
					});
				}
		
				$(function(){
					$(".btn-group").find("button").each(function(){
						var randomColor = getRandomColor();
						$(this).css("background-color",randomColor).css("border","1px solid "+randomColor).css("color","#FFFFFF");
					});
				});
			  //随机颜色
			  var getRandomColor = function(){
			  return  '#' +    
				(function(color){    
				return (color +=  '0123456789abcdef'[Math.floor(Math.random()*16)])    
				  && (color.length == 6) ?  color : arguments.callee(color);    
			  })('');    
			} 
		</script>
        </div>
        
        </div>
      
      </div>
    </div>


	
		<script type="text/javascript">
		
				$(function(){
					$("#menuList li:eq(4)").addClass("active");
					$("#qtItem li:eq(1) a").css("color","#FFFFFF");
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