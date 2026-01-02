// Final can be used with Variable, Class, Method


final class Calc1{ //class is made final 
    public void show(){
        System.out.println("in Calc1 show");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}

/*  FINAL used in a CLass
    
    class AdvCalc1 extends Calc1{
        //as the class Calc1 is made final or we can say is made constant now no one can inherit it or perform any changes
    } 

*/


/* in same way we can make our method final so that no can override it or no one can alter it
public final void show() - like this */

public class FinalKeyword {
    public static void main(String[] args) {

        Calc1 obj = new Calc1();
        obj.show();
        obj.add(3, 5);

    /*  
    FINAL used in Variable
        int num = 8;
        num = 9; //num updated

        final int num1 = 8; //final key used in variable
        //now num1 is like a constant we cannot update or change its value
        // num1 = 9; this will show an error as we made num1 constant using final keyword 

    */


    }
}
