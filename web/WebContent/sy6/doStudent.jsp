<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
%>
<c:forTokens items="${param.info }" delims="," var="student">
    <c:out value="${student }"/>
</c:forTokens>
</body>
</html>