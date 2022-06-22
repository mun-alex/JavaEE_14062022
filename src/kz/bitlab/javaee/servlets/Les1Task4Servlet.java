package kz.bitlab.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/lesson-1-task-4")
public class Les1Task4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String userSurname = request.getParameter("usersurname");;
        String food = request.getParameter("food");

        if (food != null) {
            switch (food) {
                case "1":
                    food = "Manty";
                    break;
                case "2":
                    food = "Burger";
                    break;
                case "3":
                    food = "Doner";
                    break;
                default:
                    break;
            }
        } else food = "";


        request.setAttribute("username", userName);
        request.setAttribute("usersurname", userSurname);
        request.setAttribute("food", food);
        request.getRequestDispatcher("/les1-task4.jsp").forward(request, response);
    }
}
