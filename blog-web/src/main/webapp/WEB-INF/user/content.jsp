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
		<title>文章内容</title>
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
		.goodbtn {
			display: inline-block;
			border-width:1.05263px;
			border-style:solid;border-color:rgb(235,133,126);
			border-radius:55px;
			border-top-left-radius:55px;
			border-top-right-radius:55px;
			border-bottom-left-radius:55px;
			border-bottom-right-radius:55px;
			color:#EB857E;
			font-size:19px;
		}
		
		.goodbtned{
			display: inline-block;
			border-width:1.05263px;
			border-style:solid;border-color:rgb(235,133,126);
			border-radius:55px;
			border-top-left-radius:55px;
			border-top-right-radius:55px;
			border-bottom-left-radius:55px;
			border-bottom-right-radius:55px;
			color:#FFFFFF;
			font-size:19px;
			background-color:#EB857E;
		}
		
		a{ text-decoration:none;}
		
	</style>
	
	<style type="text/css">
	.content{width:80%;margin:200px auto;}
	.hide_box{z-index:999;filter:alpha(opacity=50);background:#666;opacity: 0.5;-moz-opacity: 0.5;left:0;top:0;height:99%;width:100%;position:fixed;display:none;}
	.shang_box{width:540px;height:540px;padding:10px;background-color:#fff;border-radius:10px;position:fixed;z-index:1000;left:50%;top:50%;margin-left:-280px;margin-top:-280px;border:1px dotted #dedede;display:none;}
	.shang_box img{border:none;border-width:0;}
	.dashang{display:block;width:100px;margin:5px auto;height:25px;line-height:25px;padding:10px;background-color:#E74851;color:#fff;text-align:center;text-decoration:none;border-radius:10px;font-weight:bold;font-size:16px;transition: all 0.3s;}
	.dashang:hover{opacity:0.8;padding:15px;font-size:18px;}
	.shang_close{float:right;display:inline-block;}
	.shang_logo{display:block;text-align:center;margin:20px auto;}
	.shang_tit{width: 100%;height: 75px;text-align: center;line-height: 66px;color: #a3a3a3;font-size: 16px;background: url('../images/cy-reward-title-bg.jpg');font-family: 'Microsoft YaHei';margin-top: 7px;margin-right:2px;}
	.shang_tit p{color:#a3a3a3;text-align:center;font-size:16px;}
	.shang_payimg{width:140px;padding:10px;border:6px solid #EA5F00;margin:0 auto;border-radius:3px;height:140px;}
	.shang_payimg img{display:block;text-align:center;width:140px;height:140px; }
	.pay_explain{text-align:center;margin:10px auto;font-size:12px;color:#545454;}
	.radiobox{width: 16px;height: 16px;background: url('image/radio2.jpg');display: block;float: left;margin-top: 5px;margin-right: 14px;}
	.checked .radiobox{background:url('../images/radio1.jpg');}
	.shang_payselect{text-align:center;margin:0 auto;margin-top:40px;cursor:pointer;height:60px;width:280px;}
	.shang_payselect .pay_item{display:inline-block;margin-right:10px;float:left;}
	.shang_info{clear:both;}
	.shang_info p,.shang_info a{color:#C3C3C3;text-align:center;font-size:12px;text-decoration:none;line-height:2em;}
</style>
	<body>
		<center>
			<div style="width:810px;border:1px solid #D6D6D6;background-color:#FFFFFF;box-shadow: 1px 1px 1px #D;;padding:5px;">
				<div style="width:800px;">
				<input type="hidden" id="eId" value="${requestScope.essay.eId }"/>
				<span style=" line-height:2.6;font: '黑体';font-size:22px;color:#000000">${requestScope.essay.eTitle}</span><br/>
			<span style=" line-height:1.6;font-size:12px;color:#5F5F5F">发布于  <fmt:formatDate value="${requestScope.essay.eCreatetime}" pattern="yyyy-MM-dd"/>/ ${requestScope.classify.cName} / ${fn:length(requestScope.discusss)} 条评论 / ${requestScope.essay.ePageview} 浏览</span>
				<p id="tags" class="tags">
					<c:forEach items="${requestScope.labels}" var="label">
						<a  href="${pageContext.request.contextPath}/user/showEssaysByLabel.action?lId=${label.lId}"  title="${label.lName}"># ${label.lName}</a>
					</c:forEach>
				</p>
				<script type="text/javascript">
					$(function(){
						$("#tags a").each(function(){
							$(this).css("background",getRandomColor());
						});
					});
					
					function getRandomColor(){ 
						return "#"+("00000"+((Math.random()*16777215+0.5)>>0).toString(16)).slice(-6); 
					} 
				</script>
				<br/>
				 <!--在该div中展示,如有初始化的数据可以放在textarea中-->
			    <div id="testEditorMdview" style="padding:0px">
			        <textarea id="appendTest">${requestScope.essay.eContent}</textarea>
			    </div>
			<br/>

			<span style="font-size:12px;color:#5F5F5F">本站文章除注明转载/出处外，均为本站原创或翻译，转载前请务必署名<br/>
			最后编辑时间为: <fmt:formatDate value="${requestScope.essay.eSettingtime}" pattern="yyyy-MM-dd HH:mm:ss"/></span><br/>
				<br/>
			<div style=" display:inline-block; margin-right:20px;">
					<c:if test="${empty requestScope.good}">
						<div onclick="praise();" id="meiGood" class="goodbtn">
							<div style="float:left;padding-top:18px; padding-bottom:18px; padding-left:30px; padding-right:15px;">
								<a id="good" style="border-right:1px solid #EB857E; padding-right:10px">
									<i class="fa fa-thumbs-o-up" aria-hidden="true"></i>点赞
								</a>
							</div>
							<div style="float:left; padding-bottom:18px; padding-top:18px; padding-right:30px;"><a id="goodSize">${requestScope.goods}</a></div>
						</div>
					</c:if>
					<c:if test="${not empty requestScope.good}">
						<div class="goodbtned">
							<div  style="float:left;padding-top:18px; padding-bottom:18px; padding-left:30px; padding-right:15px;">
								<a style="border-right:1px solid #FFFFFF; padding-right:10px">
									<i class="fa fa-thumbs-o-up" aria-hidden="true"></i>点赞
								</a>
							</div>
						<div  style="float:left; padding-bottom:18px; padding-top:18px; padding-right:30px;"><a>${requestScope.goods}</a></div>
						</div>
					</c:if>
				</div>
				<a	 onclick="dashangToggle()">
					<div  style="display:inline-block">
							<div class="goodbtned">
								<div  style="float:left;padding-top:18px; padding-bottom:18px; padding-left:50px; padding-right:50px;">
									打赏
								</div>
										<div class="hide_box"></div>
										<div class="shang_box">
											<a class="shang_close" href="javascript:void(0)" onClick="dashangToggle()" title="打赏">
											<img src="${pageContext.request.contextPath}/images/close.jpg" alt="打赏" /></a>
											<div class="shang_tit">
												<p>感谢您的支持，我会继续努力!</p>
											</div>
											<div class="shang_payimg">
												<c:if test="${empty requestScope.settings.sZfbpay}">
													<img src="${pageContext.request.contextPath}/images/alipayimg.jpg" alt="支付宝" title="支付宝" />
												</c:if>
												<c:if test="${not empty requestScope.settings.sZfbpay}">
													<img src="${pageContext.request.contextPath}/upload/${requestScope.settings.sZfbpay}" alt="支付宝" title="支付宝" />
												</c:if>
											</div>
												<div class="pay_explain">扫码赏钱，能给多少给多少</div>
											<div class="shang_payselect">
												<div class="pay_item checked" data-id="alipay">
													<span class="radiobox"></span>
													<span class="pay_logo"><img src="${pageContext.request.contextPath}/images/alipay.jpg" alt="֧支付宝" /></span>
												</div>
												<div class="pay_item" data-id="weipay">
													<span class="radiobox"></span>
													<span class="pay_logo"><img src="${pageContext.request.contextPath}/images/wechat.jpg" alt="微信" /></span>
												</div>
											</div>
											<div class="shang_info">
												<p><span id="shang_pay_txt">֧提醒:打赏金额将直接进入对方账号,无法退款,请您谨慎操作!</span></p>
											</div>
										</div>
							</div>
						</div>
				</a>
				<span style= "position:relative; bottom:30px; font-size:13px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;分享到:
						<a style="background-color:red; padding:5px; border-radius:5px; color:#FFFFFF" title="分享到微博" rel="nofollow" href="http://weibo.com/5618887340/" target="_blank">
							<i class="fa fa-weibo"  style="margin-top:11px" aria-hidden="true"></i></a>
							
					<a title="分享到微信" rel="nofollow" style="border-radius:5px;padding:5px; background-color:green; color:#FFFFFF">
							<i class="fa fa-weixin" style="margin-top:11px" aria-hidden="true"></i></a>
							
							
					<a title="分享到QQ"  style="border-radius:5px;background-color:#3388FF; padding:5px; color:#FFFFFF" rel="nofollow" href="tencent://message/?uin=2366597634&Site=&Menu=yes" target="_blank">
						<i style=" margin-top:11px" class="fa fa-qq" aria-hidden="true"></i></a>
					</span><br/>
					
				</div>
					<c:if test="${requestScope.essay.eIssay == '0'}">
						<div style=" width:800px;height:300px; margin-top:80px">
							<span style="float:left; color:#398E9F;"><i class="fa fa-pencil" aria-hidden="true"></i> 发表评论</span><br/>
							<hr style="margin-top:10px; height:2px; background-color:#398E9F"/>
							<div style="float:left; margin-left:10px;margin-bottom:10px;">
							
								<input type="text" name="name" value="${sessionScope.USER_NAME}" id="discusser" style="height:30px; float:left; margin-bottom:10px; border:1px solid #398E9F;border-radius:5px;" placeholder=" 请输入昵称"/><br/>
								
								<textarea id="textareaaa" style="float:left;width:600px; margin-bottom:5px; height:150px; resize:none; border:1px solid #398E9F;border-radius:10px;padding:10px" maxlength="48" placeholder=" 既然来了,就说几句吧"></textarea><br/>
								<a id="ex"  href="javascript:void(0);"><i id="expression" class="fa fa-smile-o fa-2x" style="float:left;color:#398E9F;margin-left:3px;"aria-hidden="true"></i></a>
								<input type="button" style="float:right;margin-top:1px;background-color:#FFFFFF;padding-top:5px;padding-bottom:5px;padding-left:10px;padding-right:10px;border-radius:5px;border:1px solid #398E9F" value="发表" onClick="out();"/>
							</div>
						</div>
					</c:if>
		<div id="info-show" class="father" style=" width:800px; margin-top:30px">
			<span style="color:#398E9F;float:left"><i class="fa fa-comments-o" aria-hidden="true"></i> 评论列表</span><br/>
			<hr style="margin-top:10px; height:1px; background-color:#398E9F"/>
			<ul style="float:left;">
				<c:if test="${not empty requestScope.discusss}">
					<c:forEach items="${requestScope.discusss}" var="discuss">
						<li class="father" style="border:1px solid #D6D6D6;width:770px;margin-top:10px; margin-bottom:10px;padding:10px;">
							<div  class="father" style="float:left;">
							<div class="msgimg" style="display:inline-block;height:auto; margin-right:10px;">
							<img style="border-radius:50px;" width="60px" height="60px" src="https://img.xjh.me/random_img.php?return=302&&<%=new Date().getTime() %>" alt="头像" title="头像"/>
							  </div>
							<div style="display:inline-block;float:right;font:'黑体'; padding-top:10px;">
							<div class="msgname" style="float:left;margin-bottom:10px;"><a rel="nofollow" style="text-decoration:none;color:#666666;">${discuss.dName}</a> <span id="visitor" style="background-color:#4494A4;color:#FFFFFF;padding-top:1px;padding-bottom:1px;padding-left:5px;padding-right:5px;border-radius:5px;font-size:14px;">游客</span> <span style="color:#99A5C2;font-size:14px;"><fmt:formatDate value="${discuss.dTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
							</div><br/>
							<div class="msgarticle" style="float:left;color:#666666; text-align:left;" >${discuss.dContent}</div>
							</div>
							<div class="clear"></div>
							</div>
							<div class="clear"></div>
							<c:forEach items="${discuss.childDiscuss}" var="dd">
								
								<c:if test="${dd.dName =='root'}">
										<div  class="father" style="float:left;">
								<div class="msgimg" style="display:inline-block;height:auto; margin-right:10px;">
								<img style="border-radius:50px;" width="60px" height="60px" src="https://img.xjh.me/random_img.php?return=302&&<%=new Date().getTime() %>" alt="头像" title="头像"/>
								  </div>
								<div style="display:inline-block;float:right;font:'黑体'; padding-top:10px;">
								<div class="msgname" style="float:left;margin-bottom:10px;"><a rel="nofollow" style="text-decoration:none;color:#666666;">${dd.dName}</a> <span id="visitor" style="background-color:#5CB85C;color:#FFFFFF;padding-top:1px;padding-bottom:1px;padding-left:5px;padding-right:5px;border-radius:5px;font-size:14px;">管理员</span> <span style="color:#99A5C2;font-size:14px;"><fmt:formatDate value="${dd.dTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
								</div><br/>
								<div class="msgarticle" style="float:left;color:#666666; text-align:left;">${dd.dContent}</div></div>
								<div class="clear"></div>
								</div>
								<div class="clear"></div>
									
								</c:if>
								<c:if test="${dd.dName !='root'}">
									<div  class="father" style="float:left;">
									<div class="msgimg" style="display:inline-block;height:auto; margin-right:10px;">
									<img style="border-radius:50px;" width="60px" height="60px" src="https://img.xjh.me/random_img.php?return=302&&<%=new Date().getTime() %>" alt="头像" title="头像"/>
									  </div>
									<div style="display:inline-block;float:right;font:'黑体'; padding-top:10px;">
									<div class="msgname" style="float:left;margin-bottom:10px;"><a rel="nofollow" style="text-decoration:none;color:#666666;">${dd.dName}</a> <span id="visitor" style="background-color:#4494A4;color:#FFFFFF;padding-top:1px;padding-bottom:1px;padding-left:5px;padding-right:5px;border-radius:5px;font-size:14px;">游客</span> <span style="color:#99A5C2;font-size:14px;"><fmt:formatDate value="${dd.dTime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
									</div><br/>
									<div class="msgarticle" style="float:left;color:#666666; text-align:left;">${dd.dContent}</div></div>
									<div class="clear"></div>
									</div>
									<div class="clear"></div>
								</c:if>
							</c:forEach>
						</li>
					</c:forEach>
				</c:if>
				<c:if test="${empty requestScope.discusss}">
					暂无评论!
				</c:if>
			</ul>
			<div class="clear"></div>
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
</html>
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
			$(".pay_item").click(function(){
				$(this).addClass('checked').siblings('.pay_item').removeClass('checked');
				var dataid=$(this).attr('data-id');
				$(".shang_payimg img").attr("src","${pageContext.request.contextPath}/images/"+dataid+"img.jpg");
			});
			
		});
		
	
		
		function reEbg(){
			$("#expression").css("color","#398E9F");
		}
		
		function updateEbg(){
			$("#expression").css("color","#283941");
		}
		function dashangToggle(){
			$(".hide_box").fadeToggle();
			$(".shang_box").fadeToggle();
		}
	
		window.onload=function(){
			$('#ex').SinaEmotion($('#textareaaa'));
			$(".msgarticle").each(function(){
				var vv = $(this).text();
				$(this).text("");
				$(this).append(AnalyticEmotion(vv));
			});

		}

	function out() {
		var inputText = $('#textareaaa').val();
		var discusser = $("#discusser").val();
		var eId = $("#eId").val();
		if(discusser.length<3||discusser.length>6){
		 swal({  
	            title: '温馨提示',
	            type: "info",
	            text: "必须输入昵称!(昵称3-6位)",  
	            confirmButtonText: '确认',  
	            confirmButtonColor: '#3085D6', 
	            timer: 3000
	        })
	        return;
		}
		if(inputText.length<5){
			 swal({  
		            title: '温馨提示',
		            type: "info",
		            text: "评论最少五个字!",  
		            confirmButtonText: '确认',  
		            confirmButtonColor: '#3085D6', 
		            timer: 3000
		        })
			return;
		}
		var url = "${pageContext.request.contextPath}/user/addDiscuss.action";
		$.post(url,{"dName":discusser,"eId":eId,"dContent":inputText},function(msg){
			if(msg=="true"){
				 location.reload();
			}
		});
		
		$("#textarea").val('');
	}
	
	var a = 0;
	function praise(){
		if(a==0){
			var discusser = $("#discusser").val();
			var eId = $("#eId").val();
			if(discusser.length<3||discusser.length>6){
			 swal({  
		            title: '温馨提示',
		            type: "info",
		            text: "点赞必须输入昵称!(昵称3-6位)",  
		            confirmButtonText: '确认',  
		            confirmButtonColor: '#3085D6', 
		            timer: 3000
		        })
			}else{
				var url = "${pageContext.request.contextPath}/user/praise.action"
				$.post(url,{"essayId":eId,"praiser":discusser},function(msg){
					$("#good").css("border-right","1px solid #FFFFFF");
					$(".goodbtn").css("background-color","#EB857E");
					$(".goodbtn").css("color","#FFFFFF");
					$("#goodSize").html("${requestScope.goods+1}");
				});
			}
		}
		
	}
	
	</script>