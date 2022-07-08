package kz.bitlab.javaee.servlets;

import kz.bitlab.javaee.db.DBManager;
import kz.bitlab.javaee.db.DBManagerJDBC;
import kz.bitlab.javaee.models.Student;
import kz.bitlab.javaee.models.Translation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/lesson-3")
public class Les3TaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isCookieLangExist = false;
        Cookie [] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("lang")) {
                switch (cookie.getValue()) {
                    case "0":
                        request.setAttribute("name", Translation.translation.get(0).get(0));
                        request.setAttribute("surname", Translation.translation.get(0).get(1));
                        request.setAttribute("birthdate", Translation.translation.get(0).get(2));
                        request.setAttribute("city", Translation.translation.get(0).get(3));
                        break;
                    case "1":
                        request.setAttribute("name", Translation.translation.get(1).get(0));
                        request.setAttribute("surname", Translation.translation.get(1).get(1));
                        request.setAttribute("birthdate", Translation.translation.get(1).get(2));
                        request.setAttribute("city", Translation.translation.get(1).get(3));
                        break;
                    default:
                        break;
                }
                isCookieLangExist = true;
            }
            if (!isCookieLangExist) {
                request.setAttribute("name", Translation.translation.get(1).get(0));
                request.setAttribute("surname", Translation.translation.get(1).get(1));
                request.setAttribute("birthdate", Translation.translation.get(1).get(2));
                request.setAttribute("city", Translation.translation.get(1).get(3));
            }
        }
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
