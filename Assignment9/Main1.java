class Vehicle {
    void drive() {
        System.out.println("Reparing a vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car");
    }
}
    public class Main1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
  } 