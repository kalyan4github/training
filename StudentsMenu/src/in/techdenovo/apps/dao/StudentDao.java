package in.techdenovo.apps.dao;

import in.techdenovo.apps.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentDao {
//    Student s = new Student();
    List<Student> studentList = new ArrayList<>();
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

        studentList.add(newStudent);
    }
    public void displayStudentData(){
        for(Student s : studentList)
            System.out.println(s.getId()+"\t"+s.getFirstName()+"\t"+s.getLastName()+"\t"+s.getMobileNo());

    }
    public void updateStudent(){
        boolean option= true;
        do {
            System.out.println("****UPDATE Menu*******");
            System.out.println("1. First Name ");
            System.out.println("2. Last Name");
            System.out.println("3. Mobile Number");
            System.out.println("4. Main Menu");
            System.out.println("*************");
            System.out.print("Enter Choice: ");
            Scanner scanner= new Scanner(System.in);
            int ch = scanner.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter Student Id: ");
                    int id = scanner.nextInt();
                    for (Student s : studentList){
                        if(id==s.getId()){
                            System.out.println("Student with id: "+s.getId()+" First Name is "+s.getFirstName());
                            System.out.println("Enter new First Name");
                            s.setFirstName(scanner.next());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Display Student Data");

                    break;
                case 3:
                    System.out.println("Update Student Data");

                    break;
                case 4:
                    option=false;
                    break;
            }
        }while (option);
    }
}
