package basic.b4_Concurancy.CustomeThread;

import java.util.concurrent.TimeUnit;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        CustomeThread theThread = new CustomeThread();
        //theThread.start();     //when you heThread.start(); then output will like 5,2,2,5,2,2,2
        theThread.run();          //when you use heThread.run(); then ouput will like 2,2,2,2,5,5,5

        for (int i = 0; i < 3; i++) {
            System.out.println("5 second passed");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 class CustomeThread  extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println("2 second passed");
            try {
                Thread.sleep(2000);  //adding 2 sec
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

