class Vehicle {
    String make;
    String model;
    double fuel;

    Vehicle(String make, String model, double fuel) {
        this.make = make;
        this.model = model;
        this.fuel = fuel;
    }

    void fuelEfficiency() {
        System.out.println("Fuel efficiency calculation");
    }

    void distanceTraveled() {
        System.out.println("Distance Travelled");
    }

    void maxSpeed() {
        System.out.println("Maximum speed");
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, double fuel) {
        super(make, model, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Truck Fuel Efficiency: 8 km/l");
    }

    void distanceTraveled() {
        System.out.println("Truck Distance: 400 km");
    }

    void maxSpeed() {
        System.out.println("Truck Maximum Speed: 100 km/h");
    }
}

class Car extends Vehicle {
    Car(String make, String model, double fuel) {
        super(make, model, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Car Fuel Efficiency: 18 km/l");
    }

    void distanceTraveled() {
        System.out.println("Car Distance: 500 km");
    }

    void maxSpeed() {
        System.out.println("Car Maximum Speed: 180 km/h");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, double fuel) {
        super(make, model, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Motorcycle Fuel Efficiency: 45 km/l");
    }

    void distanceTraveled() {
        System.out.println("Motorcycle Distance: 300 km");
    }

    void maxSpeed() {
        System.out.println("Motorcycle Maximum Speed: 120 km/h");
    }
}

class Main5 {
    public static void main(String args[]) {
        Car c = new Car("Maruti", "Swift", 30);

        System.out.println(c.make);
        System.out.println(c.model);
        c.fuelEfficiency();
        c.distanceTraveled();
        c.maxSpeed();
    }
}