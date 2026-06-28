class MyException extends Exception{
    public MyException(String str){
        super(str);
        /* the error message in e is handled by the parent class Exception
        and Exception has its own constructor which take the argument string as a parameter
        so to get the error message we call the parent class constructor using super() */
    }
}



public class CustomException {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
                throw new MyException("I don't want to print zero");
        }

        catch(MyException e){
            j=18/1; 
            System.out.println("that's the default output" + e);
        }

        catch(Exception e){
            System.out.println("something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
