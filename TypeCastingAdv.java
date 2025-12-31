class Parent{
    public void show1(){
        System.out.println("in Parent");
    }
}

class Child extends Parent{
    public void show2(){
        System.out.println("in child");
    }
}



public class TypeCastingAdv {
    public static void main(String[] args) {
        double d = 4.5;
        int i = (int)d;
        //we used (int) to typecast
        System.out.println(i);


        Parent obj = new Child();
        //above we have created a object of child but the type and refrence is of A
        /* the above example is of upcasting as the child is upgraded to parent, this is upcasting by default
        no need to mention (Parent) here as we are using inheritance*/



        /* below is the example of downcasting */
        Child obj1 = (Child) obj;
        obj1.show2();

        /* if we dont't downcast and try to fetch show2() method it will show error as the type is of A so it will look
        for all the available methods in A but show2 is not present there and to access show2 we have to downcast to child
        from a parent */

        /* read dynamic method dispatch in polymorphism to understand what happens when the refrence is of Parent and object is of Child */
    }

}
