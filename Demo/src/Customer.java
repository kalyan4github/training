import java.util.Scanner;

public class Customer {
    String firstName;
    String lastName;
    String mobileNo;

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        firstName = sc.next();
        System.out.println("Enter Last Name");
        lastName = sc.next();
        System.out.println("Enter Mobile Number");
        mobileNo = sc.next();
    }
    public void displayData(){
        System.out.println("First Name "+firstName);
        System.out.println("Last Name "+lastName);
        System.out.println("Mobile Number "+mobileNo);

    }
    public static void main(String[] args) {
        Customer customer= new Customer();
        customer.inputData();
        customer.displayData();
    }
}
