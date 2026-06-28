@FunctionalInterface 
interface A{ 
    void show();
}

interface B{
    int add(int i, int j);
}


public class LambdaExp {
    public static void main(String[] args) {
        /* ----------------------------------------

        A obj = new A(){
            public void show(){
                System.out.println("in A show");
            }
        }; 
        
        ---------------------------------------------*/

        //above code can be written in lambda expression as

        /* --------------------------------------------

        A obj = () ->
            {
                System.out.println("in show");
            }; 
        
        -----------------------------------------------*/

        //if we are using only one statement in the implementation the no need for bracket as well


        A obj = () -> System.out.println("in show");

        //we can also pass the parameter in the () before arrow, if our method is parameterized
        //so all that is reduced to a single line, and this is known as lambda expression

        //and after using lmbda expression no new anonymous class file will be created


        // suppose we want to return i + j
        B obj1 = (i, j) -> i+j;

        int result = obj1.add(5, 4);
        System.out.println(result);


        obj.show();
    }
}
