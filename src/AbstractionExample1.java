//the Shape class is an abstract class with an abstract method calculateArea().
abstract class Shape1 {
    abstract double calculateArea();
}

// The Circle and Rectangle classes extend Shape and provide concrete
// implementations for the calculateArea() method.
class Circle1 extends Shape1 {
    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 extends Shape1 {
    double length, width;

    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class AbstractionExample1 {
    public static void main(String[] args) {
        Shape1 circle = new Circle1(5);
        Shape1 rectangle = new Rectangle1(4, 6);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

// The concept of abstraction is used to define a common interface (Shape) while
// leaving the specific implementation details to the subclasses.