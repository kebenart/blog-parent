<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>站内搜索</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/bootstrap/dist/css/bootstrap.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/search.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/js/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	</head>
	<body>
			<div id="content" style=" width: 800px;transform:translateY(-50%);top: 5%;position: relative;">
				<div class="input-group input-group-lg"> <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></span>
				  
				  <input type="text" id="keyword" name="keyword" class="form-control" value="${requestScope.keyword}" placeholder="输入关键词" aria-describedby="sizing-addon1">
				  <form action="${pageContext.request.contextPath}/user/search.action" method="post">
				  	<input type="hidden" name="keyword" value="${requestScope.keyword}" id="keywordHidden"/>
				  </form>
				  <span class="input-group-btn">
				  <button class="btn btn-default" type="button" onClick="submit()">站内搜索</button>
		   		  <button class="btn btn-default" type="button" onClick="window.open('http://www.baidu.com')">全网搜索</button>
				  </span>
				  <script type="text/javascript">
					function submit(){
						var value = $("#keyword").val();
						if(value.length==0){
							window.open("${pageContext.request.contextPath}/user/searchHtml.action");
						}else{
							$("#keywordHidden").val(value);
							document.forms[0].submit();
						}
					}
				</script>
				</div>
			</div>
		  	<div style="position:relative; top:3%;left:2.8%; width:800px;height:1200px">
				<div>
					<div>
						<span>为您找到相关结果${requestScope.pageResult.total}个</span>
					</div>
					<div class="bt"><a>默认</a></div>
					<div style="position:relative; top:10px;">
						<div style="margin-bottom:20px"></div>
						<c:if test="${not empty requestScope.pageResult.rows}">
							<c:forEach items="${requestScope.pageResult.rows}" var="essay">
								<div style="width:640px; margin-bottom:30px;">
									<a style="font-size:16px" href="${pageContext.request.contextPath}/user/showEssay.action?essayId=${essay.eId}">${essay.eTitle}</a><br/>
									<div style="height:75px; margin-top:5px">
										<div style="margin-right:10px; height:75px; float:left; margin-left:5px">
											<c:choose>
											 	<c:when test="${empty essay.ePhoto}">
											 		<img src="${pageContext.request.contextPath}/images/back.png"  width="120px" height="75px"/>
											 	</c:when>
											 	<c:otherwise>
											 		<img src="${pageContext.request.contextPath}/upload/${essay.sPhoto}" width="120px" height="75px">
											 	</c:otherwise>
											 </c:choose>
										</div>
										<div style="height:75px;">
											<div>
												<a href="${pageContext.request.contextPath}/user/showEssay.action?essayId=${essay.eId}">
												&nbsp;&nbsp;<c:if test="${fn:length(essay.eContent)>100 }">  
												  ${fn:substring(essay.eContent, 0, 100)}......  
												</c:if>  
												<c:if test="${fn:length(essay.eContent)<=100 }">  
												  ${essay.eContent}  
												</c:if>
												</a>
											</div>
											<div style="font-size:12px;float:left; color:#999;">来自：${requestScope.classifyMap[essay.cId]}&nbsp;&nbsp;作者：${essay.ePromulgator}&nbsp;&nbsp;发布：<fmt:formatDate value="${essay.eCreatetime}" pattern="yyyy-MM-dd"/></div>
										</div>
									</div>
								</div>
							</c:forEach>
						</c:if>
					</div>
				</div>
			</div>
			<style type="text/css">
				.uu{height:70px;}
				.uu li{
					list-style:none;
					float:left;
					margin-right:10px;
				}
				
				.uu li i{
				
				}
				
				.uu li a{
						padding-left:15px;
						padding-right:15px;
						padding-top:10px;
						padding-bottom:10px;
						cursor: pointer;
				}
				
				.uu li a:hover{
					border:1px solid #3385FF;
					text-decoration:none; color:#333
				}
				
			</style>
			<div style="width:800px;position:relative;bottom:20px; margin:50px;">
				<ul class="uu">
					<c:choose>
						<c:when test="${requestScope.pageResult.page==1 && requestScope.pageResult.totalPage==1}">
							<li onclick="pageTurning('${pageContext.request.contextPath}/user/pageTurning.action?keyword=${requestScope.keyword}&&page=1')"><a>1</a></li>
						</c:when>
						<c:when test="${requestScope.pageResult.page==1 && requestScope.pageResult.totalPage>1}">
							<c:forEach items="${requestScope.pageResult.rows}" step="10" varStatus="status">
								<li onclick="pageTurning('${pageContext.request.contextPath}/user/pageTurning.action?keyword=${requestScope.keyword}&&page=${status.count}')"><a>${status.count}</a></li>
							</c:forEach>
							<li onclick="pageTurning('${pageContext.request.contextPath}/user/pageTurning.action?keyword=${requestScope.keyword}&&page=${requestScope.pageResult.page+1}')"><a>下一页&gt;</a></li>
						</c:when>
						<c:when test="${requestScope.pageResult.page>1 && requestScope.pageResult.totalPage>requestScope.pageResult.page}">
							<li onclick="pageTurning('${pageContext.request.contextPath}/user/pageTurning.action?keyword=${requestScope.keyword}&&page=${requestScope.pageResult.page-1}')"><a>&lt;上一页</a></li>
							<c:forEach items="${requestScope.pageResult.rows}" step="10" varStatus="status">
								<li onclick="pageTurning('${pageContext.request.contextPath}/user/pageTurning.action?keyword=${requestScope.keyword}&&page=${status.count}')"><a>${status.count}</a></li>
							</c:forEach>
							<li onclick="pageTurning('${pageContext.request.contextPath}/user/pageTurning.action?keyword=${requestScope.keyword}&&page=${requestScope.pageResult.page+1}')"><a>下一页&gt;</a></li>
						</c:when>
						<c:when test="${requestScope.pageResult.page>1 && requestScope.pageResult.totalPage==requestScope.pageResult.page}">
							<li onclick="pageTurning('${pageContext.request.contextPath}/user/pageTurning.action?keyword=${requestScope.keyword}&&page=${requestScope.pageResult.page-1}')"><a>&lt;上一页</a></li>
							<c:forEach items="${requestScope.pageResult.rows}" step="10" varStatus="status">
								<li onclick="pageTurning('${pageContext.request.contextPath}/user/pageTurning.action?keyword=${requestScope.keyword}&&page=${status.count}')"><a>${status.count}</a></li>
							</c:forEach>
						</c:when>
					</c:choose>
				</ul>
			</div>
			<script type="text/javascript">
				function pageTurning(value){
					window.location.href=value;
				}
			</script>
	</body>

</html>