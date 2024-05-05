<%@ page contentType="text/html;charset=UTF-8" %>
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
