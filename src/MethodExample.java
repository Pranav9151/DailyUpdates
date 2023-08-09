public class MethodExample {
    public static void main(String[] args) {
        int result = addNumbers(5,10); //Calling the addNumber method
        System.out.println("The sum is: " + result);

        String fullName = concatenateNames("Jhon", "Doe"); //calling the concatenateNames method
        System.out.println("Full Name: " + fullName);
    }

    //Method to add two numbers and return the sum
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    //Method to concatenate two string and return the result
    public static String concatenateNames(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

}

