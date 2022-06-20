<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 20.06.22
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/main.css">
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-5 m-auto mt-5">
            <form action="/main" method="post">
                <div class="mb-3">
                    <label for="studentName" class="form-label">Name</label>
                    <input type="text" class="form-control" name="studentName" id="studentName">
                </div>
                <div class="mb-3">
                    <label for="studentLastName" class="form-label">Last Name</label>
                    <input type="text" class="form-control" name="studentLastName" id="studentLastName">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>

    </div>
</div>
</body>
</html>
