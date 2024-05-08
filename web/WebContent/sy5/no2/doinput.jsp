<%@ page contentType="text/html;charset=UTF-8" %>
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
    String numTxt01 = request.getParameter("numtxt");
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
