<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    request.setAttribute("num", 1234);
    String ss = "123";
    request.setAttribute("ss", ss);
%>
<h1>算术运算</h1>
${num+1}<br/>
${num-1}<br/>
${num*1}<br/>
${num div 2}<br/>
${num mod 2}<br/>
${num+ss}<br/>
<hr>
<h1>关系运算</h1>
${num==1234}<br/>
${num!=1234}<br/>
${num>1200}<br/>
${num<1200}<br/>
${num>=1234}<br/>
${num<=1234}<br/>
<hr>
逻辑运算</h1>
${num%2==0||num/2==1}<br/>
${num%2==0&&num/4==0}<br/>
${!(num>1234)}<br/>
<hr>
<%
    String s1 = "";
    pageContext.setAttribute("s1", s1);
    String s2 = null;
    pageContext.setAttribute("s2", s2);
    String s3 = "1223";
    pageContext.setAttribute("s3", s3);
    List list1 = new ArrayList();
%>
<h1>empty 运算符</h1>
${empty s1}<br/>
${empty s2}<br/>
${empty s3}<br/>
${empty list1}<br/>
</body>
</html>