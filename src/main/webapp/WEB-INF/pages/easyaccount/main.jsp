<%--
  Created by IntelliJ IDEA.
  User: zhangxinzhang
  Date: 15-11-29
  Time: 上午2:10
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<% request.setAttribute("url", request.getContextPath()); %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="${url}/easyaccount/add" method="post">
    <table>
        描述:
        <input type="text" name="content"/>
        金额:
        <input type="text" name="cost"/>
        Time:
        <input type="text" name="time" value="<%= new Date() %>"/>

        <input type="submit" value="确定"/>
    </table>
</form>
<table>
    <c:forEach items="${accounts}" var="var">
        <tr>
            <td>
                    ${ var.id }
            </td>
            <td>
                    ${ var.content }
            </td>
            <td>
                    ${ var.cost }
            </td>
            <td>
                    ${ var.time }
            </td>
            <td>
                <a href="/red/admin/updateUser.jsp?id=${var.id}">修改</a>
            </td>
            <td>
                <a href="/op/user?op=delete&&id=${var.id}">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
