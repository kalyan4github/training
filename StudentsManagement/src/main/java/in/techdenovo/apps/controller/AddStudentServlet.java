package in.techdenovo.apps.controller;

import in.techdenovo.apps.dao.StudentDao;
import in.techdenovo.apps.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add-student")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("add-student.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student();
        student.setFirstName(req.getParameter("first-name"));
        student.setLastName(req.getParameter("last-name"));
        student.setMobileNo(req.getParameter("mobile-no"));
        student.setCity(req.getParameter("city"));

        StudentDao studentDao = new StudentDao();
        studentDao.addStudent(student);

        PrintWriter writer = resp.getWriter();
        writer.println("<h1> " + student.getFirstName() + "Succesfully Added </h1>");
        writer.close();

    }
}
