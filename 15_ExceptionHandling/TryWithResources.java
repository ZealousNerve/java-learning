import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        int num=0;
        Scanner sc = null;
        //we have to initialize Scanner outside the try block, so that the finnaly block can use it
        
        try{

            sc = new Scanner(System.in);
            num = sc.nextInt();
            
            System.out.println("inside try");
        }

        
        /*---------------------------------------------------------------------------------

        if we use a try like this we don't have to close it manually, it will autoclose once try executes completely

        try(Scanner s = new Scanner(System.in)){
            num=s.nextInt();
        } 
            
        -------------------------------------------------------------------------------------*/

        /* when there will be some exception then the catch block will run and catch will print inside catch
        but what if there is no exception then the try block will run and catch will not run and try will print
        inside try, but what if we want to print a statement irrespective weither we get exception or not then we
        use the finally block */

        catch(Exception e){
            System.out.println("Something went wrong");
            System.out.println("inside catch");
        }

        finally{

            sc.close();
            System.out.println(num);
            System.out.println("inside finally");
            /* using finally make sense as after doing all the exception handling what if we want to free up the resources
            close the opened resource and hence that closing block can be added inside finally */
        }

        /* now look, if we had used buffered reader then it will throw an error, so to close the buffered reader we write the close
        method inside catch, but as we are using Scanner and it will not throw any error so now catch block will not run so now we have
        to write the close block in try itself, and as we can see there is lot of confusion, and to fix it  we write the close block in finally
        and finally will run irrespective weither we get exception or not */
    }
}
