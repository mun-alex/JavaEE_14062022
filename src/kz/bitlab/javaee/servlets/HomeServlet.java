package kz.bitlab.javaee.servlets;

import kz.bitlab.javaee.db.DBManager;
import kz.bitlab.javaee.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value = "/main")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.print("<h2> Hello Marat </h2>");
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("studentName");
        String lastName = request.getParameter("studentLastName");
        Student student = new Student(name, lastName);

        DBManager dbManager = new DBManager();
        dbManager.addStudent(student);

        List<Student> students = dbManager.getAllStudents();
        System.out.println(students);
        request.getRequestDispatcher("index.html").forward(request, response);
    }
}
