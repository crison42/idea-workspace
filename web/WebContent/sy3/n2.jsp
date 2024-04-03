<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.*" %>
<!--import 属性 -->
<!-- 在页面上输出当前时间 格式输出 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
<%
    Date date=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH:mm:ss");

    String nowtime=sdf.format(date);
    out.print(nowtime);
%>
</body>
</html>