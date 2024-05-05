<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    session.setMaxInactiveInterval(20);
    if ("tom".equals(username) && "123456".equals(password)) {
        session.setAttribute("username", username);
        response.sendRedirect("welcome.jsp");
    } else {
        response.sendRedirect("error.jsp");
    }
%>
</body>
</html>
