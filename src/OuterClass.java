//Example of nested static class
public class OuterClass {
    private static int x;

    public static class InnerStaticClass {
        void displayX() {
            System.out.println("Value of x: " + x);
        }
    }

}
