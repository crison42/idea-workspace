<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>c:catch 标签</title>
</head>
<body>
<c:catch var="myException">
    <%
        int a = 1;
        int b = 0;
        out.print(a / b);
    %>
</c:catch>
<c:out value="${myException}"></c:out>
<br>
<c:out value="${myException.message}"></c:out>
</body>
</html>