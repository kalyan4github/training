package in.techdenovo.apps.view;

import in.techdenovo.apps.dao.StudentDao;
import in.techdenovo.apps.dao.StudentDao2Database;
import in.techdenovo.apps.dao.StudentDao2File;

import java.util.Scanner;

public class Menu {
    StudentDao studentDao = new StudentDao();

    StudentDao2File studentDao2File = new StudentDao2File();
    StudentDao2Database studentDao2Database = new StudentDao2Database();
    public void displayMenu(){
        do {
            System.out.println("****Main Menu*******");
            System.out.println("1. Enter Student ");
            System.out.println("2. Display Student");
            System.out.println("3. Update Student");
            System.out.println("4. Exit");
            System.out.println("*************");
            System.out.print("Enter Choice: ");
            Scanner scanner= new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Inside Input Data");
                    studentDao2Database.inputData();
                    break;
                case 2:
                    System.out.println("Display Student Data");
                    studentDao2Database.displayStudentData();
                    break;
                case 3:
                    System.out.println("Update Student Data");
                    studentDao2Database.updateStudent();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(1);
            }
        }while (true);

    }
}
