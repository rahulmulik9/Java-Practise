package Challenge75_DSA.June.Day8;


class SolMyQueue {
    java.util.Stack<Integer> inbox  = new java.util.Stack<>();
    java.util.Stack<Integer> outbox = new java.util.Stack<>();

    public void push(int x) { inbox.push(x); }

    public int pop() { transfer(); return outbox.pop(); }

    public int peek() { transfer(); return outbox.peek(); }

    public boolean empty() { return inbox.isEmpty() && outbox.isEmpty(); }

    private void transfer() {
        if (outbox.isEmpty())
            while (!inbox.isEmpty()) outbox.push(inbox.pop());
    }
}

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {

        // Test 1: Basic push + peek + pop order
        SolMyQueue q1 = new SolMyQueue();
        q1.push(1); q1.push(2); q1.push(3);
        System.out.println("Test 1 Optimal: " + (q1.peek() == 1 && q1.pop() == 1 && q1.pop() == 2 ? "PASS" : "FAIL"));

        // Test 2: empty() check before and after full drain
        SolMyQueue q2 = new SolMyQueue();
        boolean emptyBefore = q2.empty();
        q2.push(5);
        q2.pop();
        boolean emptyAfter = q2.empty();
        System.out.println("Test 2 Optimal: " + (emptyBefore && emptyAfter ? "PASS" : "FAIL"));

        // Test 3: Interleaved push and pop maintains FIFO order
        SolMyQueue q3 = new SolMyQueue();
        q3.push(1); q3.push(2);
        int first = q3.pop();
        q3.push(3);
        int second = q3.pop();
        int third  = q3.pop();
        System.out.println("Test 3 Optimal: " + (first == 1 && second == 2 && third == 3 ? "PASS" : "FAIL"));

        // Test 4: peek does not remove element
        SolMyQueue q4 = new SolMyQueue();
        q4.push(7); q4.push(8);
        int peeked = q4.peek();
        int popped = q4.pop();
        System.out.println("Test 4 Optimal: " + (peeked == 7 && popped == 7 && q4.peek() == 8 ? "PASS" : "FAIL"));
    }
}