package in.techdenovo.apps.dao;

import in.techdenovo.apps.model.Student;
import in.techdenovo.apps.util.DbUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao2Database {

    List<Student> studentList = new ArrayList<>();

    DbUtil dbUtil = new DbUtil();

    public void inputData(){
        Student newStudent =  new Student();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        newStudent.setFirstName(sc.next());

        System.out.print("Enter Last Name: ");
        newStudent.setLastName(sc.next());

        System.out.print("Enter Mobile No: ");
        newStudent.setMobileNo(sc.next());

        try {
            Connection conn= dbUtil.getConnection();
            if(conn!=null){
                String query = "insert into students (first_name,last_name,mobile_no) values (?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);

                ps.setString(1,newStudent.getFirstName());
                ps.setString(2,newStudent.getLastName());
                ps.setString(3,newStudent.getMobileNo());

                ps.executeUpdate();
                System.out.println("Sucessfully Added to Database");
                conn.close();
            }else {
                System.out.println("Connection is: "+conn);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        studentList.add(newStudent);
    }
    public void displayStudentData(){
        try {
            Connection conn= dbUtil.getConnection();
            String query= "SELECT * FROM students";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("ID")+"\t"+rs.getString("first_name")+"\t"+rs.getString("last_name")+"\t"+rs.getString("mobile_no"));
            }
            conn.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void updateStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of the student: ");
        int id = sc.nextInt();
        try {
            Connection conn = dbUtil.getConnection();
            Student existingStudent = new Student();
            if(conn!=null){
                String query = "select * from students where id = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,id);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    existingStudent.setId(rs.getInt("id"));
                    existingStudent.setFirstName(rs.getString("first_name"));
                    existingStudent.setLastName(rs.getString("last_name"));
                    existingStudent.setMobileNo(rs.getString("mobile_no"));
                    existingStudent.setCity(rs.getString("city"));

                    System.out.println("Existing Data ");
                    System.out.println(existingStudent.getId()+"\t"+existingStudent.getFirstName()+"\t"+existingStudent.getLastName()+"\t"+existingStudent.getMobileNo()+"\t"+existingStudent.getCity());

                    System.out.println("Enter the city: ");
                    existingStudent.setCity(sc.next());

                    String updateQuery="UPDATE students SET city =? WHERE id =?";
                    PreparedStatement ps1 = conn.prepareStatement(updateQuery);
                    ps1.setString(1,existingStudent.getCity());
                    ps1.setInt(2,existingStudent.getId());

                    ps1.executeUpdate();
                }else {
                    System.out.println("Student with such id doesnot exists");
                }


            }else {
                System.out.println("Connection is: "+conn);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
