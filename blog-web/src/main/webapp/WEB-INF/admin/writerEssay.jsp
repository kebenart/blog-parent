<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>发布文章</title>
		<link href="${pageContext.request.contextPath}/js/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
	    
	    <!-- Font Awesome -->
	    <link href="${pageContext.request.contextPath}/js/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/css/style2.css" rel="stylesheet">
		   <!-- Custom Theme Style -->
	    <link href="${pageContext.request.contextPath}/css/custom.min.css" rel="stylesheet">
	    <style type="text/css">
	  	.menuItemColor{background-color:#272C35}
	  </style>
		<!--标签插件-->
    	 <link rel="stylesheet" href="${pageContext.request.contextPath}/js/jquery.tagsinput/src/jquery.tagsinput.css"/>
		
		<!-- markdown编辑器	editor.md-->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/editor.md/css/editormd.min.css"/>
		
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/limonte-sweetalert2/6.4.1/sweetalert2.min.css">
		<style rel="stylesheet" type="text/css">
    #tags_tagsinput {
        background-color: #fafafa;
        border: 1px solid #eeeeee;
    }

    #tags_addTag input {
        width: 100%;
    }

    #tags_addTag {
        margin-top: -5px;
    }

    .mditor .editor{
        font-size: 14px;
        font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    }
    .mditor .backdrop, .mditor .textarea, .mditor .viewer{
        font-size: 14px;
    }
    .markdown-body{
        font-size: 14px;
    }
    .note-toolbar {
        text-align: center;
    }

    .note-editor.note-frame {
        border: none;
    }

    .note-editor .note-toolbar {
        background-color: #f5f5f5;
        padding-bottom: 10px;
    }

    .note-toolbar .note-btn-group {
        margin: 0;
    }

    .note-toolbar .note-btn {
        border: none;
    }

    #articleForm #dropzone {
        min-height: 200px;
        background-color: #dbdde0;
        line-height:200px;
        margin-bottom: 10px;
    }
    #articleForm .dropzone {
        border: 1px dashed #8662c6;
        border-radius: 5px;
        background: white;
    }
    #articleForm .dropzone .dz-message {
        font-weight: 400;
    }
    #articleForm .dropzone .dz-message .note {
        font-size: 0.8em;
        font-weight: 200;
        display: block;
        margin-top: 1.4rem;
    }
    
    a:visited{text-decoration: none;}
    
    input, textarea, keygen, select, button, meter, progress {
    -webkit-writing-mode: horizontal-tb;
	}
	
	#parentBtn{
				width: 50px;
				height: 20px;
				position: relative;
			}
			#childBtn{
				
				width: 18px;
				height: 18px;
				position: absolute;
				background: white;
			}
			.open1{
				background-color:#32B46A;
			}
			.open2{
				top: 1px;
				right: 1px;
				bottom:1px;
			}
			.close1{
				background-color: #B3B3B3;
				border-left: transparent;
			}
			.close2{
				left: 1px;
				top: 1px;
				
			}
			
			.openSpan{padding-right:20px}
			.closeSpan{padding-left:20px}
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
        <!-- page content -->
        <div class="right_col" role="main">
        	<div class="row"  style="width: 1000px;">
			<div class="col-sm-12">
				<h4 class="page-title">发布文章</h4>
			</div>
			<form id="articleForm">
				<div class="form-group col-md-6" style="padding: 0 10px 0 30px;">
					<input class="form-control" placeholder="请输入文章标题(必须)" id="eTitle" name="eTitle" required value=""/>
				</div>
				
				<div class="form-group col-md-6" style="padding: 0 10px 0 30px;">
					<input  id="tags" class="form-control" placeholder="请输入文章标签" name="tags"/>
				</div>
				<div class="form-group col-md-6" style="padding: 0 10px 0 30px;">
	                <select id="select"  class="form-control" data-placeholder="请选择分类...">
	                   <c:forEach items="${requestScope.classifys}" var="classify">
	                   		<option name="cId" value="${classify.cId}">${classify.cName}</option>
	                   </c:forEach>
					 </select>
           		</div>
            	<div class="clearfix"></div>
	
            	<div class="form-group col-xs-12">
                	<div class="pull-right">
                    	<a id="switch-btn" href="javascript:qhEditor();"  style="background-color:#8662C5;padding:5px 10px;border:1px solid #8662C5;box-shadow:0 1px 1px 1px #654B93;border-radius: 2px;color:#FFFFFF" >
                        	切换为富文本编辑器</a>
                	</div>
            	</div>
            	
            	<div id="html-container" class="form-group col-md-12" style="padding:0 10px 0 30px" >
            		 <div class="editormd"  id="test-editormd">
					    <textarea class="editormd-markdown-textarea" name="eContent" id="editormd"></textarea>
					    <textarea class="editormd-html-textarea" id="editorhtml"></textarea>       
					 </div>
				</div>
				
            	<div class="form-group col-md-3 col-sm-4" style="padding:0 10px 0 30px" >
	                <label class="col-sm-4">开启评论</label>
	                <div id="parentBtn" class="open1">
						<span id="fff" class="openSpan" style="font-size:12px;color:#FFFFFF;margin:2px">开启</span>
					    <div id="childBtn" class="open2"></div>
					</div>
           		</div>
           		 <div class="clearfix"></div>

            <div class="text-right">
                <a class="btn btn-default waves-effect waves-light" href="javascript:returnList();">返回列表</a>
                <button type="button" class="btn btn-primary waves-effect waves-light" onclick="save('0');">
                    保存文章
                </button>
                <button type="button" class="btn btn-warning waves-effect waves-light" onclick="save('1');">
                    存为草稿
                </button>
            </div>
			</form>
		</div>
	
		<script src="${pageContext.request.contextPath}/js/jquery/dist/jquery.min.js"></script>
		    <!-- Bootstrap -->
	    <script src="${pageContext.request.contextPath}/js/bootstrap/dist/js/bootstrap.min.js"></script>
	    <script src="${pageContext.request.contextPath}/js/custom.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.tagsinput/src/jquery.tagsinput.js"></script>
		<script src="${pageContext.request.contextPath}/js/editor.md/editormd.min.js"></script>
		<!--按照官网上的说明，js和css的这两个引用应该放在body的末尾-->
        <script src="http://cdn.bootcss.com/wangeditor/2.1.20/js/wangEditor.js"></script>
         <link href="http://cdn.bootcss.com/wangeditor/2.1.20/css/wangEditor.css" rel="stylesheet">
         <!-- html转markdown工具-->
		<script src="https://unpkg.com/turndown/dist/turndown.js"></script>	
		<script src="${pageContext.request.contextPath}/js/limonte-sweetalert2/6.4.1/sweetalert2.min.js"></script>
	<script type="text/javascript">
			var f = true;
			var testEditor =null;
  			var turndownService = new TurndownService()
  		    var editor = null;
  			function save(state){
  				var eContent =null;
  				if(f){
  	  				eContent = testEditor.getMarkdown();
  				}else{
  					var val = $("#textarea1").html();
  					eContent = turndownService.turndown(val);
  				}
  				var eTitle = $("#eTitle").val();
  				var isSay = "0";
  				var tags = $("#tags").val();
  				var cId = $("#select option:selected").val();
		        //标题不能为空
		        if(eTitle.length<1){
		        	swal({  
			            title: '温馨提示',
			            type: "info",
			            text: "标题不能为空！",  
			            confirmButtonText: '确认',  
			            confirmButtonColor: '#3085D6', 
			            timer: 3000
			        })
			        return;
		        }
  				if(eContent.length<1){
  					swal({  
			            title: '温馨提示',
			            type: "info",
			            text: "内容不能为空！",  
			            confirmButtonText: '确认',  
			            confirmButtonColor: '#3085D6', 
			            timer: 3000
			        })
			        return;
  				}
  				//设置是否开启评论  open1 close1
  				var is = $("#parentBtn").attr("class");
		        if(is=="open1"){
		        	isSay="0";
		        }else{
		        	isSay="1";
		        }
		        var htmlString="";
		        if(f){
  	  				htmlString = testEditor.getHTML();
  				}else{
  					var val = $("#textarea1").html();
  					htmlString = val;
  				}
		        var url = "${pageContext.request.contextPath}/admin/save.action";
		        var data = {
		        			"cId":cId,
		        			"eTitle":eTitle,
		        			"eContent":eContent,
		        			"tags":tags,
		        			"eIssay":isSay,
		        			"eState":state,
		        			"htmlString":htmlString
		        			};
		        $.post(url,data,function(msg){
		        	if(msg=="true"){
		        		if(state=="0"){
				        	swal({  
					            title: '温馨提示',
					            type: "success",
					            text: "发布成功！",  
					            confirmButtonText: '确认',  
					            confirmButtonColor: '#3085D6', 
					            timer: 3000
					        })
				        }else{
				        	swal({  
					            title: '温馨提示',
					            type: "success",
					            text: "草稿保存成功！",  
					            confirmButtonText: '确认',  
					            confirmButtonColor: '#3085D6', 
					            timer: 3000
					        })
				        }
		        		location.href="${pageContext.request.contextPath}/admin/essayManager.action";
		        	}
		        });
			}

		$(function(){
			$("#tags").tagsInput({width:'auto',placeholderColor:'#999999'});
			$("#tags_tagsinput").css("border","1px solid #C3C3C3");
			testEditor=editormd("test-editormd", {
		           width   : "100%",
		           height  : 500,
		           //markdown : md,
		           codeFold : true,
		           syncScrolling : "single",
		           delay:10,//延迟预览
		           //你的lib目录的路径
		           path    : "${pageContext.request.contextPath}/js/editor.md/lib/",
		           imageUpload: false,//关闭图片上传功能
		          /*  theme: "dark",//工具栏主题
		           previewTheme: "dark",//预览主题
		           editorTheme: "pastel-on-dark",//编辑主题 */
		           emoji: false,
			       //htmlDecode :true,//解析html标签
		           taskList: true, 
		           tocm: true,         // Using [TOCM]
		           tex: true,                   // 开启科学公式TeX语言支持，默认关闭
		           flowChart: true,             // 开启流程图支持，默认关闭
		           sequenceDiagram: true,       // 开启时序/序列图支持，默认关闭,
		          //这个配置在simple.html中并没有，但是为了能够提交表单，使用这个配置可以让构造出来的HTML代码直接在第二个隐藏的textarea域中，方便post提交表单。
		           saveHTMLToTextarea : true            
		     });
		     $("#childBtn").click(function(){
					setTaggle();
			});
		});
		
		function setTaggle(){
			var parentBtn = $("#parentBtn");
			var childBtn = $("#childBtn");
			var fff = $("#fff");
			var pClass = parentBtn.attr("class");
			var cClass = childBtn.attr("class");
			if(pClass=="close1"){
				parentBtn.attr("class","open1");
				childBtn.attr("class","open2");
			}else{
				parentBtn.attr("class","close1");
				childBtn.attr("class","close2");
			}
			var newPClass = parentBtn.attr("class");
			
			if(newPClass=="open1"){
				fff.attr("class","openSpan");
				fff.text("开启");
				return true;
			}else{
				fff.attr("class","closeSpan");
				fff.text("关闭");
				return false;
			}
		}
			//切换编辑器
		  function qhEditor(){
				if(f){
					var v = testEditor.getHTML();
					$("#test-editormd").remove();
					f=false;
					testEditor=null;
					
					//加载wangEditor富文本编辑器
					$("#html-container").append('<div id="textarea1" style="height:500px" name="eContent"></div>');
						
						editor = new wangEditor('textarea1');
						 // 表情面板可以有多个 tab ，因此要配置成一个数组。数组每个元素代表一个 tab 的配置
					     editor.config.emotions = {
					         'default': {
					            title: '默认',
					            data: '${pageContext.request.contextPath}/json/looks.json'
					        }
					    };
                 		editor.create()
						$("#textarea1").html(v);
					$("#switch-btn").text("切换为Markdown编辑器");
				}else{
					var val = $("#textarea1").html();
					$("div.wangEditor-container").remove();
					$("#html-container").append('<div class="editormd"  id="test-editormd"><textarea class="editormd-markdown-textarea" name="test-editormd-markdown-doc" id="editormd"></textarea><textarea class="editormd-html-textarea" name="eContent" id="editorhtml"></textarea></div>');
					f=true;
					 testEditor=editormd("test-editormd", {
			           width   : "100%",
			           height  : 500,
			           //markdown : md,
			           codeFold : true,
			           syncScrolling : "single",
			           delay:10,//延迟预览
			           //你的lib目录的路径
			           path    : "${pageContext.request.contextPath}/js/editor.md/lib/",
			           imageUpload: false,//关闭图片上传功能
			          /*  theme: "dark",//工具栏主题
			           previewTheme: "dark",//预览主题
			           editorTheme: "pastel-on-dark",//编辑主题 */
			           emoji: false,
			           //htmlDecode :true,//解析html标签
			           taskList: true, 
			           tocm: true,         // Using [TOCM]
			           tex: true,                   // 开启科学公式TeX语言支持，默认关闭
			           flowChart: true,             // 开启流程图支持，默认关闭
			           sequenceDiagram: true,       // 开启时序/序列图支持，默认关闭,
			          //这个配置在simple.html中并没有，但是为了能够提交表单，使用这个配置可以让构造出来的HTML代码直接在第二个隐藏的textarea域中，方便post提交表单。
			           saveHTMLToTextarea : true            
			      });
			      	$("#switch-btn").text("切换为富文本编辑器");
			      	//html转markdown
			      	var markdown = turndownService.turndown(val)
			      	//alert(markdown);
			      $("#editormd").text(markdown);
			      $("#editorhtml").text(val);
			   		
			      	//testEditor.watch();//开启实时预览
				}
		}
		
		function returnList(){
			location.href="${pageContext.request.contextPath}/admin/essayManager.action";
			$('.active',window.parent.document).css("background","#2F353F");
			$('.active',window.parent.document).removeClass("active");
			$("#essayManager",window.parent.document).addClass("active");
		}
		
		$(function(){
			//$("li a span:not(:empty)").each(function(){alert($(this).text());});
			$("#menuList li:eq(1)").addClass("active");
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
	
	    </div>
        
        </div>
      
      </div>
    </div>
		
  </body>
	
</html>
