<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/30
  Time: 下午6:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>网页访问次数的统计</title>
</head>
<body>
<%
    int number = 0;
    if (application.getAttribute("number") == null) {
        number = 1;
    } else {
        number = (int) application.getAttribute("number");
        number++;
    }
    out.println("您是第" + number + "访问者");
    application.setAttribute("number", number);
%>
</body>
</html>
