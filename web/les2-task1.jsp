<%@ page import="kz.bitlab.javaee.models.Item" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.06.22
  Time: 11:32
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
    <title>Title</title>
</head>
<body>
    <div class="container">
        <ul class="nav bg-success text-uppercase">
            <li class="nav-item d-flex align-items-center">
                <a class="nav-link text-white fs-3" href="#">bitlab shop</a>
            </li>
            <li class="nav-item d-flex align-items-center">
                <a class="nav-link text-light fs-5" href="/lesson-2-task-1">all items</a>
            </li>
            <li class="nav-item d-flex align-items-center">
                <a class="nav-link text-light fs-5" href="/les2-task1-addForm.jsp">add item</a>
            </li>
        </ul>
        <div class="row">
            <div class="col-lg">
                <table class="table table-striped mt-3">
                    <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">NAME</th>
                        <th scope="col">PRICE</th>
                        <th scope="col">AMOUNT</th>
                        <th scope="col">DETAILS</th>
                    </tr>
                    </thead>
                    <tbody class="table-group-divider">
                    <%
                        List<Item> items = (List<Item>) request.getAttribute("items");
                        if (items != null) {
                        for (Item item : items) {
                    %>
                    <tr>
                        <td><%=item.getId()%></td>
                        <td><%=item.getName()%></td>
                        <td><%=item.getPrice()%></td>
                        <td><%=item.getAmount()%></td>
                        <td>
                            <a href="" class="btn btn-dark">DETAILS</a>
                        </td>
                    </tr>
                    <%
                            }
                        }
                    %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
