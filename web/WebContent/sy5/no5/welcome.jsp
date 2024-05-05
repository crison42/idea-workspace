<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String username = null;
    Cookie[] cookies = request.getCookies();

    // Retrieve the username from the cookie
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if ("username".equals(cookie.getName())) {
                username = cookie.getValue();
                break;
            }
        }
    }

    if (username != null) {
%>
欢迎<%=username%>登录系统
<a href="doinvalidate.jsp">注销</a>
<%
    } else {
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>