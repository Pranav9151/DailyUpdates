public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name =name;
        this.age =age;
}
public void bark() { //this is the method represent the behavior of the  dog to bark.
    System.out.println("bark!");
}

}

//Example of an abstract class
abstract class Shape{   // abstract class cannot be instantiated directly, they serve as a blueprint for
                         // other classes and can have a abstract methods
    abstract double getArea();
}

