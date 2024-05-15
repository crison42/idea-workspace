<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>第一个 jsp 页面</title>
</head>
<body>
<h1>这是第一个 jsp 页面</h1>
<hr>
<a href="FirstServlet">这是第一个 GET 请求</a>
<br/>
<a href="<%=request.getContextPath() %>/FirstServlet">这是第二个 GET 请求</a>

</body>
</html>