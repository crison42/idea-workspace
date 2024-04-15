<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>接收请求</title>
</head>

<body>
<% request.setCharacterEncoding("utf-8");
    String name = request.getParameter("uname");
    String password = request.getParameter("pwd"); %>
<h1>用户名：<%=name%>
</h1>
<h1>密码：<%=password%>
</h1>
</body>

</html>