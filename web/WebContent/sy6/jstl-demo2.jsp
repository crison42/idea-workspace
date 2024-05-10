<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<% pageContext.setAttribute("userName", "rjxy"); %>
<% request.setAttribute("bookName", "Java Web"); %>
<% session.setAttribute("userName", "rg2125"); %>
<% application.setAttribute("bookName", "Java 基础"); %>

<p>Page中的userName: ${pageScope.userName}</p>
<p>Request中的bookName: ${requestScope.bookName}</p>
<p>Session中的userName: ${sessionScope.userName}</p>
<p>Application中的bookName: ${applicationScope.bookName}</p>

<hr>
<c:remove var="userName" scope="page"/>
<c:remove var="bookName" scope="request"/>

<p>Page中的userName: ${pageScope.userName}</p>
<p>Request中的bookName: ${requestScope.bookName}</p>
<p>Session中的userName: ${sessionScope.userName}</p>
<p>Application中的bookName: ${applicationScope.bookName}</p>
</body>
</html>