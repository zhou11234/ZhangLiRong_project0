<%--
  Created by IntelliJ IDEA.
  User: 周正浩
  Date: 2024/11/3
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除用户</title>
</head>
<body>
<form action="deleteAnUser" method="post">
  <table>
    <tr>
      <td><label>输入用户名：</label></td>
      <td><input type="text" id="username" name="username"> </td>
    </tr>
    <tr>
      <td><input type="submit" id="submit" value="提交"> </td>
    </tr>
  </table>
</form>
</body>
</html>
