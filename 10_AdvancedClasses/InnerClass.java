class A{
    int age;

    public void show(){
        System.out.println("in show");
    }

    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        
        A.B obj1 = obj.new B();

        /* to create a object of inner class we need to first tell that it is inner class by syntax A.B where A is outer
        and B is inner class then to create a object of inner class we need to do that inside the object of outer class
        which is obj.new - here obj is object of outer class 
        
        
        as we know we don't have to create an object of static class, so convert the inner class into static and then 
        A.B obj1 = new A.B();

        outer class can't be converted into static, only inner class can

        class file of this inner class would be A$B.class this dollar sign seprates the two, and it shows that B belongs to A.
        
        */

        obj1.config();
    }
}
