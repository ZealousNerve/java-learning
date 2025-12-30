class A{

    public A(){
        System.out.println("object created");
    }


    public void show(){
        System.out.println("in a show");
    }
}





public class AnonymousObject {
    public static void main(String[] args) {
        A obj = new A();
        //here obj is not a object, it is a refrence variable which is used to point to a object
        obj.show();

        /* as for a variable there are two steps, declaration and definition
        int a;
        a = 5;
        
        similarly for a object there are two steps
        A obj; //this is called as refrence creation
        obj=new A();
        
        hence to create a obj we need to write only one line 
        new A();  - this is called an anonymous object as there is no name to this 

        the problem with this anonymous object is we cannot reuse them

        we can call a method once for that object through anonymous object as
        new A().show();
        */
    }
}
