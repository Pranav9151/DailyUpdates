//we have three classes: Animal, Mammal, and Dog. Mammal extends Animal, and Dog extends Mammal.
//This forms a multilevel inheritance relationship
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Mammal extends Animal {
    void sleep() {
        System.out.println("Mammal is sleeping...");
    }
}

//The Dog class inherits methods from both Animal and Mammal classes.
class Dogs extends Mammal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}
//. When an instance of Dog is created, it can access methods from all three classes in the hierarchy.

public class InheritanceExample2 {
    public static void main(String[] args) {
        Dogs myDog = new Dogs();
        myDog.eat();    // Inherited from Animal class
        myDog.sleep();  // Inherited from Mammal class
        myDog.bark();   // Accessing method from Dog class
    }
}