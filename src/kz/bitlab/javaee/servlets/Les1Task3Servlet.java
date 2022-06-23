package kz.bitlab.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/lesson-1-task-3")
public class Les1Task3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("Username");
        String userSurname = request.getParameter("Usersurname");
        request.setAttribute("username", userName);
        request.setAttribute("usersurname", userSurname);
        request.getRequestDispatcher("/les1-task3.jsp").forward(request, response);
    }
}
