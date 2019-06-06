<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Login Page </title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/js/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/js/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    
    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/css/custom.min.css" rel="stylesheet">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/limonte-sweetalert2/6.4.1/sweetalert2.min.css">
    
        <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/js/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="${pageContext.request.contextPath}/js/bootstrap/dist/js/bootstrap.min.js"></script>

		<script src="${pageContext.request.contextPath}/js/limonte-sweetalert2/6.4.1/sweetalert2.min.js"></script>

    <script src="${pageContext.request.contextPath}/js/custom.js"></script>
  </head>

  <body class="login" style="background: url(${pageContext.request.contextPath}/images/bg.png)">
    <div style="margin: 0 auto; padding-bottom: 0%; padding-top: 7.5%; width: 380px;">
    <div class="panel panel-color panel-danger panel-pages panel-shadow">
        <div class="panel-heading bg-img">
            <div class="bg-overlay"></div>
            <h3 class="text-center m-t-10"> Login Cat</h3>
        </div>

        <div class="panel-body">
            <form class="form-horizontal m-t-20" method="post" id="loginForm" >

                <div class="form-group">
                    <div class="col-xs-12">
                        <input class=" input-lg input-border" id="account" name="account" type="text" required=""
                               placeholder="请输入账号 :)">
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-xs-12">
                        <input class=" input-lg input-border" id="password" name="password" type="password" required=""
                               placeholder="请输入密码">
                    </div>
                </div>

                <div class="form-group text-center m-t-40">
                    <div class="col-xs-12">
                        <button class="btn btn-danger btn-lg btn-rounded btn-block w-lg waves-effect waves-light" style="box-shadow: 0px 0px 4px #868282;" type="button" onclick="login()">登&nbsp;录
                        </button>
                    </div>
                </div>
            </form>
        </div>
		<script type="text/javascript">
			function login(){
				var account = $("#account").val();
				var password = $("#password").val();
				var url = "${pageContext.request.contextPath}/admin/login.action";
				var data = {
						"account":account,
						"password":password
				};
				$.post(url,data,function(msg){
					if(msg=="false"){
						swal({  
				            title: '温馨提示',
				            type: "error",
				            text: "用户名或密码错误！",  
				            confirmButtonText: '确认',  
				            confirmButtonColor: '#3085D6', 
				            timer: 3000
				        })
					}else{
						location.href="${pageContext.request.contextPath}/admin/appearance.action";
					}
				});
			}
		</script>
    </div>
</div>
  </body>
</html>
