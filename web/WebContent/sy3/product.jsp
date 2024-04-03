<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" import="java.util.List"%>
<%@ page import="JW.sy3.ProductDaoImp" %>
<%@ page import="JW.sy3.Product" %>
<%@ page import="java.sql.SQLException" %>
<html>
<head>
    <meta charset="UTF-8">
    <!--BootStrap 设计的页面支持响应式的 -->
    <meta name="viewport" content="width=device-width, initial￾scale=1">
    <title></title>
    <!--引入 BootStrap 的 CSS-->
    <link rel="stylesheet" href="css/bootstrap.css"
          type="text/css" />
    <!--引入 JQuery 的 JS 文件：JQuery 的 JS 文件要在 BootStrap 的 js 的文
    件的前面引入-->
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <!--引入 BootStrap 的 JS 的文件-->
    <script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
<%
    ProductDaoImp pdi=new ProductDaoImp();
    List<Product> plist;
    plist = pdi.queryAll();
%>
<div class=""><a href="#">添加产品</a></div>
<div class="row" style="height: 500px; text-align:
center;">
    <div class="col-md-10 col-md-push-1">
        <table class="table table-striped">
            <tr>
                <td>图书编号</td>
                <td>图书名称</td>
                <td>图书描述</td>
                <td>图书类别</td>
                <td>操作</td>
            </tr>
            <%for(Product p:plist) { %>
            <tr>
                <td><%=p.getProductid() %></td>
                <td><%=p.getName() %></td>
                <td><%=p.getDescn() %></td>
                <td><%=p.getCategoryname() %></td>
                <td><a href="#">修改</a><a href="#">删除
                </a></td>
            </tr>
            <%} %>
        </table>
    </div>
</div>
</body>
</html>