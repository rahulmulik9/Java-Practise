package basic.b4_Concurancy.volatilevsAtomic;

class SharedFlag{
   private boolean isShared = true;
   // private volatile boolean isShared = true;

    public SharedFlag() {
    }

    public boolean isShared() {
        return isShared;
    }
//    public synchronized boolean isShared() {
//        return isShared;
//    }
    public void setShared(boolean shared) {
        isShared = shared;
    }
}

public class Main {
    public static void main(String[] args) {
        SharedFlag isFlag = new SharedFlag();

        new Thread(()->{
            System.out.println("Thread 1 start");
            isFlag.setShared(false);
            System.out.println("Thread 1 Completed");
        }).start();

        new Thread(()->{
            System.out.println("Thread 2 started");
            while (isFlag.isShared()){

            }
            System.out.println("Thread 2 completed");
        }).start();

    }
}


/*If you run programme without volatile variable and synchronized method
then output is
Thread 1 Completed
Thread 2 started
Thread 2 completed

Why this happen
Every thread created copy of variable in cpu cache which is separate for each thread.
This value is updated on each thread cache
So for second thread isFlag true condition, and it is continuously running.

There are two methods to avoid it
1) Volatile keyword
   when you use volatile keyword there is no copy of variable is made in respective CPU. Thread will access the value of variable directly.
   Volatile is ony used for member variables.
   Performance is relatively high compare to synchronized keyword.
   volatile keyword helps us with visibility as memory value is access by thread not local cache value.
   for increment and decrement use atomic keyword.

2) Synchronized keyword
   When synchronized keyword is used then until method complete the execution, no other method will be able to access the variable
   This is only used for method and block
   In this locking and unlocking take place so can cause deadlock

* */


