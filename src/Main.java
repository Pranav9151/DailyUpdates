public class Main {

    //This class contains the 'main' method , which is the starting point of the program.

    public static void main(String[] args) {

        //Creating an object of the Car class and assigns it to the variable 'myCar'.
        //new keyword is used to collect memory and collect new object
        Car myCar = new Car("Toyota", "Camry", 2022);

        //Accessing fields and calling methods of the object
        System.out.println("Car details: " + myCar.make + " " + myCar.model + " " + myCar.year);
        myCar.start(); // start() method will execute the code inside the start.

    }
}
