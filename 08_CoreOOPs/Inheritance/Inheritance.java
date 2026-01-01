package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.multi(3, 4);
        int r2 = obj.div(15, 4);
        // as obj is a object of AdvCalc which can perform only multiplication and division
        //and to do additon and subtraction we have to create a object of Calc

        /* but istead of doing that we will use a keyword extend in AdvCalc so that it can 
        inherit the properties of superclass Calc also and then can perform addition and subtraction also */

        //after using the extends keyword

        //AdvCalc is a subclass and Calc is super class

        int r3 = obj.add(4, 5);
        int r4 = obj.sub(8, 6);
        int r5 = obj.power(3, 2);

        System.out.printf("%d %d %d %d %d", r1, r2, r3, r4, r5);
    }
    
    //If you use package, compile from outside the package folder and run using java package.className

    /* in this type of case, the VeryAdvCalc is extending to AdvCalc and AdvCalc extends to Calc, this is 
    an example of multilevel inhertance
    
    
    in above example the VeryAdvCalc is child and AdvCalc is parent and Calc is grandparent and this is known as multilevel inheritance
    
    but what if there are one child and two parent, now this case is called as multiple inheritance, now one problem arise here that
    suppose the child calls a method which is present in both parrent then which parent would the child chosse, and it creates and ambiguity
    and that's why java doesn't have a concept like multiple inheritance*/
}
