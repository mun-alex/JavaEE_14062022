package kz.bitlab.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/lang-choice")
public class LangChoiceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lang = request.getParameter("langChoice");
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("lang")) {
                cookie.setValue(lang);
            } else {
                Cookie langCookie = new Cookie("lang", lang);
                langCookie.setMaxAge(60 * 60);
                response.addCookie(langCookie);
            }
        }
        response.sendRedirect("lesson-3");
    }
}
