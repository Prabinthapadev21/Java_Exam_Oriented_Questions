package Practice;

abstract class Vehicle {
    Vehicle() {
        System.out.println("Vehicle created");
    }

    abstract void start();  // Must be implemented

    void stop() {  // Normal method
        System.out.println("Vehicle stopped");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started with kick");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started with key");
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        v1.start(); // Output: Bike started with kick
        v1.stop();  // Output: Vehicle stopped

        Vehicle v2 = new Car();
        v2.start(); // Output: Car started with key
        v2.stop();  // Output: Vehicle stopped
    }
}
