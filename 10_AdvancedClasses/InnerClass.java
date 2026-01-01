class Abc{
    int age;

    public void show(){
        System.out.println("in show");
    }

    class def{
        public void config(){
            System.out.println("in config");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.show();
        
        Abc.def obj1 = obj.new def();

        /* to create a object of inner class we need to first tell that it is inner class by syntax Abc.def where Abc is outer
        and def in inner class then to create a object of inner class we need to do that inside the object of outer class
        which is obj.new - here obj is object of outer class 
        
        
        as we know we don't have to create an object of static class, so convert the inner class into static and 
        the Abc.def obj1 = new Abc.def*/

        obj1.config();
    }
}
