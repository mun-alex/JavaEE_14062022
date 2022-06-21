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
  <ul class="nav">
    <li class="nav-item">
      <a class="nav-link" href="#">Lesson-1</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Lesson-2</a>
    </li>
  </ul>
    <div class="row mt-5">
      <div class="col-lg-4">
        <form action="/lesson-1-task-3" method="get">
          <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">NAME:</span>
            <input type="text" name="Username" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
          </div>
          <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon2">SURNAME:</span>
            <input type="text" name="Usersurname" class="form-control" placeholder="Usersurname" aria-label="Usersurname" aria-describedby="basic-addon2">
          </div>
          <button type="submit" class="btn btn-primary">SEND</button>
        </form>
        <%
          String userName = (String) request.getAttribute("username");
          String userSurname = (String) request.getAttribute("usersurname");
        %>
        <p class="mt-3 fs-4 fw-bold"><%=userName + " " + userSurname%></p>
      </div>
    </div>
  </div>
</body>
</html>
