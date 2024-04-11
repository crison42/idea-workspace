<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/11
  Time: 上午10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String userName = request.getParameter("userName");
    String password = request.getParameter("password");
    if ("tom".equals(userName) && "12345".equals(password))
        response.sendRedirect("index.jsp");
    else
        response.sendRedirect("./page_1/404.html");
%>

</body>
</html>
