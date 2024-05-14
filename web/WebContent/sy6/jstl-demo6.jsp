<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="JW.sy6.Brand" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL Demo</title>
</head>
<body>
<%
    List<Brand> brands = new ArrayList<>();
    brands.add(new Brand(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火", 1));
    brands.add(new Brand(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
    brands.add(new Brand(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));
    request.setAttribute("brands", brands);// 存储 list 集合到 request 作用域

    int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    request.setAttribute("numlist", num);
%>

<%--suppress HtmlDeprecatedAttribute --%>
<table border="blod">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
    </tr>
    <c:forEach items="${brands}" var="brand">
        <tr>
            <td>${brand.id}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.capital}</td>
            <td>${brand.slogan}</td>
            <td>
                <c:choose>
                    <c:when test="${brand.type == 1}">
                        启用
                    </c:when>
                    <c:otherwise>
                        禁用
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
</table>

<c:forEach items="${numlist}" var="n" varStatus="status">
    ${n}
    <c:if test="${status.index % 3 == 2}">
        <br>
    </c:if>
</c:forEach>
</body>
</html>