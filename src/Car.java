public class Car {

    //attributes of the class
    String make; // represents the brand of the car
    String model; //represents model of the car
    int year; //represents manufacturing of the car

    //constructor for the class
    //constructor are the special methods used to initilize the object state when it is created
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model; // this keyword is refer to the current instances of the class
        this.year = year;
    }

    //Method of the class
    //This is the method of the car class, methods are the functions associated with the class
    //and define behaviors the objects of the class can perform .
    //This method simply prints a message to the console indicating that the car is starting
    public void start() {
        System.out.println("The car is stsrting");

    }
}
