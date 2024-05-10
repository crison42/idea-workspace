<%--suppress ALL --%>
<%@page import="java.util.HashMap" %>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test03</title>
</head>
<body>
<c:set var="author" value="xiaoqian" scope="session"></c:set>
<c:out value="${author}"></c:out>
<br>
<%--引入 JavaBean --%>
<jsp:useBean id="user" class="JW.sy2.Signon"></jsp:useBean>
<c:set value="xiaofeng" property="username" target="${user}"></c:set>
<c:out value="${user.username}"></c:out>
<br>
<%--新建一个 Map 集合，并存入 request 域--%>
<%
    HashMap map = new HashMap();
    request.setAttribute("map", map);
%>
<c:set value="Java Web" property="course" target="${map}"></c:set>
<c:out value="${map.course}"></c:out>
</body>
</html>