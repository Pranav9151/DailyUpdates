//we have a Student class with private instance variables name and age.
public class EnStudent {
    private String name;
    private int age;

    // Getter method for 'name'
    public String getName() {
        return name;
    }
//The class provides getter and setter methods for both variables.

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age value");
        }
    }
}
//This encapsulation ensures that the internal state of the Student object is hidden from outside access.
//Getters allow controlled access to the variable values, and setters enforce certain conditions
// (like age being positive) before setting the value