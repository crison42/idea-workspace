<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL Demo 5</title>
</head>
<body>
<form action="jstl-demo5.jsp" method="post">
    <label for="score">分数:</label>
    <input type="number" id="score" name="score" min="0" max="100" required>
    <input type="submit" value="提交">
</form>

<c:if test="${param.score != null}">
    <c:set var="score" value="${param.score}"/>
    <c:choose>
        <c:when test="${score >= 90}">
            <p>成绩为 A</p>
        </c:when>
        <c:when test="${score >= 80}">
            <p>成绩为 B</p>
        </c:when>
        <c:when test="${score >= 70}">
            <p>成绩为 C</p>
        </c:when>
        <c:when test="${score >= 60}">
            <p>成绩为 D</p>
        </c:when>
        <c:otherwise>
            <p>成绩为 F</p>
        </c:otherwise>
    </c:choose>
</c:if>
</body>
</html>