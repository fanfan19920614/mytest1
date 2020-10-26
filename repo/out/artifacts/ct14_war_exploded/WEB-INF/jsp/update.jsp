<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2020/10/22
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="${pageContext.request.contextPath}/device/update.action" method="post">
        <table cellpadding="0"border="1" >
            <tr>
                <th>设备名称<input type="text" name="devicename" value="${d.devicename}"></th>
                <th>设备价格<input type="text" name="price" value="${d.price}"></th>
                <th>设备描述<input type="text" name="detail" value="${d.detail}"></th>
                <th>出厂日期<input type="text" name="createtime" value="<fmt:formatDate value="${d.createtime}" pattern="yyyy-MM-dd"/>"></th>
                <th>设备管理员<input type="text" name="username" value="${d.username}" readonly="readonly"></th>
                <th><input type="submit" value="确认修改"></th>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
