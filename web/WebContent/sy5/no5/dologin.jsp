<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    Cookie[] cookies = request.getCookies();
    boolean isLoggedIn = false;

    // Check if the user is already logged in
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if ("username".equals(cookie.getName())) {
                isLoggedIn = true;
                break;
            }
        }
    }

    if (isLoggedIn) {
        response.sendRedirect("welcome.jsp");
    } else {
        if ("tom".equals(username) && "123456".equals(password)) {
            // Create a new cookie and set its value
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(20); // Cookie will expire in 20 seconds
            response.addCookie(cookie);
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
%>
</body>
</html>