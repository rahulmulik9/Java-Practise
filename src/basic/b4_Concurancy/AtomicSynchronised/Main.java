package basic.b4_Concurancy.AtomicSynchronised;

import java.util.concurrent.atomic.AtomicInteger;
/*One of the ways to manage access to an object is to use locks. This can be achieved by using synchronized keyword
* Using locks solves the problem. However, the performance takes a hit.**
- When multiple threads attempt to acquire a lock, one of them wins, while the rest of the threads are either blocked or suspended.
* */
class SharedCouter {
    private int count = 0;

    public void increament() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SharedCounter2 {
    private AtomicInteger count = new AtomicInteger(0);

    public void increament() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

class SharedCounter3 {
    private int count;

    public synchronized void increament() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {

        SharedCouter sharedCouter = new SharedCouter();
        SharedCounter2 sharedCouter2 = new SharedCounter2();
        SharedCounter3 sharedCouter3 = new SharedCounter3();

        new Thread(() -> {
            System.out.println("Thread one started");
            for (int i = 0; i < 1000; i++) {
                sharedCouter.increament();
                sharedCouter2.increament();
                sharedCouter3.increament();
            }
            System.out.println("Thread one completed");
        }).start();

        new Thread(() -> {
            System.out.println("Thread second started");
            for (int i = 0; i < 1000; i++) {
                sharedCouter.increament();
                sharedCouter2.increament();
                sharedCouter3.increament();
            }
            System.out.println("Thread second completed");
        }).start();

        System.out.println("Final count is : " + sharedCouter.getCount());
        System.out.println("Final count is : " + sharedCouter2.getCount());
        System.out.println("Final count is : " + sharedCouter3.getCount());

    }
}
