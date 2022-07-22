package in.techdenovo.apps.controller;

import in.techdenovo.apps.dao.StudentDao;
import in.techdenovo.apps.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/students")
public class ListStudentServlet extends HttpServlet {
    StudentDao studentDao = new StudentDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentDao.getAllStudents();
        req.setAttribute("Students",studentList);
        req.getRequestDispatcher("list-students.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
