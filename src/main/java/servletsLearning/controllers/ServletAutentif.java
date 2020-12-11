package servletsLearning.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/autentification")
public class ServletAutentif extends HttpServlet {


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Service service = new Service();
        String emailOut = req.getParameter("email");

        boolean checkInModel = service.checkUser(emailOut);

        if (checkInModel) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/successfulReg.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/registrationPage.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}