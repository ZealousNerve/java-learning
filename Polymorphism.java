//it means many behaviour, or behave differently in different situation

//two types of polymorphism, compile-time and run-time

//at compile-time it is method oveloading
//at run-time it is method overriding


/* in this file we are gonna dive deep into the runtime one i.e. method overriding */



class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in B show");
    }
}



public class Polymorphism {
    public static void main(String[] args) {
        /* in the line given below we are creating refrence of a super class and object of a daughter class.
        suppose A is Computer and B is laptop so we can create refrence to a computer and object of laptop class */

        A obj = new A();
        obj.show();
        //will print in A show
        
        obj = new B(); //this becomes A obj = new B() here type is A but object is of B
        //we can have parent refrence to child object so all this possible only in inheritance
        obj.show();
        //will print in B show

        obj = new C();
        obj.show();
        //will print in C show

        /* the same refrence B is behaving differently in different cases, remeber the type is same for the refrence in all cases */
        // this is know as dynamic method dispatch - The method that gets executed depends on the type of object, not the type of reference variable.
    
        // the refrence of object is A and refrence variable decides which methods are acessible while Object decide which method should run

        // Reference type controls what you are allowed to access. Object type controls what actually executes (for overridden methods).
    }   
        
}
