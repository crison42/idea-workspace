<jsp:useBean id="map1" scope="request" type="java.util.Map"/>
<jsp:useBean id="uname" scope="request" type="java.util.List"/>
<jsp:useBean id="age" scope="request" type="JW.sy6.Servlet1"/>
<jsp:useBean id="user" scope="request" type="JW.sy2.Signon"/>
<jsp:useBean id="username" scope="request" type="JW.sy6.Servlet1"/>
<jsp:useBean id="map" scope="request" type="JW.sy6.Servlet1"/>
<jsp:useBean id="brands" scope="request" type="JW.sy6.Servlet1"/>
<%@ page import="JW.sy2.Signon" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<html lang="zh">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
</head>
<body>
获取session中的字符串数据，基本类型数据<br>
<%=session.getAttribute("username")%><br>
${username}<br>
${sessionScope.username}<br>
${age}<br>

获取session中的对象数据<br>
<%=((Signon) session.getAttribute("user")).getUsername()%><br>
${user.username}默认调用对象的get方法<br>

获取存储在request中的数组数据<br>
<%=((String[]) request.getAttribute("uname"))[0]%><br>
${uname[0]}<br>
${requestScope.uname[0]}<br>

获取存储在request中的map集合的数据<br>
${requestScope.map}<br>
${map.get("uname")}<br>
${map["uname"]}<br>
${map.uname}<br>

获取存储在request作用域中的list集合的数据<br>
${brands}<br>
${brands[0].companyName}<br>
${brands.get(0).companyName}<br>

获取存储在request作用域中的map集合中的对象数据<br>
${map1["1"].companyName}<br>

</body>
</html>
