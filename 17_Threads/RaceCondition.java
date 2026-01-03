class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        
        Counter c = new Counter();

        Runnable obj1 = () ->{
            for(int i=0; i<1000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i=0; i<1000; i++){
                c.increment();
            }
        };

        /* we created a method which increments the value of count strting from zero.
        we have two threads to do the increment, each thread will increment for a 1000 times
        so the total number of times the increment method is called is 2000, but increment is done
        by two threads and they will do this increment simultaneously*/

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        System.out.println(c.count);
        /* listen carefully, in the main method we started two threads and there task was to increment
        and in the same main we printed the value of count, and that's why this print function print random value of count each
        time we run the code as both threads were incrementing and in between their process we call the print and that's  why we don't get 2000
        
        and hence we use join mehtod to tell main that let the operation of thread finishes first then move to the next part of code*/

        t1.join();
        t2.join();

        System.out.println(c.count);
        /* as both the join function will throw an exception, we can either handle it thorugh try and catch or just use throws, so let's use throws 
        
        so now the main will print the value of count after 2000 iteration and after the threads operation finishes so now the output should be 2000 but 
        that's not true as there maybe some point where both the threads take the same value of count and increment to the same value, so two iteration
        happened but only one increment was seen, and that's why threads are very unpredictable
        
        
        and now to finnaly get the value as 2000 we use a keyword synchronized wiht the method increment to tell that, at a time only one thread will work on 
        that mehtod, if t1 is working then t2 has to wait and vice versa*/

        /* Important Idea: Using synchronized does NOT mean threads stop being threads.
        It only makes sure that this particular method is used by one thread at a time.
        Threads still run in parallel, but shared data is accessed safely.
        Threads are used for concurrent execution; synchronized is used only for correctness. */


    }
}
