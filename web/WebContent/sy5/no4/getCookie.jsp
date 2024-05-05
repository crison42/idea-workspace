<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/30
  Time: 下午6:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie c[] = request.getCookies();
    for (Cookie cookie : c) {
        if ("uname".equals(cookie.getName())) {
            out.print(cookie.getValue());
        }
    }
%>
</body>
</html>
