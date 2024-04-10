<%-- Created by IntelliJ IDEA. User: l Date: 2024/4/10 Time: 下午4:54 To change this template use File | Settings | File
  Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title></title>
</head>

<body>
<table>
    <% String pet = "猫类"; %>
    <tr>
        <td><a href="doIndex.jsp?name=birds&&num=2">鸟类</a></td>
    </tr>
    <tr>
        <td><a href="doIndex.jsp?name=<%=pet%>">猫类</a></td>
    </tr>
    <tr>
        <td><a href="doIndex.jsp?name=dogs">狗类</a></td>
    </tr>
    <tr>
        <td><a href="doIndex.jsp?name=fish">鱼类</a></td>
    </tr>
</table>
</body>

</html>