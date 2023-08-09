public class FinalExample {
    final int constantValue = 10; // Final variable
                                  // A final variable is a constant and cannot be changed after it has been assigned
                                  // a value. It must be initialized when declared or in a constructor.

    final void finalMethod() {     //A final method cannot be overridden by subclasses. Once a method is declared as
                                  // final in a class, it cannot be further overridden in any subclass.
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        System.out.println("Constant value: " + obj.constantValue);

        obj.finalMethod();
    }
}