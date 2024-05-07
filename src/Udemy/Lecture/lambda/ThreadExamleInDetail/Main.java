package Udemy.Lecture.lambda.ThreadExamleInDetail;

//By using tradition approach
class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("MyRunnable");
        System.out.println(Thread.currentThread().getName() + " : It is created implementing runnable interface by tradition approach");

    }
}
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        //same example with lambda approach
        Runnable myRunable = () -> {
            Thread.currentThread().setName("MyRunnable");
            System.out.println("threadLambda : It is created implementing runnable interface by lambda approach");
        };
        Thread threadLambda = new Thread(myRunable);
        threadLambda.start();


        Thread threadLambda1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("MyRunnable");
                System.out.println("threadLambda1 : It is created implementing new runnable interface using lambda in Thread class");
            }
        });
        threadLambda1.start();


        Thread threadLambda3 = new Thread(() -> {
            Thread.currentThread().setName("MyRunnable");
            System.out.println("threadLambda2 : It is created implementing runnable interface using lambda in Thread class");
        });
        threadLambda3.start();






    }
}




//by using  simple lamda expression
/*
Thread thread = new Thread(new Runnable() {
    @Override
    public void run() {
      Thread.currentThread().setName("MyRunnable");
        System.out.println(Thread.currentThread().getName() + " : It is created implementing runnable interface");
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

/* //second way using lambda function
Runnable myRunable = () -> {
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
};

Thread thread = new Thread(myRunable);*/





