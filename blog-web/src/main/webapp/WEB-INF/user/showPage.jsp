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
		<title>${requestScope.page.pName}</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sinaFaceAndEffec.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/limonte-sweetalert2/6.4.1/sweetalert2.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/jquery.tagsinput/src/jquery.tagsinput.css">
		
		 <!--引入样式文件-->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/editor.md/css/editormd.min.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/js/editor.md/css/editormd.preview.css" />

		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/editor.md/examples/css/style.css" />
		
		
        <!--引入js文件-->
       	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery.tagsinput/src/jquery.tagsinput.js"></script>
		<script src="${pageContext.request.contextPath}/js/limonte-sweetalert2/6.4.1/sweetalert2.min.js"></script>
		
		
		
        <script src="${pageContext.request.contextPath}/js/editor.md/examples/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/editor.md/lib/marked.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/editor.md/lib/prettify.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/editor.md/lib/raphael.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/editor.md/lib/underscore.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/editor.md/lib/sequence-diagram.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/editor.md/lib/flowchart.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/editor.md/lib/jquery.flowchart.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/editor.md/src/editormd.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/sinaFaceAndEffec.js"></script>
	</head>
	<style type="text/css">
		a{ text-decoration:none;}
	</style>
	
	
	<body>
		<center>
			<div style="width:810px;border:1px solid #D6D6D6;background-color:#FFFFFF;box-shadow: 1px 1px 1px #D;;padding:5px;">
				<div style="width:800px; ">
				<input type="hidden" id="pId" value="${requestScope.page.pId }"/>
				<span style=" line-height:2.6;font: '黑体';font-size:22px;color:#000000">${requestScope.page.pName}</span><br/>
				<span style=" line-height:1.6;font-size:12px;color:#5F5F5F">发布于  <fmt:formatDate value="${requestScope.page.pCreatetime}" pattern="yyyy-MM-dd"/></span>
				
				<br/>
					<!--在该div中展示,如有初始化的数据可以放在textarea中-->
				    <div id="testEditorMdview" style="padding:0px">
				        <textarea id="appendTest">&nbsp;&nbsp;${requestScope.page.pContent}</textarea>
				    </div>
				<br/>
				</div>
			</div>
		</center>
	</body>
		<style type="text/css">
			p,ul,li{margin:0px;padding:0px;list-style:none;}
			.father .clear {
				margin:0;
				padding:0;
				border:0;
				clear:both;
				}
		</style>
		<script>
		$(function(){
			 //转换开始,第一个参数是上面的div的id
	        editormd.markdownToHTML("testEditorMdview", {
	            htmlDecode: "style,script,iframe", //可以过滤标签解码
	            emoji: true,
	            taskList:true,
	            tex: true,               // 默认不解析
	            flowChart:true,         // 默认不解析
	            sequenceDiagram:true,  // 默认不解析
	        });
		});
		
	</script>
</html>