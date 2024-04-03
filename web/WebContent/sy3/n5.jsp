<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>

<%@ page import="java.util.ArrayList" %>
<%@ page import="JW.sy3.Bookinfo" %>
<html>
<head>
    <title>表格格式显示图书信息</title>
</head>
<body>
<!--以表格形式来显示图书信息 -->
<%
    Bookinfo book1=new Bookinfo("1001","java",10);
    Bookinfo book2=new Bookinfo("1002","jsp",3);
    Bookinfo book3=new Bookinfo("1003","oracle",6);
    ArrayList<Bookinfo> blist=new ArrayList<Bookinfo>();
    blist.add(book1); blist.add(book2);blist.add(book3);
    out.print("<table>");
    out.print("<tr>");
    out.print("<td>");
    out.print("图书编号");
    out.print("</td>");
    out.print("<td>");
    out.print("图书名称");
    out.print("</td>");
    out.print("<td>");
    out.print("借阅次数");
    out.print("</td>");
    out.print("</tr>");
    for(Bookinfo book:blist)
    {
        out.print("<tr>");
        out.print("<td>");
        out.print(book.getBookid());
        out.print("</td>");
        out.print("<td>");
        out.print(book.getBookname());
        out.print("</td>");
        out.print("<td>");
        out.print(book.getCount());
        out.print("</td>");
        out.print("</tr>");
    }
    out.print("</table>");
%>
</body>
</html>