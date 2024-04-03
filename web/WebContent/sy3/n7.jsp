<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html>
<head>
    <title>脚本程序进阶 3</title>
</head>
<body>
<%
    out.print("<script>alert('helloworld')</script>");
    out.print("<script>window.location.href='./testJava3.jsp'</script>");
%>
</body>
</html>