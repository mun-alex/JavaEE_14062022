package kz.bitlab.javaee.servlets;

import kz.bitlab.javaee.db.DBManager;
import kz.bitlab.javaee.models.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/lesson-1-task-2")
public class Les1Task2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBManager dbManager = new DBManager();
        List<Person> people = dbManager.getAllPersons();
        request.setAttribute("people", people);
        request.getRequestDispatcher("/les1-task2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("studentName");
        String lastName = request.getParameter("studentLastName");
        Person person = new Person(name, lastName);

        DBManager dbManager = new DBManager();
        dbManager.addPerson(person);
        response.sendRedirect("/lesson-1-task-2");
    }
}
