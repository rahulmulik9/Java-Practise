package Udemy.Lecture.concurancy.example9_excutive_service.Collable_Future;

import java.util.List;
import java.util.concurrent.*;

class CallableTask implements Callable<String> {
    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        System.out.println("My name is " + name);
        return "Hello " + name;
    }


}

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcome = executorService.submit(new CallableTask("Rahul"));

        String retrunedName = welcome.get();
        System.out.println(retrunedName);
        System.out.println("This is main method");

        List<CallableTask> taskList = List.of(new CallableTask("Rahul"),new CallableTask("Abhijit"),new CallableTask("Animt"));
        executorService.invokeAll(taskList);

        String finalresult = executorService.invokeAll(taskList).toString();
        String singleResult = executorService.invokeAny(taskList);

        executorService.shutdown();
    }
}
