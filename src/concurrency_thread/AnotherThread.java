package concurrency_thread;

public class AnotherThread extends Thread{
    //method 1
//    @Override
//    public void run() {
//        System.out.println("Another thread");
//    }

    @Override
    public void run() {
        System.out.println("Timing thread run after time");
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
