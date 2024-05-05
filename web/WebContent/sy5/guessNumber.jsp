<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>猜数字游戏</title>
</head>
<body>
<%
    if (session.isNew()) {
        int ranNum = (int) (Math.random() * 100);
        session.setAttribute("ranNum", ranNum);
        session.setAttribute("counter", 0);
    }
%>
<h1>猜数字游戏</h1>
<p>随机分配一个0~99之间的数，请输入你猜的数字：</p>
<form action="guessNumber.jsp" method="post">
    <input type="text" name="numTxt">
    <input type="submit" value="提交">
</form>
<%
    String numTxt = request.getParameter("numTxt");
    if (numTxt != null) {
        int counter = (int) session.getAttribute("counter");
        counter++;
        session.setAttribute("counter", counter);
        int ranNum = (int) session.getAttribute("ranNum");
        int guess = Integer.parseInt(numTxt);
        if (guess < ranNum) {
%>
<p>猜的数字比实际要小，请再猜</p>
<%
} else if (guess > ranNum) {
%>
<p>猜的数字比实际要大，请再猜</p>
<%
} else {
%>
<h2>恭喜你猜对了！</h2>
<p>你总共猜了 <%= counter %> 次</p>
<p>该数字为 <%= ranNum %>
</p>
<%
    session.invalidate();
%>
<form action="guessNumber.jsp">
    <input type="submit" value="重新开始">
</form>
<%
        }
    }
%>
</body>
</html>