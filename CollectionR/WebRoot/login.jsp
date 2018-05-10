<%@ page language="java" pageEncoding="UTF-8"%>

<html>


<head>
<title>登陆</title>
<META HTTP-EQUIV="Refresh" CONTENT="0;URL=ship!readAllInfo.action">
</head>
<body>
	<center>
		<form action="login!log.action" method="post">
			<input type="text" name="user.ucode" id="ucode" placeholder="用户名" /><br />
			<input type="password" name="user.upwd" id="upwd" placeholder="密码" /><br />
			<input type="submit" value="提交" />
		</form>
	</center>
</body>
</html>

