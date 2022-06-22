<%@ page import="java.util.List" %>
<%@ page import="kz.bitlab.javaee.models.Student" %><%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 16/6/22
  Time: 7:28 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
          crossorigin="anonymous"></script>
  <link rel="stylesheet" href="css/main.css">
  <title>Title</title>
</head>
<body>
<div class="container">
  <%@include file="nav.jsp"%>
    <div class="row mt-5">
      <div class="col-lg-4">
        <form action="/lesson-1-task-4" method="get">
          <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">NAME:</span>
            <input type="text" name="username" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
          </div>
          <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon2">SURNAME:</span>
            <input type="text" name="usersurname" class="form-control" placeholder="Usersurname" aria-describedby="basic-addon2">
          </div>
          <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon3">FOOD:</span>
            <select class="form-select" aria-describedby="basic-addon3" name="food">
              <option value="1">Manty - 900 KZT</option>
              <option value="2">Burger - 1000 KZT</option>
              <option value="3">Doner - 1200 KZT</option>
            </select>
          </div>
          <button type="submit" class="btn btn-primary">SEND</button>
        </form>
        <%
          String userName = (String) request.getAttribute("username");
          String userSurname = (String) request.getAttribute("usersurname");
          String food = (String) request.getAttribute("food");

          if (userName != null) {
        %>
        <p class="mt-3 fs-4 fw-bold"><%=userName + " " + userSurname + " ordered " + food%></p>
        <%
          }
        %>
      </div>
    </div>
  </div>
</body>
</html>
