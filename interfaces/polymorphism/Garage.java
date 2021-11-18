package interfaces.polymorphism;

public class Garage {

    public static void printWheelsCount(Vehicle vehicle){
        System.out.println(vehicle.getWheelsCount());
    }

    public static void main(String[] args) {
        printWheelsCount(new Car());
        printWheelsCount(new Bike());
    }


}
