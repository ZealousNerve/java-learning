class Z{

}

/* suppose we want to extend our class A to Z and extend to Thread as well, and we know in java
multiple inhereitance won't work, but we can extend and implement together. and in java the Thread implements Runnable
and Runnable interfacea too have a run method and that's why we extend our class to the desired class, and to use the benifits of 
threads we implemets Runnable */

class A extends Z implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hi");
           
            try {Thread.sleep(10);} 
            catch (InterruptedException e) {e.printStackTrace();} 

        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello");

            try {Thread.sleep(10);} 
            catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

public class RunnableVsThreads {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        //but now we can't use start method as runnable won't contain a start mehtod
        // obj1.start();
        // obj2.start();

        //to fix it we create two thread object and link them with our objects
        //inside thread there is a constructor which accepts a runnable object and we know 
        //we can create a obj which have refrence to the interface and object of the class such as

        Runnable obj3 = new A();
        Runnable obj4 = new B();

        //as A and B both implements Runnable so we can use any of the obj, weither it is created with runnable refrence of class A or B refrence


        Thread t1 = new Thread(obj1); //we can pass any of the obj1 or obj3 here as both are object of A
        Thread t2 = new Thread(obj2); //we can pass any of the obj2 or obj4 here as both are object of B

        //now we can use start
        t1.start();
        t2.start();

        /* The runnable interface contains only one method so it is a functional interface and hece we can use lambda expression here to 
        make our code concise and then we don't have to create classes at all, because we are using the class for a one time use, and hence
        we can use anonymous class and lambda expression to simplify it 
        
        in the next topic which is race condition we will work on the threads using lmbda expression */


    }
}
