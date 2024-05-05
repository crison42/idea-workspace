<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/30
  Time: 下午3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        接收数据并做出判断
        服务器端
    </title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    int counter = (int) session.getAttribute("counter");
    counter++;
    session.setAttribute("counter", counter);
    int ranNum = (int) session.getAttribute("ranNum");
    String numTxt01 = request.getParameter("numTxt");
    int numTxt = Integer.parseInt(numTxt01);
    if (ranNum > numTxt) {
        response.sendRedirect("small.jsp");
    } else if (numTxt > ranNum) {
        response.sendRedirect("large.jsp");
    } else {
        response.sendRedirect("success.jsp");
    }
%>
</body>
</html>
