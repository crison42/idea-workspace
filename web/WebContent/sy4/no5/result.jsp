<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/11
  Time: 上午10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    String name = (String) request.getAttribute("name");
    String password = (String) request.getAttribute("pwd");
    out.println("用户名：" + name + "密码：" + password);
%>
</body>
</html>
