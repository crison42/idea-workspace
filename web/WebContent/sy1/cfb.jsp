<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/3/20
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= i; j++) {
            out.println(j+"*"+i+"="+(i*j));
        }
        out.println("<br>");
    }
%>
</body>
</html>
