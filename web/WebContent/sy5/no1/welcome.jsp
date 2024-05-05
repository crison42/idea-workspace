<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = (String) session.getAttribute("username");
    session.removeAttribute("username");
%>
欢迎<%=username%>登录系统
<a href="doinvalidate.jsp">注销</a>
</body>
</html>
