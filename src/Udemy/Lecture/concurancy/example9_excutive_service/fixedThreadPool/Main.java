package Udemy.Lecture.concurancy.example9_excutive_service.fixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    private int index;

    public Task(int index) {
        this.index = index;
    }


    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Task :"+index+" is Running");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Thread( new Task(1)));
        executorService.execute(new Thread( new Task(2)));
        executorService.execute(new Thread( new Task(3)));

        executorService.shutdown();


    }
}
