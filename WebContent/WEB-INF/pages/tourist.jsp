<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/tourist.css">
<title>游客界面</title>
</head>
<body>
	<div id="left">
		<ul id="navigation" >
			<li><a href="#home">反馈</a></li>
			<li><a href="#about">查看简历</a></li>
			<li><a href="#portfolio">修改密码</a></li>
			<li><a href="#skills">其它</a></li>
			<li><a href="#industries">退出</a></li>
		</ul>
	</div>
	<div id="right" >
		<form action="#" method="post">
			<table border="2" cellpadding="10" cellspacing="0" id="resume">
				<tr>
					<td colspan="4" align="center">简历</td>
				</tr>
				<tr>
					<td>真实姓名</td>
					<td><input type="text" name="realName"></td>
					<td>性别</td>
					<td><input type="radio" value="男" name="sex">男
					<input type="radio" value="女" name="sex">女</td>
				</tr>
				<tr>
					<td>年龄</td>
					<td><input type="number" name="age"></td>
					<td>学历</td>
					<td>
						<select name="education">
							<option>学历</option>
							<option value="大学专科">大学专科</option>
							<option value="大学本科">大学本科</option>
							<option value="硕士">硕士</option>
							<option value="博士">博士</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>联系方式</td>
					<td><input type="number" name="phoneNumber"></td>
					<td>e-mail</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>应聘职位</td>
					<td>
						<select>
							<option>部门</option>
						</select>
						<select>
							<option>职位</option>
						</select>
					</td>
					<td>政治面貌</td>
					<td>
						<select>
							<option>群众</option>
							<option>共产党员</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>上份工作</td>
					<td><input type="text" ></td>
					<td>工作经验</td>
					<td><input type="text"></td>
				</tr>
				<tr>
					<td>期望薪资</td>
					<td><input type="text"></td>
					<td>兴趣爱好</td>
					<td><input type="text"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="保存"></td>
					<td colspan="2" align="center"><input type="button" value="返回"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>