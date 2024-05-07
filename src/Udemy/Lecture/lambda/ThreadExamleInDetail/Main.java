package Udemy.Lecture.lambda.ThreadExamleInDetail;

//By using tradition approach
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.println((tname + "Should take 10 dots to run"));
        for (int i = 0; i < 10; i++) {
            System.out.println(" . ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(tname + "Interrupted");
                return;
            }
        }
        System.out.println(tname + "Thread completed");
    }
}


//by using  simple lamda expression
/*
Thread thread = new Thread(new Runnable() {
    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.println((tname + "Should take 10 dots to run"));
        for (int i = 0; i < 10; i++) {
            System.out.println(" . ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(tname + "Interrupted");
                return;
            }
        }
        System.out.println(tname + "Thread completed");
    }
});
*/


//By using lambda expression
/*
 Thread thread = new Thread(() -> {
            String tname = Thread.currentThread().getName();
            System.out.println((tname + "Should take 10 dots to run"));
            for (int i = 0; i < 10; i++) {
                System.out.println(" . ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(tname + "Interrupted");
                    return;
                }
            }
            System.out.println(tname + "Thread completed");
        });"

 */

