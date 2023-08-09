public class OuterClass {
    private int outerVar = 5;

    public void outerMethod() {
        System.out.println("This is the outer method.");
    }

    // Inner class definition
    public class InnerClass {
        private int innerVar = 10;

        public void innerMethod() {
            System.out.println("This is the inner method.");
            System.out.println("Accessing outer variable from inner class: " + outerVar);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();

        // Creating an instance of the inner class
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        innerObj.innerMethod();
    }
}