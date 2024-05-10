<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <title>发送请求</title>
</head>
<body>
<form action="doStudent.jsp" method="post" accept-charset="utf-8">
    <label>
        学生信息：
        <input type="text" name="info"/>
    </label><br/>
    <input type="submit" name="btn" value="提交"/>
</form>
</body>
</html>