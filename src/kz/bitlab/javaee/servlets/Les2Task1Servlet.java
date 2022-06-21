package kz.bitlab.javaee.servlets;

import kz.bitlab.javaee.db.DBManager;
import kz.bitlab.javaee.models.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/lesson-2-task-1")
public class Les2Task1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBManager dbManager = new DBManager();
        request.setAttribute("items", dbManager.getAllItems());
        request.getRequestDispatcher("/les2-task1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemName = request.getParameter("itemName");
        double itemPrice = Double.parseDouble(request.getParameter("itemPrice"));
        int itemAmount = Integer.parseInt(request.getParameter("itemAmount"));
        DBManager dbManager = new DBManager();
        dbManager.addItem(new Item(0L, itemName, itemPrice, itemAmount));
        request.getRequestDispatcher("/les2-task1-addForm.jsp").forward(request, response);
    }
}
