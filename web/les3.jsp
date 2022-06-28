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
    <%
        String name = (String) request.getAttribute("name");
        String surname = (String) request.getAttribute("surname");
        String birthdate = (String) request.getAttribute("birthdate");
        String city = (String) request.getAttribute("city");
    %>
    <div class="row">
        <div class="col-lg-4 mt-5">
            <form action="/lesson-3" method="post">
                <div class="mb-3">
                    <label for="studentName" class="form-label"><%=name%></label>
                    <input type="text" class="form-control" name="studentName" id="studentName">
                </div>
                <div class="mb-3">
                    <label for="studentSurame" class="form-label"><%=surname%></label>
                    <input type="text" class="form-control" name="studentSurname" id="studentSurame">
                </div>
                <div class="mb-3">
                    <label for="studentBirthdate" class="form-label"><%=birthdate%></label>
                    <input type="date" class="form-control" name="studentBirthdate" id="studentBirthdate">
                </div>
                <div class="mb-3">
                    <label for="studentCity" class="form-label"><%=city%></label>
                    <input type="text" class="form-control" name="studentCity" id="studentCity">
                </div>
                <button type="submit" class="btn btn-primary">Add Student</button>
            </form>
        </div>
        <div class="col-lg-8 mt-5">
            <table class="table table-striped">
                <thead class="table-light">
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Surname</th>
                    <th scope="col">Birthdate</th>
                    <th scope="col">City</th>
                    <th scope="col">Details</th>
                </tr>
                </thead>
                <tbody>
                <%
                    List<Student> students = (List<Student>) request.getAttribute("students");
                    for (Student student : students) {
                %>
                <tr>
                    <td><%=student.getId()%></td>
                    <td><%=student.getName()%></td>
                    <td><%=student.getSurname()%></td>
                    <td><%=student.getBirthday()%></td>
                    <td><%=student.getCity()%></td>
                    <td><a href="/lesson-3-details?studentId=<%=student.getId()%>" class="btn btn-dark">details</a></td>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
