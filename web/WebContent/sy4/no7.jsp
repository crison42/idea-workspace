<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"
         import="java.util.*"
%>
<%@ page import="JW.sy4.no7.ProItemDaoImp" %>
<%@ page import="JW.sy4.no7.ProItem" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    ProItemDaoImp pidi = new ProItemDaoImp();//
    /*
     */
    List<ProItem> pilist = pidi.findAll();
%>
<%
    String[] price = request.getParameterValues("price");
    double sum = 0;
    if (price != null) {
        for (String str : price) {
            double p = Double.parseDouble(str);
            sum += p;
        }
    }
%>
<form action="">
    <table border=1>
        <tr>
            <td>
                图书名称
            </td>
            <td>
                图书价格
            </td>
            <td>
                图书状态
            </td>
            <td>
                操作
            </td>
        </tr>
        <%
            int i = 0;
            for (ProItem entity : pilist) {
        %>
        <tr>
            <td>
                <a href="##?bname=<%=entity.getName() %>">
                    <%= entity.getName() %>
                </a>
            </td>
            <td>
                <input type="text" name="price" id="price<%=i %>" value="<%=
entity.getListprice() %>"/>
            </td>
            <td>
                <%= entity.getStatus().equals("1") ? "已出库" : "未发货" %>
            </td>
            <td>
                <input type="button" name="btn" value="编辑"/>
            </td>
        </tr>
        <%
                i++;
            }
        %>
    </table>
    <input type="submit" name="btn" value="计算"/>
</form>
<%=sum %>
</body>
</html>