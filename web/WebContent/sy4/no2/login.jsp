<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>发送请求</title>
</head>
<body>
<form action="./dologin.jsp" method="post">
    用户名：<input type="text" name="uname"/><br/>
    密码：<input type="text" name="pwd"/><br/>
    <input type="submit" name="btn" value="登录"/>
    <input type="reset" name="btn" value="重置"/>
</form>
</body>
</html>