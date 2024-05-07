package Udemy.Lecture.concurancy.example2;


public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is runing ");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Thread thread = new Thread(() -> {
            String tname = Thread.currentThread().getName();
            System.out.println((tname + "Should take 10 dots to run"));
            for (int i = 0; i < 10; i++) {
                System.out.println(" . ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                   // e.printStackTrace();
                    System.out.println(tname + "Interrupted");
                    return;
                }
            }
            System.out.println(tname + "Thread completed");
        });

        thread.start();
        System.out.println("Main thread continue runing here");


        //tried to interreput thread after 2000 millsec so let sleep main thread for 2000 millisec then intercept int
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //manually interrupting the thread after 4 dots because main thread sleeo for 2000 msec
        thread.interrupt();

    }
}
