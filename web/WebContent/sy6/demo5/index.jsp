<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="./doIndex.jsp" method="post"></form>
<label>
    学生姓名:
    <input type="text" name="sname"/>
</label><br/>
<label>
    成绩:
    <input type="text" name="score"/>
</label><br/>
<input type="submit" name="btn" value="提交"/>
<input type="reset" name="btn" value="重置">
</body>
</html>
