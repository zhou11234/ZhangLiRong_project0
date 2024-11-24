<%@ page import="java.util.List" %>
<%@ page import="com.zhou.pojo.UserPojo" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部用户</title>
</head>
<body>
  <div>
    <table>
      <tr align="center">
        <td>用户名</td>
        <td>密码</td>
      </tr>
      <%
        List UserPojoList = (List) request.getAttribute("userPojoList");
        for(int i = 0;i < UserPojoList.size();i++){
          UserPojo userPojo = (UserPojo) UserPojoList.get(i);

      %>

      <tr>
        <td><%=userPojo.getUsername()%></td>
        <td><%=userPojo.getPassword()%></td>
      </tr>

      <%
        }
      %>
    </table>
  </div>
</body>
</html>
