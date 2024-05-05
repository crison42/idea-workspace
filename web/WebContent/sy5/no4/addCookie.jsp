<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/30
  Time: 下午6:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie c1 = new Cookie("uname", "tom");
    response.addCookie(c1);
    response.sendRedirect("getCookie.jsp");
%>
</body>
</html>
