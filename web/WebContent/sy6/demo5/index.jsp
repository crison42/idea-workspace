<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Template</title>
</head>
<body>
<c:set var="score" value="${param.score}" scope="request"/>
<c:if test="${score>=60}">
    ${param.sname}成绩合格
</c:if>
<c:if test="${score<60}">
    ${param.sname}成绩不合格
</c:if>

<form action="doIndex.jsp" method="post">
    学生姓名: <input type="text" name="sname"/><br/>
    成绩: <input type="text" name="score"/><br/>
    <input type="submit" name="btn" value="提交"/>
    <input type="reset" name="btn" value="重置">
</form>
</body>
</html>
