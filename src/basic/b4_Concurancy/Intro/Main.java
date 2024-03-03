package basic.b4_Concurancy.Intro;

public class Main {
    public static void main(String[] args) {
      Thread thread  = java.lang.Thread.currentThread();
        System.out.println(thread.getClass().getName());    //java.lang.Thread
        System.out.println(thread.getName());                 //main

        printThredState(thread);
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
