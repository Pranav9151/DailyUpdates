
    class Parent {
        int x = 10;

        Parent() {
            System.out.println("Parent constructor");
        }

        void display() {
            System.out.println("Value of x in parent: " + x);
        }
    }

    class Child extends Parent {
        int x = 20;

        Child() {
            super(); // Calls the parent class constructor
            System.out.println("Child constructor");
        }

        void display() {
            System.out.println("Value of x in child: " + x);
            System.out.println("Value of x in parent using super: " + super.x);
            super.display(); // Calls the parent class display method
        }
    }

    public class SuperThisExample {
        public static void main(String[] args) {
            Child childObj = new Child();
            childObj.display();
        }
    }

    //The super keyword is used to refer to the parent class members (fields, methods, and constructors) from within a subclass.
    //The this keyword is used to refer to the current instance of the class.