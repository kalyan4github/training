public class DemoArray {
    int[] marks = new int[5];

    int[] marks2 = {52,78,93,65,55};

    public  void displayElementofArray(){
        System.out.print("[ ");
        for (int m:marks2) {
            System.out.print(m+"\t");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        DemoArray demoArray = new DemoArray();
        demoArray.displayElementofArray();
    }
}
//1-50
//
//odd numbers =
//count total =
//total of odd number =