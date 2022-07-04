public class Vehicle {
    int noOfWheels;
    String typeOfFuel;
 

    public void display(){
        System.out.println("No of Wheels - " + this.noOfWheels);
        System.out.println("Type of Fuel " + this.typeOfFuel);
    }

    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle();
        v1.noOfWheels = 4;
        v1.typeOfFuel="petrol"; 

        v1.display();

        // System.out.println("No of Wheels - " + v1.noOfWheels);
        // System.out.println("Type of Fuel " + v1.typeOfFuel);
      
    }
}