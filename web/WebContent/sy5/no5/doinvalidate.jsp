<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // Delete the username cookie
    Cookie cookie = new Cookie("username", "");
    cookie.setMaxAge(0);
    response.addCookie(cookie);
    response.sendRedirect("login.jsp");
%>
</body>
</html>