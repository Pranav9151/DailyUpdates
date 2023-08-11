//the Animal class has a method called makeSound().

class Animal1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// The Dog and Cat classes inherit from Animal and override the makeSound() method.
class Dog1 extends Animal1 {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal1 {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample1 {
    public static void main(String[] args) {
        Animal1 myDog = new Dog1();
        Animal1 myCat = new Cat();

        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
    }
}
// When objects of Dog and Cat are assigned to Animal references,
// the overridden methods are called at runtime,demonstrating polymorphism.

