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
    request.setAttribute("name", "Tom");
    request.setAttribute("pwd", "123");
%>

<%--<jsp:forward page="result.jsp"/>--%>
<a href="./result.jsp">跳转</a>
</body>
</html>
