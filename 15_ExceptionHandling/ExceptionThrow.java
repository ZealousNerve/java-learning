public class ExceptionThrow {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        /* as we know the catch block will run only when there is some exception but what if we want the catch block to run even if
        there is no error, and we can do that by using throw keyword to throw a exception even if there is no exception */
        try{
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("I don't want to print zero");
            //we are creating a new object, and throwing a exception whenever j = 0, with a custom message
        }

        catch(ArithmeticException e){
            // System.out.println("Cannot divide by zero");

            //we can not only print error message, we can give different operation to be performed in case of exception
            j=18/1; //if exception occur, instead of dividing by zero, divide by 1
            System.out.println("that's the default output");
        }

        catch(Exception e){
            System.out.println("something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
