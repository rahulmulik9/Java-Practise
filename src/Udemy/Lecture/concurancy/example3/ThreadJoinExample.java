package Udemy.Lecture.concurancy.example3;

public class ThreadJoinExample {
    public static void main(String[] args) {
        Thread firstThread = new Thread(() -> {
            Thread.currentThread().setName("FirstThread");
            String name = Thread.currentThread().getName();
            System.out.println(name + " is Runninng");
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(5000);
                    System.out.println(name + " will sleep for 5 sec ");
                } catch (InterruptedException e) {
                    System.out.println("\nWhoops!! " + name + " interrupted.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        Thread secondThread = new Thread(() -> {
            Thread.currentThread().setName("SecondThread");
            String name = Thread.currentThread().getName();
            System.out.println(name + " is Runninng");
            for (int i = 0; i < 3; i++) {
                System.out.println(name + " is Running ");
            }
        });

        firstThread.start();

        //this tell second thread to join first thread
        try {
            firstThread.join();
        }catch (InterruptedException e ){
            System.out.println("OOPs thread has been interpected");
            e.printStackTrace();
        }

        secondThread.start();

        /* If you use join method then op is
        FirstThread is Runninng
        FirstThread will sleep for 5 sec
        FirstThread will sleep for 5 sec
        FirstThread will sleep for 5 sec
        SecondThread is Runninng
        SecondThread is Running
        SecondThread is Running
        SecondThread is Running*/
       /* if you comment out firstThread.join block then op is
        FirstThread is Runninng
        SecondThread is Runninng
        SecondThread is Running
        SecondThread is Running
        SecondThread is Running
        FirstThread will sleep for 5 sec
        FirstThread will sleep for 5 sec
        FirstThread will sleep for 5 sec*/





    }
}
