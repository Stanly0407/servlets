package servletsLearning.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@WebServlet("/newRegistration")
public class ServletNewUser extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Service service = new Service();
        String name = req.getParameter("name");
        String emailOut = req.getParameter("email");
        String password = req.getParameter("password");

        boolean checkInModel = service.checkUser(emailOut);

        System.out.println(emailOut);

        if (checkInModel) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(req, resp);
        } else {
                service.addUser(name, emailOut, password);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/successfulReg.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

}

