<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body></body>
<p>num1 : <%=request.getParameter("num1")%>
</p>
<p>num2 : <%=request.getParameter("num2")%>
</p>
<form action="/calc/input" method="post">
    <input type="text" name="num1">
    <input type="text" name="num2">
    <button type="submit">SEND</button>
</form>



</html>
