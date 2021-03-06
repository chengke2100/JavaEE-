<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style>
	body{    
	    background-image: url(${pageContext.request.contextPath}/img/homepage.jpg);    
	    background-repeat:no-repeat;
		background-position:center;
		background-attachment:fixed;
		background-size:cover;  
	}
	div{
		margin-top:80px;
	}
	.login{
		line-height: 25px; 
		margin: 15px auto 0px; 
		padding: 0 15px; 
		border: 1px solid rgba(255, 255, 255, 0.38);
		background: rgb(244,70,66); 
		border-radius: 6px;
		width:150px;
	}  
	.register{
		line-height: 25px; 
		margin: 15px auto 0px; 
		padding: 0 15px; 
		border: 1px solid rgba(255, 255, 255, 0.38);
		background: rgb(152,152,152); 
		border-radius: 6px;
		width:150px;
	}  
</style>
</head>
<body>
	<div align="center">
		<h1 style="color:orange">欢迎进入人力资源管理系统</h1>
		<form action="${pageContext.request.contextPath }/user/login" method="post">
			<span style="color:yellow">用户名:&nbsp;</span><input type="text" name="userName" required="required"><br/><br/>
			<span style="color:yellow">密&nbsp;&nbsp;&nbsp;码:&nbsp;</span><input type="password" name="password1" required="required" ><br/><br/>
			<input type="submit" value="登录" class="login" >
		</form><br/>
		<c:if test="${!empty requestScope.error }">
			<span style="color:red">帐户或者密码错误</span>
		</c:if>
		<form action="${pageContext.request.contextPath }/user/registerPage" method="post">
			<input type="submit" value="没有账号，先注册" class="register">
		</form>
	</div>
</body>
</html>