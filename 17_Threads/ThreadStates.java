public class ThreadStates {
    public static void main(String[] args) {
        /*
====================== THREAD LIFE CYCLE (JAVA) ======================

Diagram:

        NEW
         |
         | start()
         v
     RUNNABLE  <------------------------------+
      /   \                                   |
     /     \                                  |
sleep()   wait()/join()                       |
  |       |       |                           |
  v       v       v                           |
TIMED_WAITING   WAITING                       |
     \         /                              |
      \       / notify()/notifyAll()          |
       \     /                                |
        v   v                                 |
        RUNNABLE -----------------------------+
            |
            | run() finishes
            v
        TERMINATED


====================== STATES EXPLANATION ======================

1. NEW
   - Thread is created but not started yet
   - Example: Thread t = new Thread();
   - State before calling start()

2. RUNNABLE
   - Thread is ready to run or currently running
   - start() moves thread from NEW → RUNNABLE
   - CPU decides when it actually runs

3. WAITING
   - Thread waits indefinitely until another thread wakes it up
   - Caused by:
       wait()
       join() (without time)
   - Woken up by:
       notify()
       notifyAll()

4. TIMED_WAITING
   - Thread waits for a fixed amount of time
   - Caused by:
       sleep(time)
       wait(time)
       join(time)
   - Automatically moves back to RUNNABLE after time expires

5. TERMINATED
   - Thread has completed execution
   - Once terminated, it CANNOT be restarted


====================== TRANSITION METHODS ======================

NEW → RUNNABLE
- start()

RUNNABLE → WAITING
- wait()
- join()

RUNNABLE → TIMED_WAITING
- sleep(time)
- wait(time)
- join(time)

WAITING / TIMED_WAITING → RUNNABLE
- notify()
- notifyAll()
- time expires

RUNNABLE → TERMINATED
- run() method completes


====================== IMPORTANT NOTES ======================

• sleep() does NOT release lock
• wait() releases lock
• start() is called ONLY ONCE
• Calling run() directly does NOT create a new thread

================================================================
*/

    }
}
