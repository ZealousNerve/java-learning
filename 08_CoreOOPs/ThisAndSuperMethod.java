
class A extends Object{ //read further to understand this Object
    public A() // default constructor in A
    { 

        super();
        System.out.println("in default A");

    }

    public A(int n) //parametrized constructor in A
    {

        super();
        System.out.println("in parametrized A");

    }
}



class B extends A{
    
     public B() //default constructor in B
     { 

        super();
        System.out.println("in default B");

     }

     public B(int n) //parametrized constructor in B
     { 

        super();
        System.out.println("in parametrized B");

     }
}

//every constructor has a hidden statement called as super(); even if not mentioned it is there





public class ThisAndSuperMethod {
    public static void main(String[] args) {
        B obj = new B();
        
        obj.getClass();//random stuff heheheheheh

        //before knowing about super()- till now my code doesn't contain super()

        /* here as we are calling constructor B and it extends to A as well it would Call A also
        the first thing is B is sub class and A is super class
        when defualt b is called default B comes and default A called automatically
        when parametrized B is called then parametrized B comes and now also default A is called even when parametrized A is there */



        /*  as here in B() constructor while creating object we are not passing any arguments so only 
        default constructor is called the parametrized constructor will not be called 
        and same if we pass a value it will call that parametrized const. istead of default constructor */
        

        //whenever we create an object of a class it will call the parent and child class all.



        //after knowing super()- now my code contains super()

        /* the super method in every constructor calls the super class, as obj for b is created and then out compiler enters
        B and as soon as it enters the first line it sees is super, now due to super it will now call the super class if there any
        then after calling the super class it will now read the resst of the line in B.
        
        in order to called the parametrized A we have to pass a value in the parenthesis of super() present in B*/


        /* now the question arises that as A is the super class then what will the super() in A calls, as A is at the topmost position
        the answer is that every class in java extends to "Object" calss so even A extends to nothing as we can see, there is a hidden line
        that say "A extends Object" */

        /* what if with a creation of a single object i want to print in default A, in default B, in parametrized B all at once
        as we know we cannot call both B at once as to call parametrized we need to pass value and if we pass value then we cannot call default B
        
        to solve it this() is used similar to super(), as super() was for super class this() is for the current class
        
        to called the parametrized B from default B pass a value inside this() and goes on*/
    }
}
