<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>


<title>战舰少女R</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="JS/jquery-1.12.4.js"></script>
<link rel="stylesheet" type="text/css" href="statics/CSS/background.css">
<script type="text/javascript" src="JS/jquery-1.12.4.js"></script>
</head>
<style type="text/css">
* {
	font-weight:bold;
	color: #3D3D3D;
}

a {
	color: #FF00FF;
	text-decoration: none
}

a:hover {
	color: #FF7F00;
	text-decoration: underline;
}
#centerDiv{
	width:280px;
	margin: 30px auto;
}
</style>

<script type="text/javascript">
	$(function() {
		$("#save").click(function() {
			var code = $("#code").val().trim();
			var name = $("#sname").val().trim();
			var nid = $("#nid").val();
			var tid = $("#tid").val();
			var state = $("input[name=state]").val();
			var temp = document.getElementsByName("state");
			for (i = 0; i < temp.length; i++) {
				//遍历Radio 
				if (temp[i].checked) {
					//获取Radio的值 
					state = temp[i].value;
				}
			}
		 	if (isEmpty(code,name,nid,tid,state)) {
				$.ajax({
					type : "post",
					data : {
						"ship.code" : code,
						"ship.name" : name,
						"ship.nationality.nid" : nid,
						"ship.stype.tid" : tid,
						"ship.state" : state
					},
					url : "ship!add.action",
					success : function(data) {
						if (data == "true") {
							alert("添加成功");
							$("input[type=reset]").trigger("click");
						}
						if (data == "false") {
							alert("添加失败");
						}
					}
				});
			} 

		})

		$("#code").blur(function() {
			var code = $("#code").val().trim();
			$.ajax({
				type : "get",
				data : {
					"ship.code" : code
				},
				url : "ship!selByCode.action",
				success : function(data) {
					if (data == "true") {
						alert("司令官，" + code + "号舰娘已在船坞了!(○^～^○) ~~~");
					}
				}
			})
		})

		function isEmpty(code,name,nid,tid,state) {
			if (code.length == 0) {
				alert("舰船编号不能为空!");
				$("#code").focus();
				return false;
			} else if (name.length == 0) {
				$("#sname").focus();
				alert("舰娘名不能为空!");
				return false;
			} else if (nid == 0) {
				alert("请选择舰娘国籍！");
				return false;
			} else if (tid == 0) {
				alert("请选择舰船种类");
				return false;
			}
			return true;
		}
	})
</script>
<body>
	<div id="centerDiv">
	<form>
		<table>
			<thred>
			<tr>
				<td colspan="2" align="center"><a href="ship!readShipList.action"><h1>战舰少女R</h1>
				</a>
				</td>
			</tr>
			</thred>
			<tbody>
				<tr>
					<td align="right">编号：</td>
					<td><input type="text" id="code" name="ship.code">
					</td>
				</tr>
				<tr>
					<td align="right">船名：</td>
					<td><input type="text" id="sname" name="ship.name">
					</td>
				</tr>
				<tr>
					<td align="right">国籍：</td>
					<td><select id="nid" name="ship.nid">
							<option value="0">请选择</option>
							<c:forEach items="${nlist }" var="item">
								<option value="${item.nid }">${item.nname } -
									${item.logogram }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td align="right">舰型：</td>
					<td><select id="tid" name="ship.tid">
							<option value="0">请选择</option>
							<c:forEach items="${tlist }" var="item">
								<option value="${item.tid }">${item.tname } -
									${item.simple }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>状态：</td>
					<td><input type="radio" name="state" id="huode" value="1"
						checked="checked">已获得 <input type="radio" name="state"
						id="nohuode" value="0">未获得</td>
				</tr>
			</tbody>
		</table>
		<input type="button" id="save" value="添加舰娘"
			style="width:130px;color:#008B45" /> <input type="reset" value="重置" style="width:130px;color:#008B45"/><br />
	</form>
	<br />

</div>
</body>
</html>
</script>