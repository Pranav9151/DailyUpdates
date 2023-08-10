//The Car class extends the Vehicle class, creating an inheritance relationship.
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

//This means that the Car class inherits the start method from the Vehicle class
class Cars extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating...");
    }
}

//When an instance of Car is created, it can access both its own method (accelerate) and the inherited method (start).

public class InheritanceExample {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.start();       // Inherited from Vehicle class
        myCar.accelerate();  // Accessing method from Car class
    }
}