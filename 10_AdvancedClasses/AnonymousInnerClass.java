class A{
    public void show(){
        System.out.println("in A show");
    }
}

/* we have made a method show in a class A, now we want to update this show method, one way of doing that is 
to do method overriding through a new child class, but what if we want to do it just once, then istead of creating a new
child class, we just implement out changes directly while creating the object as shown below */

public class AnonymousInnerClass {
    public static void main(String[] args) {

        /* here after the constructor we opened a curly bracket to implement the new show method
        this is called as anonymous inner class, anonymous because it doesn't have a name, and inner class
        because when we compile this code, a new class will be made because of the below implementation with the name AnonymousInnerClass$1.class 
        as seen in the inner class lecture inner class is named as outerclass$innerclass.class and here inner class doesn't have any name and is randomly 
        alloted the number 1 as name and hence due to lack of identity it is anonymous */

        /* this type of implementation is very very important and common to use */
                                                            
        A obj = new A(){
            public void show(){
                System.out.println("In new Show");
            }
        };


        obj.show(); //this will call the show of new implementation not the old one
    }
}
