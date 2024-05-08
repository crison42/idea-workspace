<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>隐式对象使用</title>
</head>
<body>
<h1>pageContext 对象使用</h1>
请求 URI 为：${pageContext.request.requestURI} <br/>
Content-Type 响应头：${pageContext.response.contentType} <br/>
服务器信息为：${pageContext.servletContext.serverInfo} <br/>
Servlet 注册名为：${pageContext.servletConfig.servletName} <br/>

<h1>param 对象使用</h1>
<form action="${pageContext.request.contextPath}/el-demo3.jsp">
    num1：<input type="text" name="num1"><br/>
    num2：<input type="text" name="num"><br/>
    num3：<input type="text" name="num"><br/> <br/>
    <input type="submit" value="提交"/>&nbsp;&nbsp;
    <input type="submit" value="重置"/>
    <hr/>
    num1：${param.num1}<br/>
    num2：${paramValues.num[0]}<br/>
    num3：${paramValues.num[1]}<br/>
</form>
<h1>initParam 对象的使用</h1>
Author 的值为：${initParam.author}
<h1>header 对象的使用</h1>
${header["host"]}
<br> ${headerValues["Accept-Language"][0]}
<br>
<h1>cookie 对象的使用</h1>
<%response.addCookie(new Cookie("username", "xiaoqian"));%>
${cookie.username}<br>
${cookie.username.name}<br>
${cookie.username.value}
</body>
</html>