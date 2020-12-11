package servletsLearning.controllers;

import servletsLearning.model.User;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin")
public class ServletAdmin extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<User> users = Service.getAllUsers();

        request.setAttribute("users", users);

        getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);

    }
}

