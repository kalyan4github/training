import java.util.Scanner;

public class SimpleInterestFromUser {
    int principle;
    double rate,time,simpleInterest;

    public void inputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle ");
        principle = sc.nextInt();

        System.out.print("Enter Rate of Interest ");
        rate = sc.nextDouble();

        System.out.print("Enter Time ");
        time = sc.nextDouble();
    }
    public void calculateSI(){
        simpleInterest = (principle * rate * time)/100;
    }
    public void display(){
        System.out.println("Simple Interest: "+simpleInterest);
        System.out.println("Total Amount " + (principle+simpleInterest));
    }

    public static void main(String[] args) {
        SimpleInterestFromUser s2 = new SimpleInterestFromUser();
        s2.inputDate();
        s2.calculateSI();
        s2.display();
    }
}
