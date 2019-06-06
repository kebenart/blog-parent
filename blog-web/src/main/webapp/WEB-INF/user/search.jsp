<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>站内搜索</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/bootstrap/dist/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/search.css">
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/ios-parallax.js"></script> 
</head>
<body>
<div id="top-image">
  <div id="content" class="container center-block">
    <div class="jumbotron">
      <div class="container">
        <center><h1>搜索</h1></center><br/>
        <div class="input-group input-group-lg"> <span class="input-group-addon" id="sizing-addon1"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></span>
           	<input type="text" id="keyword" name="keyword" class="form-control" placeholder="输入关键词" aria-describedby="sizing-addon1">
           	<form action="${pageContext.request.contextPath}/user/search.action" method="post">
           		<input type="hidden" id="keywordHidden" name="keyword"/>
           	</form>
          <span class="input-group-btn">
          <button class="btn btn-default" type="button" onClick="submit();">站内搜索</button>
		   		  <button class="btn btn-default" type="button" onClick="window.open('http://www.baidu.com')">全网搜索</button>
          </span> </div>
      </div>
			<script type="text/javascript">
			function submit(){
				var value = $("#keyword").val();
				if(value.length==0){
				}else{
					$("#keywordHidden").val(value);
					document.forms[0].submit();
				}
			}
			</script>
    </div>
  </div>
</div>

<script type="text/javascript">
$(document).ready(function() {
  $('#top-image').iosParallax({
	movementFactor: 50
  });
});
</script>
</body>
</html>
