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
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    long startTime = session.getCreationTime();
    long endTime = session.getLastAccessedTime();
    int time = (int) (endTime - startTime) / 1000;
    int ranNum = (int) session.getAttribute("ranNum");
    int counter = (int) session.getAttribute("counter");
%>
恭喜你猜对了<br>
你总共猜了<%=counter%>次<br>
共历时<%=time%>秒
该数字为<%=ranNum%>
</body>
</html>
