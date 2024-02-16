<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2/16/2024
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách sinh viên</h1>
<table border="1px" width="500px" cellpadding="10px" cellspacing="0">
    <tr>
        <td>ID</td>
        <td>Họ Và Tên</td>
        <td>Tuổi</td>
        <td>Giới Tình</td>
        <td>Phone</td>
        <td>Action</td>
    </tr>
    <c:forEach items="${students}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.fullName}</td>
            <td>${item.age}</td>
            <td>${item.sex ? "Nam" : "Nu"}</td>
            <td>${item.phone}</td>
            <td>Action</td>
        </tr>
    </c:forEach>
</table>
<a href="student?action=add">Thêm mới</a>
</body>
</html>
