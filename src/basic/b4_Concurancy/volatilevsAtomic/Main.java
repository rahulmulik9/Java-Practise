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


