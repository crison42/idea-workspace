<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>If Example</title>
</head>
<body>
<%
    String action = request.getParameter("action");
    if (action != null) {
        switch (action) {
            case "monday":
                out.println("欢迎光临，今天是星期一！");
                break;
            case "tuesday":
                out.println("欢迎光临，今天是星期二！");
                break;
            case "wednesday":
                out.println("欢迎光临，今天是星期三！");
                break;
            case "thursday":
                out.println("欢迎光临，今天是星期四！");
                break;
            case "friday":
                out.println("欢迎光临，今天是星期五！");
                break;
            case "saturday":
                out.println("欢迎光临，今天是星期六！");
                break;
            case "sunday":
                out.println("欢迎光临，今天是周日！");
                break;
            default:
                out.println("操作参数无效.");
                break;
        }
    } else {
        out.println("请提供action参数.");
    }
%>
</body>
</html>