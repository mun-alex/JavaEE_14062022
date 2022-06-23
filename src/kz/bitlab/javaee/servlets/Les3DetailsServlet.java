package kz.bitlab.javaee.servlets;

import kz.bitlab.javaee.db.DBManagerJDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/lesson-3-details")
public class Les3DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long studentId = Long.parseLong(request.getParameter("studentId"));
        request.setAttribute("student", DBManagerJDBC.getStudentById(studentId));
        request.getRequestDispatcher("/les3details.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
