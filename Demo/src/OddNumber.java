import java.util.Scanner;

public class OddNumber {
    int count=0;
    int total=0;
    int startNumber,endNumber;
    public void displayOddNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting number ");
        startNumber=sc.nextInt();
        System.out.print("Enter end number ");
        endNumber=sc.nextInt();

        for (int i = startNumber; i <= endNumber; i++) {
            if(i%2!=0){
                System.out.print(i + "\t");
                count++;
                total=total+i;
            }
        }
    }

    public static void main(String[] args) {
        OddNumber oddNumber = new OddNumber();
        oddNumber.displayOddNumbers();
        System.out.println("\nThe count of Odd Number: "+oddNumber.count);
        System.out.println("\nThe Total of Odd Numbers: "+oddNumber.total);
    }
}
