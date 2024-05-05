<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>发送请求</title>
</head>
<body>
<form action="dologin.jsp" method="post">
    用户名：<label>
    <input type="text" name="username"/>
</label><br/>
    密码：<label>
    <input type="text" name="password"/>
</label><br/>
    <input type="submit" name="btn" value="提交"/>
    <input type="reset" name="btn" value="重置"/>
</form>
</body>
</html>
