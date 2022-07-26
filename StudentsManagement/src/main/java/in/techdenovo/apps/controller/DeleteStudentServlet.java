package in.techdenovo.apps.controller;

import in.techdenovo.apps.dao.StudentDao;
import in.techdenovo.apps.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-student")
public class DeleteStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id =Integer.parseInt(req.getParameter("id"));
        StudentDao studentDao = new StudentDao();
        Student student= studentDao.getStudentById(id);
        req.setAttribute("student",student);
        req.getRequestDispatcher("delete-student.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        StudentDao studentDao = new StudentDao();
        studentDao.deleteStudentById(id);
        resp.sendRedirect("students");
    }
}
