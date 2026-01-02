class A {

    /*
    This method may cause a checked exception (ClassNotFoundException).
     
    Instead of handling the exception here using try-catch, we are declaring it using 'throws'.

    'throws' means: "I am aware this method can cause an exception, but I am NOT responsible for handling it.
    The responsibility is passed to the caller."
     */
    public void show() throws ClassNotFoundException {

    /*
        Class.forName("Calc") tries to load a class named "Calc" at runtime.
         
        If the class is NOT found in the classpath, JVM creates a ClassNotFoundException object and throws it.
         
         Since this is a CHECKED exception,
         Java forces us to either:
            1) handle it using try-catch
            2) or declare it using throws
    */
        Class.forName("Calc");
    }
}

public class ThrowsKeyword {

    public static void main(String[] args) {

        // Object of class A
        A obj = new A();

        /*
          The main() method is now calling show(). Since show() declares 'throws ClassNotFoundException',
          the compiler forces main() to handle it. That handling is done here using try-catch.
         */

        try {
            obj.show();
        }
        catch (ClassNotFoundException e) {

            /* printStackTrace() prints the complete exception details, which is very useful for debugging.*/
            e.printStackTrace();
        }

        /*
         IMPORTANT CONCEPT:
         
          Exceptions can be "ducked" (passed) from one method to another using 'throws'. Usually, lower-level methods throw exceptions,
          and higher-level methods decide how to handle them. This improves:
            - code readability
            - separation of responsibility
            - reusability of methods
         */

        /*
         WHY we usually DO NOT throw exception from main():
         
         If main() throws an exception and does not handle it, then JVM becomes the default exception handler.
         
         JVM will:
         - print the exception details
         - immediately terminate the program
        
         Hence, it is considered GOOD PRACTICE to handle exceptions inside main() rather than throwing them.
         */
    }
}
