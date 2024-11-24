<%--
  Created by IntelliJ IDEA.
  User: 周正浩
  Date: 2024/10/23
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="login" method="post">
    <table>
        <tr>
            <td><label>用户名：</label></td>
            <td><input type="text" id="username" name="username"> </td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><input type="password" id="password" name="password"> </td>
        </tr>
        <tr>
            <td><input type="submit" id="submit" value="登录"> </td>
        </tr>
    </table>
</form>
</body>
</html>
