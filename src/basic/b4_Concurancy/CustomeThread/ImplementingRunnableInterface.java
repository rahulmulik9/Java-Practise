package basic.b4_Concurancy.CustomeThread;

public class ImplementingRunnableInterface {
    public static void main(String[] args) {
        Runnable myRunnable =()->{
            for (int i = 0;i<5;i++){
                System.out.println("2 second passed");
                try {
                    Thread.sleep(2000);  //adding 2 sec
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        myRunnable.run();   //we cant find start method here so we can pass this as argument to thread class
       //or another way
        Thread theThread = new Thread(myRunnable);
        theThread.start();
    }
}
