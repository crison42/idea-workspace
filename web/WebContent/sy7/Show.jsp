<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>简单的网上试题自动评测-评测</title>
</head>
<body>
<%
    String s1 = request.getParameter("r1");
    if (s1 != null) {
        out.print("一、解答为：2+3=" + s1 + " ");
        if (s1.equals("5"))
            out.println("正确！" + "<br>");
        else
            out.println("错误！" + "<br>");
    } else
        out.println("一、没有解答！");
    out.println("----------------------");
    String[] s21 = request.getParameterValues("c1");
    if (s21 != null) {
        out.print("二、解答为：偶数有：");
        for (String s : s21) {
            out.println(s + " ");
        }
        if (s21.length == 2 && s21[0].equals("2") && s21[1].equals("4"))
            out.println("正确！" + "<br>");
        else
            out.println("错误！" + "<br>");
    } else
        out.println("二、没有解答！" + "<br>");
    out.println("----------------------");
    String[] s31 = request.getParameterValues("list1");
    if (s31 != null) {
        out.print("三、解答为：动态网页有：");
        for (String s : s31) {
            out.println(s + " ");
        }

        if (s31.length == 3 && s31[0].equals("asp") && s31[1].equals("php") &&
                s31[2].equals("jsp"))
            out.println("正确！" + "<br>");
        else
            out.println("错误！" + "<br>");
    } else
        out.println("三、没有解答！");
    out.println("----------------------");
    String s4 = request.getParameter("list2");
    if (s4 != null) {
        out.print("四、解答为：服务器端的组件是有：");
        out.println(s4 + " ");
        if (s4.equals("servlet"))
            out.println("正确！" + "<br>");
        else
            out.println("错误！" + "<br>");
    } else
        out.println("四、没有解答！");
    out.println("----------------------");
    String s5 = request.getParameter("text1");
    if (s5 != null) {
        out.print("五、解答为：在服务器端用来接受用户请求的对象是 ：");
        out.println(s5 + " ");
        if (s5.equals("request"))
            out.println("正确！" + "<br>");
        else
            out.println("错误！" + "<br>");
    } else
        out.println("五、没有解答！");
    out.println("----------------------");
%>
</body>
</html>