package in.techdenovo.apps.dao;

import in.techdenovo.apps.model.Student;

import java.util.Scanner;

public class StudentDao {

    Student s =  new Student();
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  ID: ");
        s.setId(sc.nextInt());
        System.out.print("Enter First Name: ");
        s.setFirstName(sc.next());
        System.out.print("Enter Last Name: ");
        s.setLastName(sc.next());
        System.out.print("Enter Mobile No: ");
        s.setMobileNo(sc.next());
    }
    public void displayStudentData(){
        System.out.println();
        System.out.println("Student Id: "+s.getId());
        System.out.println("Student First Name: "+s.getFirstName());
        System.out.println("Student Last Name: "+s.getLastName());
        System.out.println("Student Mobile No: "+s.getMobileNo());
    }
    public void updateStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id: ");
        int id=sc.nextInt();
        if(id==s.getId()){
            System.out.println("Existing Mobile No: "+s.getMobileNo());
            System.out.print("Enter New Mobile Number");
            s.setMobileNo(sc.next());
        } else
            System.out.println("Invalid Student Id");
    }
}
