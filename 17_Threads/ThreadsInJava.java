class A extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hi");

           //we can add a sleep timer in milliseconds to tell the scheduler to wait this much time before moving forward
           //but this will throw a checked exception, and hence we will surround it with try and catch 
           
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 

        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsInJava {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();
        // obj2.show();

        obj2.setPriority(0);
        obj1.setPriority(Thread.MAX_PRIORITY);
        //priority can be given on the scale of 1 to 10, by default the thread priority is 5
        //we can also use certain constants like MAX_PRIORITY
        //this priority stuff just give suggestion to our device scheduler but it will depend on the decision of scheduler only
        obj1.start();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        obj2.start();

        /* in normal case first the loop of class A will run then the loop of class B will run
        now what if we want them to run simultaneously in that case we use not just a normal class
        but a thread, and to do that so, we have to extend our class to Thread 
        
        and then with obj istead of obj.methodName we have to write obj.start and the method name should be changed
        to run() instead of show()
        
        now both method will run simultaneously*/


    }
}
