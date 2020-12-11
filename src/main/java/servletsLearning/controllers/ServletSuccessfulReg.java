package servletsLearning.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/successful")
public class ServletSuccessfulReg extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/successfulReg.jsp";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        PrintWriter writer = response.getWriter();
        try {
            writer.println("<h2>Model.JDBC.User" + "</h2>");
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException e) {
                System.out.print(e.toString());
            }

        } catch (IOException e) {
            System.out.print(e.toString());
        }

    }
}

