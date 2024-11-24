<%--
  Created by IntelliJ IDEA.
  User: 周正浩
  Date: 2024/11/3
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
<form action="updateAnUser" method="post">
  <table>
    <tr>
      <td><label>输入要修改的用户名：</label></td>
      <td><input type="text" id="oldUsername" name="oldUsername"> </td>
    </tr>
    <tr>
      <td><label>输入修改后的用户名：</label></td>
      <td><input type="text" id="newUsername" name="newUsername"> </td>
    </tr>
    <tr>
      <td><label>输入修改后的密码：</label></td>
      <td><input type="text" id="newPassword" name="newPassword"> </td>
    </tr>
    <tr>
      <td><input type="submit" id="submit" value="提交"> </td>
    </tr>
  </table>
</form>
</body>
</html>
