//Constructor in java are special methods used to initialize objects of class. they have a same name as the
//class adn do not have the return type


public class ConstructorExample {
    private String name;
    private int age;

    //Default Constructor
    //called When you create an object without passing any arguments
    public ConstructorExample() {
        name = "Pranav";
        age = 20;

    }

    //Parameterized Constructor
    //Uses them to initialize the object attributes
    public ConstructorExample(String name, int age) {
        this.name = name;
        // this keyword refers to the current instance of the class
        this.age = age;
    }

    public static void main(String[] args) {
        //Using the default constructor
        ConstructorExample person1 = new ConstructorExample();
        System.out.println("Person 1: Name = " + person1.name + ", Age = " + person1.age);

        //Using the parametrized constructor
        ConstructorExample person2 = new ConstructorExample("John", 30);
        System.out.println("Person 2: Name = " + person2.name + ", Age = " + person2.age);


    }

}

