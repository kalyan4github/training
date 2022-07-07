package in.techdenovo.apps.dao;

import in.techdenovo.apps.model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao2File {

//    List<Student> studentList = new ArrayList<>();

    public void inputData(){
        Student newStudent =  new Student();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  ID: ");
        newStudent.setId(sc.nextInt());
        System.out.print("Enter First Name: ");
        newStudent.setFirstName(sc.next());
        System.out.print("Enter Last Name: ");
        newStudent.setLastName(sc.next());
        System.out.print("Enter Mobile No: ");
        newStudent.setMobileNo(sc.next());
        try {
            File file = new File("students.txt");
            FileWriter fwrite = new FileWriter(file);
            fwrite.write(newStudent.getId()+"\t"+newStudent.getFirstName()+"\t"+newStudent.getLastName()+"\t"+newStudent.getMobileNo());
            fwrite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        studentList.add(newStudent);
    }
    public void displayStudentData(){
        try {
            File file = new File("students.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.print(sc.next()+"\t");
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
