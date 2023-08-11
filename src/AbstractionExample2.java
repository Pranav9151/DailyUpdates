// the Vehicle interface defines the methods start(), accelerate(), and stop().

interface Vehicle2 {
    void start();
    void accelerate();
    void stop();
}

class Car2 implements Vehicle2 {
    public void start() {
        System.out.println("Car started");
    }

    public void accelerate() {
        System.out.println("Car accelerated");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

// Both the Car and Bike classes implement the Vehicle interface, providing their
// own implementations for the methods.
class Bike implements Vehicle2 {
    public void start() {
        System.out.println("Bike started");
    }

    public void accelerate() {
        System.out.println("Bike accelerated");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class AbstractionExample2 {
    public static void main(String[] args) {
        Vehicle2 car = new Car2();
        Vehicle2 bike = new Bike();

        car.start();
        car.accelerate();
        car.stop();

        bike.start();
        bike.accelerate();
        bike.stop();
    }
}



// Through abstraction, the interface specifies a contract that its implementing classes must adhere to,
// hiding the implementation details from the user.