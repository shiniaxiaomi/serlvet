<%--
  Created by IntelliJ IDEA.
  User: lyj80
  Date: 2018/9/12
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  hello world

  <%--<form method="get" action="/ParamServlet">--%>
    <%--<table>--%>
      <%--<tr>--%>
        <%--<td>参数1:</td>--%>
        <%--<td><input name="param1"></td>--%>
      <%--</tr>--%>
      <%--<tr>--%>
        <%--<td>参数2:</td>--%>
        <%--<td><input name="param2"></td>--%>
      <%--</tr>--%>
    <%--</table>--%>
    <%--<button>提交</button>--%>
  <%--</form>--%>

  <form method="post" action="/ParamServlet">
    <table>
      <tr>
        <td>参数1:</td>
        <td><input name="param1"></td>
      </tr>
      <tr>
        <td>参数2:</td>
        <td><input name="param2"></td>
      </tr>
    </table>
    <button>提交</button>
  </form>

  </body>
</html>
