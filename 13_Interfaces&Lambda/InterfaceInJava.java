//Interface is not a class
//we cannot instantiate a interface - it means we cannot make object of it similar to the case of abstract class
//we create interface so that we can design our code
//interface tells the method which we gonna require but interface will not declare it

interface A{

    int age = 44;
    String area = "Mumbai";
    /* by default variables in Interface is always final and static, and due to static we can use these 
    variables using interface name and due to final the  value of variables are constant and can't be changed */
    
    /* in interface constructor aren't allowed */


    /* in interface all methods are public and abstract by default even if not mentioned
    so if we have a method void show() we actually have public abstract void show(); */

    void show();
    void config();
}

    //we will require a class to implemnt or to declare our methods 
    //in case of class we extends it to the parent abstract class
    //but in case of interface we would implements to the interface

    /* 

    similar to abstract class, once we create a child class we have to declare all the
    undeclared methods of abstract class, so here also in class B we have to declare all 
    the abstract methods 

    and if we fail to declare any of the abstract methods then our child class will also become a 
    abstract class

    */

class B implements A{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }
}





public class InterfaceInJava {
    public static void main(String[] args) {
        /* as A is like a abstract class we cannot create obj of A, and we also know that interface can't be instantiated
        so we will create a obj of B with the refrence of A */

        A obj = new B();
        obj.show();
        obj.config();
    }
}
