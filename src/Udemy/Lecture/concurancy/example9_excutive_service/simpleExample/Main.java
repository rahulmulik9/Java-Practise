package Udemy.Lecture.concurancy.example9_excutive_service.simpleExample;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskFirst extends Thread{
    public void run(){
        System.out.println("By extending thread class");
        for(int i=0;i<10;i++){
            System.out.println("Thread");
        }
    }
}

class TaskSecond implements Runnable{

    @Override
    public void run() {
        System.out.println("By implementing Runnable interface");
        for(int i=0;i<10;i++){
            System.out.println("Runnable");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();


        /*FirstThread thread1 = new FirstThread();
        SecondThread thread2 = new SecondThread();
        executorService.execute(thread1);
        executorService.execute(thread2);*/

        executorService.execute(new TaskFirst());
        executorService.execute(new Thread(new TaskSecond()));

        //task 3
        System.out.println("From main class thread");
        for(int i=0;i<10;i++){
            System.out.println("Main class");
        }



        executorService.shutdown();  //otherwise it will continue to run programme
    }

}
