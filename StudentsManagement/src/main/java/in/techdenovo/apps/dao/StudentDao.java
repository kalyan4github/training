package in.techdenovo.apps.dao;

import in.techdenovo.apps.model.Student;
import in.techdenovo.apps.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    DbUtil dbUtil = new DbUtil();

    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();

        Connection con = dbUtil.getConnection();
        String query = "select * from students";
        if (con != null) {
            try {
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Student student = new Student();
                    student.setId(rs.getInt("id"));
                    student.setFirstName(rs.getString("first_name"));
                    student.setLastName(rs.getString("last_name"));
                    student.setMobileNo(rs.getString("mobile_no"));
                    student.setCity(rs.getString("city"));
                    studentList.add(student);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return studentList;
    }
}
