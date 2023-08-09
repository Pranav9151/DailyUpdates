public class ModifiersInJava {
    public int publicVar = 10; //public access modifier
    private int privateVar = 20; // private access modifier
    protected int protectedVar = 30; // protected access modifier
    int defaultVar = 40; //Default (package private) access modifier

    public void publicMethod() {
        System.out.println("This is a public method");

    }
    private void prinvateMethod() {
        System.out.println("This is a private method");
    }
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }
}
