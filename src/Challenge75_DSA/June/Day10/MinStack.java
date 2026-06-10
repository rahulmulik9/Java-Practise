package Challenge75_DSA.June.Day10;


class SolMinStack {
    java.util.Stack<Integer> stack    = new java.util.Stack<>();
    java.util.Stack<Integer> minStack = new java.util.Stack<>();

    public void push(int val) {
        stack.push(val);
        int currentMin = minStack.isEmpty() ? val : Math.min(val, minStack.peek());
        minStack.push(currentMin);
    }

    public void pop()       { stack.pop(); minStack.pop(); }

    public int  top()       { return stack.peek(); }

    public int  getMin()    { return minStack.peek(); }
}

public class MinStack {
    public static void main(String[] args) {

        // Test 1: Classic case — getMin updates correctly after pop
        SolMinStack s1 = new SolMinStack();
        s1.push(-2); s1.push(0); s1.push(-3);
        boolean t1 = s1.getMin() == -3;
        s1.pop();
        t1 = t1 && s1.top() == 0 && s1.getMin() == -2;
        System.out.println("Test 1 Optimal: " + (t1 ? "PASS" : "FAIL"));

        // Test 2: Duplicate minimums — both tracked correctly
        SolMinStack s2 = new SolMinStack();
        s2.push(1); s2.push(1);
        boolean t2 = s2.getMin() == 1;
        s2.pop();
        t2 = t2 && s2.getMin() == 1;   // second 1 still tracked
        System.out.println("Test 2 Optimal: " + (t2 ? "PASS" : "FAIL"));

        // Test 3: Min is always the only element
        SolMinStack s3 = new SolMinStack();
        s3.push(5);
        boolean t3 = s3.getMin() == 5 && s3.top() == 5;
        System.out.println("Test 3 Optimal: " + (t3 ? "PASS" : "FAIL"));

        // Test 4: Increasing sequence — min stays at bottom
        SolMinStack s4 = new SolMinStack();
        s4.push(1); s4.push(2); s4.push(3);
        boolean t4 = s4.getMin() == 1 && s4.top() == 3;
        s4.pop(); s4.pop();
        t4 = t4 && s4.getMin() == 1 && s4.top() == 1;
        System.out.println("Test 4 Optimal: " + (t4 ? "PASS" : "FAIL"));
    }
}