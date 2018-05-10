<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>主页</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<style type="text/css">
#bigdiv {
	width: 30%;
	margin: 0px auto;
}

table,tr,td {
	border: 1px solid gray;
	border-collapse: collapse;
}

thead {
	font-weight: bolder;
}

table {
	width: 500px;
	text-align: center;
}
</style>
<body width="100%">
	<div id="bigdiv">
		<h1>战舰少女R</h1>
		<br /> <a href="add.jsp">舰娘入港登记</a> <br />
		<table>
			<thead>
				<tr>
					<td>编号</td>
					<td>船名</td>
					<td>国籍</td>
					<td>类别</td>
					<td>状态</td>
					<td>修改</td>
					<td>删除</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${slist }" var="item">
					<tr>
						<td><c:out value="${item.code }" /></td>
						<td><c:out value="${item.name }" /></td>
						<td><c:out value="${item.nationality.logogram }" /></td>
						<td><c:out value="${item.stype.tname }" /></td>
						<td><c:choose>
								<c:when test="${item.state == 1}">  
 									<c:out value="已获得"/>
								</c:when>
								<c:otherwise> 
									<c:out value="未获得"/>
								</c:otherwise>
							</c:choose></td>
						<td><a href="users.do?opr=selectUsersById&id=${item.id}">修改</a>
						</td>
						<td><a href="users.do?opr=deleteUser&id=${item.id}">删除</a></td>
					</tr>
				</c:forEach>
				<br>
			</tbody>
		</table>
		<p>
			<a a href="ship!readShipList.action?index=1">首页</a>
			<c:forEach var="i" begin="1" end="${page.pageRow }" step="1">
				<a href="ship!readShipList.action?index=${i}"><c:out
						value="${i}" />
				</a>
			</c:forEach>
			<a a href="ship!readShipList.action?index=${page.pageRow }">末页</a>
			<span>页数[${page.pageNum }/${page.pageRow }]</span>
		</p>
	</div>
</body>
</html>
