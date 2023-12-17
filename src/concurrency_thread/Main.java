package concurrency_thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread");

        //way to start thread
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();

        // anotherThread.start();    //=> This will give error because thread only start once.

        //another way to start thread
        new Thread() {
            public void run() {
                System.out.println("Run from anonymous ");
            }
        }.start();



        //another method to run thread
        //uncomment method 1
//        Thread myrunablethread = new Thread(new MyRunable());
//        myrunablethread.start();


        // another way of doing the above process using anonymus class
        /* Thread myrunable = new Thread(new MyRunable(){
            public void run(){
                System.out.println("Using anonymus class");
            }
        });*/


        //giving time to thread
        Thread myrunablethread = new Thread(new MyRunable());
        myrunablethread.start();


    }
}

