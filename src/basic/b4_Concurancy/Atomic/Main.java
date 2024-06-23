package basic.b4_Concurancy.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

class SafeCounterWithoutLock {
    private final AtomicInteger counter = new AtomicInteger(0);

    int getValue() {
        return counter.get();
    }

    void increment() {
        counter.incrementAndGet();
    }
}

//instead of above you can use this below
/*But issue it that When multiple threads attempt to acquire a lock, one of them wins, while the rest of the threads are either blocked or suspended.*/
class SafeCounterWithLock2 {
    private int counter;

    public synchronized void increment() {
        counter++;
    }
}

public class Main {
    public static void main(String[] args) {
        SafeCounterWithoutLock safeCounterWithoutLock =  new SafeCounterWithoutLock();

        System.out.println(safeCounterWithoutLock.getValue());
        safeCounterWithoutLock.increment();
        System.out.println(safeCounterWithoutLock.getValue());


    }
}

