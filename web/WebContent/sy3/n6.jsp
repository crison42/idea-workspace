<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="JW.sy3.Bookinfo" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<!--以表格形式来显示图书信息 -->
<%
    Bookinfo book1=new Bookinfo("1001","java",10);
    Bookinfo book2=new Bookinfo("1002","jsp",3);
    Bookinfo book3=new Bookinfo("1003","oracle",6);
    ArrayList<Bookinfo> blist=new ArrayList<Bookinfo>();
    blist.add(book1); blist.add(book2);blist.add(book3);
%>
<!--html -->
<table>
    <tr><td>图书编号</td><td>图书名称</td><td>次数</td></tr>
    <%
        //java 脚本
        for(Bookinfo book:blist)
        {
    %>
    <!--html -->
    <tr>
        <td><%=book.getBookid() %></td>
        <td><%=book.getBookname() %></td>
        <td><%=book.getCount() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>