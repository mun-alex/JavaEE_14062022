<%@ page import="java.util.List" %>
<%@ page import="kz.bitlab.javaee.models.Person" %>
<%@ page import="kz.bitlab.javaee.models.Person" %>
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
    <div class="row">
        <div class="col-lg-4 m-auto mt-5">
            <table class="table table-striped">
                <tbody>
                <%
                    Student student = (Student) request.getAttribute("student");
                %>
                <tr>
                    <td>Name:</td>
                    <td><%=student.getName()%></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><%=student.getSurname()%></td>
                </tr>
                <tr>
                    <td>Birthdate:</td>
                    <td><%=student.getBirthday()%></td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td><%=student.getCity()%></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
