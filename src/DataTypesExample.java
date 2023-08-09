
public class DataTypesExample {
    public static void main(String[] args){
        //Integral data types
        byte myByte = 127;                // 8 bit signed integer (-128 to 127)
        short myShort = 32767;            // 16-bit signed integer (-32768 to 32767)
        int myInt = 2147483647;           // 32 bit signed integer (-2^31 to 2^31 -1)
        long myLong = 9223372036854775807L; // 64 bit signed integer (-2^63 to 2^63 -1)

        //Floating data types
        float myFloat = 3.14f;      // 32 bit single precision floating point
        double myDouble = 3.14159;  //64 bit double precision floating point

        //character data type
        char myChar = 'A';   //16 bit unicode character (0 to 65,353)

       // Boolean data type
        boolean myBoolean = true; //represent true or false

        //Performing some operations
        int sum = myInt + myShort;
        double product = myDouble * myFloat;
        char newChar = (char) (myChar + 1); //Incrementing the character value

        //printing the results
        System.out.println("Sum of int and short: " + sum);
        System.out.println("Product of double and float: " + product);
        System.out.println("Incremented char: " + newChar);


    }
}




