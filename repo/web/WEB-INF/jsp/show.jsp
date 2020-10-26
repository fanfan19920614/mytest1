<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2020/10/22
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <script type="text/javascript" src="../js/jquery-3.4.1.js"></script>
    <title>Title</title>

</head>

<body>
<center>
    设备信息
    <table cellpadding="0"border="1" >
        <tr>
            <th>编号</th>
            <th>设备名称</th>
            <th>设备价格</th>
            <th>设备描述</th>
            <th>出厂日期</th>
            <th>设备管理员</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${page.list}" var="p">
            <tr>
                <td>${p.id}</td>
                <td>${p.devicename}</td>
                <td>${p.price}</td>
                <td>${p.detail}</td>
                <td><fmt:formatDate value="${p.createtime}" pattern="yyyy-MM-dd"/></td>
                <td>${p.username}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/device/toUpdate.action?id=${p.id}">修改</a>
                    <a href="${pageContext.request.contextPath}/device/delete.action?id=${p.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <button onclick="jump(${page.firstPage})">首页</button>
    <button onclick="jump(${page.prePage})">上一页</button>
    <button onclick="jump(${page.nextPage})">下一页</button>
    <button onclick="jump(${page.lastPage})">尾页</button>第${page.pageNum}页/共${page.pages}页 共${page.total}条数据
</center>
</body>
<script>
    function jump(pageNum) {
       if (pageNum>0 && pageNum<=${page.lastPage}){
          location.href="${pageContext.request.contextPath}/device/toShow.action?pageNum="+pageNum;
       }
    }
</script>
</html>
