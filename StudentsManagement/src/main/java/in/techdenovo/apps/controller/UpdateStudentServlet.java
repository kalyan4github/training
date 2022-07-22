package in.techdenovo.apps.controller;

import in.techdenovo.apps.dao.StudentDao;
import in.techdenovo.apps.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update-student")
public class UpdateStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id =Integer.parseInt(req.getParameter("id"));
        StudentDao studentDao = new StudentDao();
        Student student= studentDao.getStudentById(id);
        req.setAttribute("student",student);
        req.getRequestDispatcher("update-student.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student();
        student.setId(Integer.parseInt(req.getParameter("id")));
        student.setFirstName(req.getParameter("first-name"));
        student.setLastName(req.getParameter("last-name"));
        student.setMobileNo(req.getParameter("mobile-no"));
        student.setCity(req.getParameter("city"));

        StudentDao studentDao = new StudentDao();
        studentDao.updateStudent(student);
        resp.sendRedirect("home.jsp");
    }
}
