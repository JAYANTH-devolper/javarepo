public class staticfinal {
    
    // static variable
    static int counter = 0;
    
    // final variable (constant)
    final int MAX_LIMIT = 100;

    // static method
    static void incrementCounter() {
        counter++;
        System.out.println("Counter: " + counter);
    }

    // final method (cannot be overridden)
    final void displayMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
          // Accessing static method without creating an instance
          staticfinal.incrementCounter();
          staticfinal.incrementCounter();
  
          // Creating an instance to access final variable and method
          staticfinal obj = new staticfinal();
          System.out.println("MAX_LIMIT: " + obj.MAX_LIMIT);
          obj.displayMessage();
    }
}
