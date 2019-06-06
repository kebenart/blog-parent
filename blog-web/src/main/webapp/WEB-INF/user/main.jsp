<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/js/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Scrollbar.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sinaFaceAndEffec.css" />
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/scrollReveal.js"></script>

		<script type="text/javascript" src="${pageContext.request.contextPath}/js/sinaFaceAndEffec.js"></script>
<title>
	<c:if test="${not empty requestScope.settings.sName}">${requestScope.settings.sName}</c:if><c:if test="${empty requestScope.settings.sName}">可苯</c:if>,<c:if test="${not empty requestScope.settings.sTitle}">${requestScope.settings.sTitle}</c:if><c:if test="${empty requestScope.settings.sTitle}">雪一直下</c:if>
</title>
</head>
<style type="text/css">
	 li {
		list-style: none;
		}
	a {
		color: #666;
		vertical-align: baseline;
		text-decoration: none;
		font-size: 100%;
		-webkit-transition: all .3s ease-out 0s;
		-o-transition: all .3s ease-out 0s;
		transition: all .3s ease-out 0s;
		-webkit-tap-highlight-color: rgba(255,0,0,0);
	}
	form {
	  position: relative;
	  width: 326px;
	  margin: 0 auto;
	  right:14px;
	}
	
</style>

<body>
	<c:choose>
		<c:when test="${empty requestScope.settings.sBgimg}">
			<div class="bg"style="text-align:center;background: url(${pageContext.request.contextPath}/images/bg.png) no-repeat center center; padding-top:100px" >
		</c:when>
		<c:otherwise>
			<div class="bg"style="text-align:center;background: url(${pageContext.request.contextPath}/upload/${requestScope.settings.sBgimg}) no-repeat center center; padding-top:100px" >
		</c:otherwise>
	</c:choose>
		<div style="float:right;position: relative;bottom:80px;right:200px;">
			<c:forEach items="${requestScope.pages}" var="page">
				<h3><a style="color: #fff;font-size: 18px;letter-spacing: 1px;" href="${pageContext.request.contextPath}/user/showPage.action?path=${page.pPath}">${page.pName}</a></h3>
			</c:forEach>
		</div>
		<h1 style="color: #fff;text-transform: none; font-size: 50px;margin-bottom: 10px;">
			<c:if test="${not empty requestScope.settings.sTitle}">${requestScope.settings.sTitle}</c:if><c:if test="${empty requestScope.settings.sTitle}">雪一直下</c:if>
		</h1><h2 style="display: block;color: #fff;margin-bottom: 30px;font-size: 25px;letter-spacing: 1px;"><c:if test="${not empty requestScope.settings.sRemark}">${requestScope.settings.sRemark}</c:if><c:if test="${empty requestScope.settings.sRemark}">其实那天见到你，很想告诉你，你的笑真美。</c:if></h2></div>
		<div class="left">
			<div style="width:100%;height:340px;background-color: #FFFFFF;border:1px solid #D6D6D6;box-shadow:0 0 1px #000 inset;">
				<div  class="headImgBg"></div>
				<div style="position:relative;top:-40px;">
					<center>
						<img  src="${pageContext.request.contextPath}/images/headImg.png" class="headImg" width="80px" height="80px"/><br>
						<span style=" line-height:25px">
							<c:if test="${not empty requestScope.settings.sName}">${requestScope.settings.sName}</c:if><c:if test="${empty requestScope.settings.sName}">可苯</c:if>
						</span><br/>
						<c:if test="${not empty requestScope.settings.sHeadremark}">${requestScope.settings.sHeadremark}</c:if><c:if test="${empty requestScope.settings.sHeadremark}">罗小小小黑</c:if>
						<ul class="ul1" style="padding-left:25px;">
							<li class="tsina">
								<c:if test="${not empty requestScope.settings.sWeibo}">
									<a title="微博" rel="nofollow" href="${requestScope.settings.sWeibo}" target="_blank"><i class="fa fa-weibo"  style=" margin-top:11px" aria-hidden="true"></i></a>
								</c:if>
								<c:if test="${empty requestScope.settings.sWeibo}">
									<a title="微博" rel="nofollow" href="http://weibo.com/5618887340/" target="_blank"><i class="fa fa-weibo"  style=" margin-top:11px" aria-hidden="true"></i></a>
								</c:if>
							</li>
							<li class="weixin">
								<a title="微信"  onMouseOut="hideImg()"  onmouseover="showImg()" rel="nofollow"><i class="fa fa-weixin" style=" margin-top:11px" aria-hidden="true"></i></a>
							<div id="wxImg" style="display:none;height:50px;back-ground:#f00;position:absolute;top:35px;">
								<c:if test="${not empty requestScope.settings.sWeixin}">
									<img width="100px" height="100px" src="${pageContext.request.contextPath}/upload/${requestScope.settings.sWeixin}"/>
								</c:if>
								<c:if test="${empty requestScope.settings.sWeixin}">
									<img width="100px" height="100px" src="${pageContext.request.contextPath}/images/myweixin.jpg"/>
								</c:if>
							</div>
							</li>
							<li class="qq">
								<c:if test="${not empty requestScope.settings.sQq}">
									<a title="QQ临时对话" rel="nofollow" href="tencent://message/?uin=${requestScope.settings.sQq}&Site=&Menu=yes" target="_blank"><i style=" margin-top:11px" class="fa fa-qq" aria-hidden="true"></i></a>
								</c:if>
								<c:if test="${empty requestScope.settings.sQq}">
									<a title="QQ临时对话" rel="nofollow" href="tencent://message/?uin=2366597634&Site=&Menu=yes" target="_blank"><i style=" margin-top:11px" class="fa fa-qq" aria-hidden="true"></i></a>
								</c:if>
							</li>
							<li class="qqs">
								<c:if test="${not empty requestScope.settings.sQqs}">
									<a title="QQ主题交流群" rel="nofollow" href="${requestScope.settings.sQqs}" target="_blank"><i style=" margin-top:11px" class="fa fa-users" aria-hidden="true"></i></a>
								</c:if>
								<c:if test="${empty requestScope.settings.sQqs}">
									<a title="QQ主题交流群" rel="nofollow" href="https://jq.qq.com/?_wv=1027&k=52qlvwS" target="_blank"><i style=" margin-top:11px" class="fa fa-users" aria-hidden="true"></i></a>
								</c:if>
								
							</li>
						</ul>
						
					</center>
				</div>
			</div>
			<div style="width:100%;background-color: #FFFFFF;  margin-top:2px; border:1px solid #D6D6D6;">
				<div class="butauthor" style="padding:0px;height:26px">
					<a id="newTopTitle" style="margin-top:2px; border-top:1px solid red; border-bottom:none;" href="javascript:showNewTop();" class="bignum pn alink">最新文章</a>
					<a id="viewTopTitle" class="bignum alink" href="javascript:showViewTop();">热门文章</a>
				</div>
				<ul id="newTopEssays" class="ul2" style="border-bottom:1px solid #D6D6D6;box-shadow: 0 1px 0 #D6D6D6;margin-bottom:0px;padding-bottom:0px">
					<c:forEach items="${requestScope.newTopEssays}" var="e" varStatus="status">
						<li ><span class="li-icon li-icon-${status.count}">${status.count}</span><a href="${pageContext.request.contextPath}/user/showEssay.action?essayId=${e.eId}"> ${e.eTitle}</a></li>
					</c:forEach>
				</ul>
				
				<ul hidden="hidden" id="viewTopEssays" class="ul2" style="border-bottom:1px solid #D6D6D6;box-shadow: 0 1px 0 #D6D6D6;margin-bottom:0px;padding-bottom:0px">
					<c:forEach items="${requestScope.viewTopEssays}" var="e" varStatus="status">
						<li ><span class="li-icon li-icon-${status.count}">${status.count}</span><a href="${pageContext.request.contextPath}/user/showEssay.action?essayId=${e.eId}"> ${e.eTitle}</a></li>
					</c:forEach>
				</ul>
				
			</div>
			<div style="width:100%;height:220px;background-color: #FFFFFF;  margin-top:10px; border:1px solid #D6D6D6;box-shadow:0 0 1px #000 inset;">
				<div  style="height:40px; border-bottom:1px solid #D6D6D6;">
					<a style=" display: block;text-align: center;border-right: 1px solid #D6D6D6; float:left; width:40px; height:40px;">
						<i class="fa fa-bars" aria-hidden="true" style="color:#298496; margin-top:12px;"></i>
					</a>
					<a style=" display: block;float:left;text-align: center; padding-top:13px;padding-left:13px;height:40px; font-size:14px;">网站概况</a>
				</div>

				<ul  style="font-size:13px;">
					<li style="margin:8px"><i class="fa fa-file-text-o" aria-hidden="true"></i> 文章总数: ${totalSurvey.essaySize} 篇</li>
					<li style="margin:8px"><i class="fa fa-commenting-o" aria-hidden="true"></i> 留言数量: ${totalSurvey.discussSize} 条</li>
					<li style="margin:8px"><i class="fa fa-folder-o" aria-hidden="true"></i> 分类数量: ${totalSurvey.classifySize} 个</li>
					<li style="margin:8px"><i class="fa fa-tags" aria-hidden="true"></i> 标签总数: ${totalSurvey.labelSize} 个</li>
					<li style="margin:8px"><i class="fa fa-eye" aria-hidden="true"></i> 浏览总量: ${totalSurvey.viewSize} 次</li>
					<li style="margin:8px"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> 最后更新: <font color="#6FABB7"><fmt:formatDate value="${totalSurvey.newTime}" type="date" dateStyle="long"/></font></li>
				</ul>
			</div>
		</div>
		
		<div class="content">
			<ul class="cbp_tmtimeline" style="width:100%;">
				<c:if test="${not empty requestScope.essays}">
					<c:forEach items="${requestScope.essays}" var="essay">
						<li>
							<time class="cbp_tmtime"><span><fmt:formatDate value="${essay.eCreatetime}" pattern="MM-dd"/></span> <span><fmt:formatDate value="${essay.eCreatetime}" pattern="yyyy"/></span></time>
							<div class="cbp_tmicon"></div>
							<div class="cbp_tmlabel" data-scroll-reveal="enter right over 1s" >
								<h2>${essay.eTitle}</h2>
								 <p><span class="blogpic"><a href="${pageContext.request.contextPath}/user/showEssay.action?essayId=${essay.eId}">
								 <c:choose>
								 	<c:when test="${empty essay.ePhoto}">
								 		<img src="${pageContext.request.contextPath}/images/back.png">
								 	</c:when>
								 	<c:otherwise>
								 		<img src="${essay.ePhoto}">
								 	</c:otherwise>
								 </c:choose>
								 </a></span>
									&nbsp;&nbsp;<c:if test="${fn:length(essay.eContent)>180 }">  
									  ${fn:substring(essay.eContent, 0, 180)}......  
									</c:if>  
									<c:if test="${fn:length(essay.eContent)<=180 }">  
									  ${essay.eContent}
									</c:if>
								 </p>
								 <a href="${pageContext.request.contextPath}/user/showEssay.action?essayId=${essay.eId}" target="_blank" class="readmore">阅读全文&gt;&gt;</a>
							</div>
						</li>
					</c:forEach>
				</c:if>
				<c:if test="${empty requestScope.essays}">
					暂无文章!
				</c:if>
			</ul>
			</div>
		<div class="right">
			<div class="search d2" style="background-color: #FFFFFF; ">
				 <form id="searchForm" method="post" action="${pageContext.request.contextPath}/user/search.action">
				  <input type="text" id="keyword" name="keyword" placeholder="来搜点什么吧...">
				  <button type="submit"></button>
				</form>
			</div>
			<div style="width:100%;background-color: #FFFFFF; border:1px solid #D6D6D6; position: relative; right:5px;box-shadow:0 0 1px #000 inset;">
				<div  style="height:40px; border-bottom:1px solid #D6D6D6;">
					<a style=" display: block;text-align: center;border-right: 1px solid #D6D6D6; float:left; width:40px; height:40px;">
						<i class="fa fa-table" aria-hidden="true"  style="color:#298496; margin-top:12px;"></i>
					</a>
					<a style=" display: block;float:left;text-align: center; padding-top:13px;padding-left:13px;height:40px; font-size:14px;">所有分类</a>
				</div>
				<ul class="hottags" style="padding-left:20px;">
					<c:if test="${not empty requestScope.classifys}">
						<c:forEach items="${requestScope.classifys}" var="classify" varStatus="status">
							<li class="c${status.count}"><a href="${pageContext.request.contextPath}/user/showEssaysByClassify.action?cId=${classify.cId}" title="${classify.cName}">${classify.cName}<span class="tag-count"></span></a></li>
						</c:forEach>
					</c:if>
					<c:if test="${empty requestScope.classifys}">
						暂无分类!
					</c:if>
				</ul>
			</div>
			<div style="width:100%;background-color: #FFFFFF; border:1px solid #D6D6D6; margin-top:5px; position: relative; right:5px;box-shadow:0 0 1px #000 inset;">
				<div  style="height:40px; border-bottom:1px solid #D6D6D6;">
					<a style=" display: block;text-align: center;border-right: 1px solid #D6D6D6; float:left; width:40px; height:40px;">
						<i class="fa fa-tags" aria-hidden="true" style="color:#298496; margin-top:12px;"></i>
					</a>
					<a style=" display: block;float:left;text-align: center; padding-top:13px;padding-left:13px;height:40px; font-size:14px;">热门标签</a>
				</div>
				<ul class="ll" style="padding-left:20px;">
					<c:if test="${not empty requestScope.labels}">
						<c:forEach items="${requestScope.labels}" var="label" varStatus="status">
							<li class="c${status.count}"><a href="${pageContext.request.contextPath}/user/showEssaysByLabel.action?lId=${label.lId}" title="${label.lName}"># ${label.lName}</a></li>
						</c:forEach>
					</c:if>
					<c:if test="${empty requestScope.labels}">
						暂无标签!
					</c:if>
				</ul>
			</div>
			<div style="width:100%;background-color: #FFFFFF; border:1px solid #D6D6D6; margin-top:5px; position: relative; right:5px;box-shadow:0 0 1px #000 inset;">
				<div  style="height:40px; border-bottom:1px solid #D6D6D6;">
					<a style=" display: block;text-align: center;border-right: 1px solid #D6D6D6; float:left; width:40px; height:40px;">
						<i class="fa fa-commenting-o" aria-hidden="true" style="color:#298496; margin-top:12px;"></i>
					</a>
					<a style=" display: block;float:left;text-align: center; padding-top:13px;padding-left:13px;height:40px; font-size:14px;">最新评论</a>
				</div>
				<ul style="-webkit-padding-start:0;margin-top: 0px;margin-bottom:0px;">
					<c:if test="${empty requestScope.discusss}">
						<li class="lis" style="padding-left:10px;padding-top:10px;padding-bottom:10px">
							<font size="1px">暂无最新评论!</font>
						</li>
					</c:if>
					<c:if test="${not empty requestScope.discusss}">
						<c:forEach items="${requestScope.discusss}" var="discuss">
							<li class="lis">
								<img class="headImg" style=" float:left; margin-left:20px; margin-right:10px;width:50px; height:50px; position: relative;bottom:5px" src="https://img.xjh.me/random_img.php?return=302&&<%=new Date().getTime() %>"  alt="${discuss.dName}"/>
								<p >
									<a class="aContent" href="${pageContext.request.contextPath}/user/showEssay.action?essayId=${discuss.eId}">${discuss.dContent}</a>
								</p>
								<small style="color:#A3A2A2; position:relative; bottom:5px">${discuss.dName} 评论于:<fmt:formatDate value="${discuss.dTime}" pattern="yyyy-MM-dd HH:mm:ss"/></small>
							</li>
						</c:forEach>
						<script>
						window.onload=function(){
							$(".aContent").each(function(){
								var vv = $(this).text();
								$(this).text("");
								$(this).append(AnalyticEmotion(vv));
							});
						}
						</script>
					</c:if>
				</ul>
			</div>
		</div>
	</div><script type="text/javascript">
	if (!(/msie [6|7|8|9]/i.test(navigator.userAgent))){
		(function(){
			window.scrollReveal = new scrollReveal({reset: true});
		})();
	};
	function  showImg(){
	document.getElementById("wxImg").style.display='block';
	}
	function hideImg(){
	document.getElementById("wxImg").style.display='none';
	}
	
	function showNewTop(){
		$("#viewTopEssays").attr("hidden","hidden");
		$("#viewTopTitle").removeAttr("style");
		$("#newTopTitle").attr("style","margin-top:2px; border-top:1px solid red; border-bottom:none;");
		$("#newTopEssays").removeAttr("hidden");
		
	}
	
	function showViewTop(){
		$("#newTopEssays").attr("hidden","hidden");
		$("#newTopTitle").removeAttr("style");
		$("#viewTopTitle").attr("style","margin-top:2px; border-top:1px solid red; border-bottom:none;");
		$("#viewTopEssays").removeAttr("hidden");
	}
	
	$(function(){
		$("#searchForm").submit(function () {
			var value = $("#keyword").val();
			if(value.length==0){
				window.open("${pageContext.request.contextPath}/user/searchHtml.action");
			}else{
				document.forms[0].submit();
			}
			  return false;
		} );
	})
	
</script> 
</body>
</html>
