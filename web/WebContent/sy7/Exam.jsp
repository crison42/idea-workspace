<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>简单的网上试题自动评测-试题</title>
</head>
<body>
<%--<form action="Show.jsp" method="post">--%>
<form action="/evaluate" method="post">
    一、2+3=？<br>
    <input type="radio" name="r1" value="2"
           checked="checked">2&nbsp;&nbsp;
    <input type="radio" name="r1" value="3">3&nbsp;&nbsp;
    <input type="radio" name="r1" value="4">4&nbsp;&nbsp;
    <input type="radio" name="r1" value="5">5&nbsp;&nbsp;<br>
    二、下列哪些是偶数？<br>
    <input type="checkbox" name="c1" value="2">2&nbsp;&nbsp;
    <input type="checkbox" name="c1" value="3">3&nbsp;&nbsp;
    <input type="checkbox" name="c1" value="4">4&nbsp;&nbsp;
    <input type="checkbox" name="c1" value="5">5&nbsp;&nbsp;<br>
    三、下列哪些是动态网页？<br>
    <select size="4" name="list1" multiple="multiple">
        <option value="asp">ASP</option>
        <option value="php">PHP</option>
        <option value="htm">HTML</option>
        <option value="jsp">JSP</option>
        <option value="xml" selected="selected">XML</option>
    </select><br>
    四、下列组件哪个是服务器端的？<br>
    <label>
        <select size="1" name="list2">
            <option value="html">HTML</option>
            <option value="servlet">Servlet</option>
            <option value="java">java</option>
            <option value="jdbc">jdbc</option>
        </select>
    </label><br>
    五、在服务器端用来接受用户请求的对象是：<br>
    <input size="20" name="text1">
    <div align="left">
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </div>
</form>
</body>
</html>