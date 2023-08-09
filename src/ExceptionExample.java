public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling");
    }
}
//The try block contains the code that might throw an exception. In this case, it's attempting to divide by zero.
// The catch block catches the specific type of exception (ArithmeticException in this case) and handles it.
// It prints an error message using the getMessage() method of the exception object.