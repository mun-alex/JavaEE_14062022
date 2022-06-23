package kz.bitlab.javaee.servlets;

import kz.bitlab.javaee.db.DBManager;
import kz.bitlab.javaee.db.DBManagerJDBC;
import kz.bitlab.javaee.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/lesson-3")
public class Les3TaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", DBManagerJDBC.getAllStudents());
        request.getRequestDispatcher("/les3.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("studentName");
        String surname = request.getParameter("studentSurname");
        String birthdate = request.getParameter("studentBirthdate");
        String city = request.getParameter("studentCity");
        DBManagerJDBC.addStudent(new Student(null, name, surname, birthdate, city));
        response.sendRedirect("/lesson-3");
    }
}
