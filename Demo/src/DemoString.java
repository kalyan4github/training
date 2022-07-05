import java.util.Scanner;

public class DemoString {
    String email;

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email ");
        email= sc.next();
        sc.close();
    }
    public void display(){
        System.out.println("index of @ in email: " +email.indexOf("@"));
    }
    public void checkValidEmail(){
        if(email.indexOf("@") > 0){
            String[] substring;
            substring=email.split("@");
            //System.out.println(substring[1]);
            if(substring[1].indexOf(".")>0)
                System.out.println("Valid Email");
            else
                System.out.println(". Invalid Email");
        }else {
            System.out.println("@ InValid Email");
        }
    }

    public static void main(String[] args) {
        DemoString d = new DemoString();
        d.inputData();
//        d.display();
        d.checkValidEmail();
    }
}
