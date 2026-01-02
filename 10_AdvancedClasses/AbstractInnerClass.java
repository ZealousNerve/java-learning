abstract class A{
    public abstract void show();
    public abstract void config();
}

/* here above we can see that we have a abstract class and we know to run the show mehthod
we have to create a new child class and inside that we need to declare the show method then create a obj of child class
with the refrence type of parent class.

there is another method to do the same without creating a class and i.e. with direct implementation as we have seen in
the anonymous class lecture, because that was a great method if we just want a class for one time use, without creating any extra class

coz creating an extra class just to declare this abstract method is not a efficient thing to do*/


public class AbstractInnerClass {
    public static void main(String[] args) {


        A obj = new A(){
            //here we are creating object of not A but of the inner class given below
            public void show(){
                System.out.println("in new show");
            }

            public void config(){
                System.out.println("in config");
            }

            // we can add as many abstract method we want
        };


        obj.show();
        obj.config();
    }
}
