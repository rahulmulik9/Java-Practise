package Concurrency_thread;

public class Synchronisation {

    public static void main(String[] args) {
        CountDown1 countDown1 = new CountDown1();
        CountDown1 countDown2 = new CountDown1();
        CountDownThread1 t1=new CountDownThread1(countDown1);
        t1.setName("Thread1");

        CountDownThread1 t2=new CountDownThread1(countDown2);
        t1.setName("Thread2");

        t1.start();
        t2.start();

        /*
        in the above example if you create two objects of CountDown and passed to the CountDownThread1 or create only one object and pass down to thah
         still, you get output randomly means some thread of t1 and t2 are run randomly
        to get synchronize the output add keyword synchronized in doCountdown then first t1 run then t2 run
        */

        //we cant synchronise the constructor.this will go to RACE condition
        //onyl methods can be synchronise
        //only one thread at a time will be locked

    }
}

class ThreadColor1 {

    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
}

class CountDown1 {
    private int i;
    public synchronized void doCountDown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread1":
                color = ThreadColor1.YELLOW;
                break;
            case "Thread2":
                color = ThreadColor1.RED;
                break;
            default:
                color = ThreadColor1.BLACK;
        }

        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + " :i = " + i);
        }
    }
}

class CountDownThread1 extends Thread {
    private CountDown1 countDown1;

    public CountDownThread1(CountDown1 countDown1) {
        this.countDown1 = countDown1;
    }

    public void run() {
        countDown1.doCountDown();
    }
}
