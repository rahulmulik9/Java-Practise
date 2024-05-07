package Udemy.Lecture.concurancy.example1;

public class Main {
    public static void main(String[] args) {
        Thread thread  = java.lang.Thread.currentThread();
        System.out.println(thread.getClass().getName());    //java.lang.Thread
        System.out.println(thread.getName());                 //main

        printThredState(thread);

        thread.setPriority(Thread.MIN_PRIORITY);
        printThredState(thread);

        MyThread myextrndedthread = new MyThread();
        MyRunnableThread myRunnableThread = new MyRunnableThread();
       // myextrndedthread.start();
        myextrndedthread.run();
        System.out.println(myextrndedthread.getState().toString() + myextrndedthread.getPriority());
        myRunnableThread.run();
    }

    public static void printThredState(Thread thread){
        System.out.println("-----------------------------------");
        System.out.println("Thread id: "+ thread.getId());
        System.out.println("Thread Name : "+ thread.getName());
        System.out.println("Priority : "+ thread+ thread.getPriority());
        System.out.println("State : "+ thread.getState());
        System.out.println("Is Alive : "+ thread.isAlive());
        System.out.println("___________________________________");
    }

}

class MyThread extends Thread{

    public void run(){
        for(int i=0;i<6;i++){
            System.out.println(i+" : Extending thread");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}

class MyRunnableThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<6;i++){
            System.out.println(i + " : Implement Runnbale ");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
