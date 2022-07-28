package in.techdenovo.apps.controller;

import in.techdenovo.apps.dao.UserDao;
import in.techdenovo.apps.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.sendRedirect("login.jsp");
        req.getRequestDispatcher("login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        UserDao userDao = new UserDao();
        try {
            User user = userDao.checkLogin(username,password);
            String destPage = "/login.jsp";
            if(user!=null) {
                HttpSession oldHttpSession = req.getSession(false);
                if (oldHttpSession != null) {
                    oldHttpSession.invalidate();
                }
                HttpSession newHttpSession = req.getSession(true);
                newHttpSession.setAttribute("user",user);
                destPage = "/dashboard.jsp";
                newHttpSession.setMaxInactiveInterval(5 * 60);
            } else {
                String message = "Invalid email/password";
                req.setAttribute("message",message);
            }
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destPage);
            dispatcher.forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
