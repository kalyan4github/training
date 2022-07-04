public class SimpleInterest {
    int principle;
    double rate,time,simpleInterest;

    public static void main(String[] args) {
        SimpleInterest s1 = new SimpleInterest();

        s1.principle=50000;
        s1.rate = 4.5;
        s1.time=1;

        s1.simpleInterest= (s1.principle * s1.rate * s1.time)/100;

        System.out.println("Simple Interest "+s1.simpleInterest);
        System.out.println("Total Amount " + (s1.principle+s1.simpleInterest));
    }
}
