<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/10
  Time: 下午5:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接收请求</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String hobby[] = request.getParameterValues("hobby");
    String sex = request.getParameter("sex");
    if (hobby != null)
        for (String h : hobby) {
            out.print(h + "<br/>");
        }
    out.print("用户名：" + username + "<br/>");
    out.print("密码：" + password + "<br/>");
    out.print("性别：" + sex + "<br/>");
%>
</body>
</html>
