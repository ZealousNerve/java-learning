public class ExceptionHandling {
    public static void main(String[] args) {
        // there are three types of error compile-time, Runtime, logical errors
        //exception are runtime error

        int i = 0;
        int j = 0;

        int num[] = new int[5];


        //try will try to execute the following operation then if it throws an error then the catch block will be executed
        try{
            //try contains the risky code and each statement in try is accesed sequently

            j = 18/i;
            System.out.println(num[1]);
            System.out.println(num[5]);

        }

        //catch handles the exception

        /* the Exception in catch is a class and e is the name of object, if we know the type of exception like AritmeticException then instead
        of just (Exception e) we can write (ArithmeticException e). */

        /* the object e contains error messages[e.getMessage()], stack trace[full error details e.printStackTrace()],
        line number, class name, the refrence variable e will let us access the information about the error */


        /* ----------------------------------------------------------------------------------------------------------------------------------------------------
        
        commenting this so that i can use specific exception type, and if a exception is handled by one catch then we cannot create another catch for 
        handling the same exception

        catch(Exception e){
            System.out.println("Something went Wrong " + e);
        } 
        
        --------------------------------------------------------------------------------------------------------------------------------------------------------*/


        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in you limit.");
        }

        /* now as we are handling only two types of exception, but it may that certain other unknow exception are there then for that case to be on the safer side
        we add a generalized exception at the end. Exception is like parent class of other exceptions like ArithmeticException etc and it is a good practice to keep
        the higher member of exception hierarchy at the bottom most catch*/

        catch(Exception e){
            System.out.println("something went wrong " + e);
        }


        System.out.println(j);

        System.out.println("Bye");

    }
}
