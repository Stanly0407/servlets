package servletsLearning.controllers;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/registration")
public class ServletReg extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/registrationPage.jsp";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            System.out.print(e.toString());

        } catch (IOException e) {
            System.out.print(e.toString());
        }
    }
}