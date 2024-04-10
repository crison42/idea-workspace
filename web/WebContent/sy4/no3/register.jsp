<%-- Created by IntelliJ IDEA. User: l Date: 2024/4/10 Time: 下午5:10 To change this template use File | Settings | File
  Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>发送请求</title>
</head>

<body>
<form action="./doregister.jsp" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    爱好：<input type="checkbox" name="hobby" value="篮球">篮球
    <input type="checkbox" name="hobby" value="足球">足球
    <input type="checkbox" name="hobby" value="乒乓球">乒乓球
    性别:<input type="radio" name="sex" value="男">男
    <input type="radio" name="sex" value="女">女<br>
    <input type="submit" value="提交">
    <input type="reset" value="重置">
</form>

</body>

</html>