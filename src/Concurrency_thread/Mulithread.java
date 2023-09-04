package Concurrency_thread;

public class Mulithread {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();
        CountDownThread t1=new CountDownThread(countDown);
        t1.setName("Thread1");

        CountDownThread t2=new CountDownThread(countDown);
        t1.setName("Thread2");

        t1.start();
        t2.start();



    }
}

class ThreadColor {
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
}

class CountDown {
    public void doCountDown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread1":
                color = ThreadColor.YELLOW;
                break;
            case "Thread2":
                color = ThreadColor.RED;
                break;
            default:
                color = ThreadColor.BLACK;
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + " :i = " + i);
        }
    }
}

class CountDownThread extends Thread {
    private CountDown countDown;

    public CountDownThread(CountDown countDown) {
        this.countDown = countDown;
    }

    public void run() {
        countDown.doCountDown();
    }
}