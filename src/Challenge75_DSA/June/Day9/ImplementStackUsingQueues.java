package Challenge75_DSA.June.Day9;

class SolMyStack {
    java.util.Queue<Integer> queue = new java.util.LinkedList<>();

    public void push(int x) {
        queue.add(x);
        int rotations = queue.size() - 1;
        for (int i = 0; i < rotations; i++) queue.add(queue.poll());
    }

    public int pop()       { return queue.poll(); }

    public int top()       { return queue.peek(); }

    public boolean empty() { return queue.isEmpty(); }
}

public class ImplementStackUsingQueues {
    public static void main(String[] args) {

        // Test 1: Basic push + top + pop LIFO order
        SolMyStack s1 = new SolMyStack();
        s1.push(1); s1.push(2); s1.push(3);
        System.out.println("Test 1 Optimal: " + (s1.top() == 3 && s1.pop() == 3 && s1.pop() == 2 ? "PASS" : "FAIL"));

        // Test 2: empty() check before and after full drain
        SolMyStack s2 = new SolMyStack();
        boolean emptyBefore = s2.empty();
        s2.push(5);
        s2.pop();
        boolean emptyAfter = s2.empty();
        System.out.println("Test 2 Optimal: " + (emptyBefore && emptyAfter ? "PASS" : "FAIL"));

        // Test 3: Interleaved push and pop maintains LIFO order
        SolMyStack s3 = new SolMyStack();
        s3.push(1); s3.push(2);
        int first = s3.pop();
        s3.push(3);
        int second = s3.pop();
        int third  = s3.pop();
        System.out.println("Test 3 Optimal: " + (first == 2 && second == 3 && third == 1 ? "PASS" : "FAIL"));

        // Test 4: top() does not remove element
        SolMyStack s4 = new SolMyStack();
        s4.push(7); s4.push(8);
        int topped  = s4.top();
        int popped  = s4.pop();
        System.out.println("Test 4 Optimal: " + (topped == 8 && popped == 8 && s4.top() == 7 ? "PASS" : "FAIL"));
    }
}