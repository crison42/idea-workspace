<%@ page contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>表达式标签</title>
</head>
<body>
<%--第 1 个 out 标签 --%>
userName 属性的值为：
<c:out value="${param.username}" default="unknown"/><br/>
<%--第 2 个 out 标签 --%>
userName 属性的值为：
<c:out value="${param.username}">
    unknown
</c:out><br/>
<%--第 3 个 out 标签 --%>
<c:out value="${param.username }" escapeXml="true">
    <meta http-equiv="refresh"
          content="5;url=https://www.haust.edu.cn"/>
</c:out>
</body>
</html>