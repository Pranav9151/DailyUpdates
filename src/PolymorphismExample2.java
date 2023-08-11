//interface Polymorphism

// Shape interface defines the calculateArea() method.
interface Shapes {
    double calculateArea();
}

// Both Circle and Rectangle classes implement the Shape interface and provide
// their own implementations of the calculateArea() method.
class Circle implements Shapes {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shapes {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class PolymorphismExample2 {
    public static void main(String[] args) {
        Shapes circle = new Circle(5);
        Shapes rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}



// When objects of these classes are treated as Shape references,
// polymorphism allows us to call the calculateArea() method without knowing the specific class,
// demonstrating interface-based polymorphism.