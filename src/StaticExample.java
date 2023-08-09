public class StaticExample {
    static int staticVar = 5; // Static variable shared among all instances
    int instanceVar = 10;     // Instance variable unique to each instance

    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        // Accessing static variable using class name or object reference
        System.out.println("Static variable: " + StaticExample.staticVar);
        System.out.println("Static variable from obj1: " + obj1.staticVar);

        // Accessing instance variable using object reference
        System.out.println("Instance variable from obj1: " + obj1.instanceVar);
        System.out.println("Instance variable from obj2: " + obj2.instanceVar);

        // Calling static method using class name or object reference
        StaticExample.staticMethod();
        obj1.staticMethod();

        // Calling instance method using object reference
        obj1.instanceMethod();
        obj2.instanceMethod();
    }
}