<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<form id="form1" action="upload.action" method="POST" enctype="multipart/form-data">
	<table>
			<tr>
				<td><input type="file" name="uploadFile" />上传照片</td>
			</tr>
			<!-- <tr>
				<td><input type="file" name="uploadFiles" />上传照片</td>
			</tr>
			<tr>
				<td><input type="file" name="uploadFiles" />上传照片</td> -->
			</tr>
		<tr><td><input type="button" onclick="test()"></td></tr>
		</table>
	</form>
</body>
<script type="text/javascript">
	function test() {
		var form1 = document.getElementById("form1");
		form1.submit();
	}
</script>
</html>
