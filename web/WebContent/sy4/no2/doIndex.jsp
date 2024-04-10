<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/10
  Time: 下午4:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String num = request.getParameter("num");
%>
<%=name%>
<%=num%>
</body>
</html>
