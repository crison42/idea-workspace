<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2024/4/11
  Time: 上午9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String[] count = request.getParameterValues("count");
    int sum = 0;
    if (count != null) {
        for (String str : count) {
            out.println("借阅次数为:" + str + "<br/>");
            sum += Integer.parseInt(str);
        }
        out.println("总借阅次数为:" + sum);
    }
%>
</body>
</html>
