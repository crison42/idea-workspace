<%@ page import="JW.sy3.Bookinfo" %>
<%@ page import="java.util.ArrayList" %><%-- Created by IntelliJ IDEA. User: l Date: 2024/4/10 Time: 下午5:24 To change
      this template use File | Settings | File Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
</head>

<body>
<% Bookinfo book1 = new Bookinfo("1001", "java", 10);
    Bookinfo book2 = new Bookinfo("1002", "jsp", 3);
    Bookinfo book3 = new Bookinfo("1003", "oracle", 6);
    ArrayList<Bookinfo> blist = new ArrayList<Bookinfo>();
    blist.add(book1);
    blist.add(book2);
    blist.add(book3);
%>
<form action="doBookinfo.jsp" method="post">
    <table>
        <tr>
            <td>编号</td>
            <td>名称</td>
            <td>数量</td>
        </tr>
        <% int i = 0;
            for (Bookinfo book : blist) {
                i++;
        %>
        <tr>
            <td><%=book.getBookid() %>
            </td>
            <td><%=book.getBookname() %>
            </td>
            <td><input type="text" name="count" value=<%=book.getCount() %>></td>
        </tr>
        <%
            }
        %>
        <tr>
            <td colspan="3"><input type="submit" name="btn" value="计算"></td>
        </tr>
    </table>
</form>
</body>

</html>