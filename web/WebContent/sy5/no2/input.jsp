<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/30
  Time: 下午3:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>产生随机数</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    int counter = 0;
    session.setAttribute("counter", counter);
    int ranNum = (int) (Math.random() * 100);
    session.setAttribute("ranNum", ranNum);
%>
随机分配一个一个0~99之间的数，请输入你所猜的数字：
<form action="doinput.jsp" method="post" name="form1">
    <input type="text" name="numtxt">
    <input type="submit" name="submit" value="提交">
</form>
</body>
</html>
