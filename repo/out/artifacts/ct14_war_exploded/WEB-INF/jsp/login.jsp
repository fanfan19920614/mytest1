<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2020/10/22
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<center>
    <font color="red">${error}</font>
    <form action="${pageContext.request.contextPath}/device/login.action" method="post">
        用户名：<input type="text" name="username" id="un"><br>
        密码：<input type="text" name="password" id="pw"><br>
        <input type="submit" value="登录">
    </form>
</center>
</body>
</html>
