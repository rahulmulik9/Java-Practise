package Challenge75_DSA.May.Day15;

class SolSlidingWindowMaximum {
    public static int[] maxSlidingWindowBrute(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++)
                max = Math.max(max, nums[j]);
            result[i] = max;
        }
        return result;
    }

    public static int[] maxSlidingWindowOptimal(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        java.util.Deque<Integer> deque = new java.util.ArrayDeque<>();
        int left = 0, ri = 0;
        for (int right = 0; right < n; right++) {
            if (!deque.isEmpty() && deque.peekFirst() < left)
                deque.pollFirst();
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right])
                deque.pollLast();
            deque.offerLast(right);
            if (right >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
                left++;
            }
        }
        return result;
    }
}

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (java.util.Arrays.equals(new SolSlidingWindowMaximum().maxSlidingWindowBrute(new int[]{1,3,-1,-3,5,3,6,7}, 3),  new int[]{3,3,5,5,6,7}) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (java.util.Arrays.equals(new SolSlidingWindowMaximum().maxSlidingWindowOptimal(new int[]{1,3,-1,-3,5,3,6,7}, 3), new int[]{3,3,5,5,6,7}) ? "PASS" : "FAIL"));

        // Test 2: k equals array length — single window
        System.out.println("Test 2 Brute  : " + (java.util.Arrays.equals(new SolSlidingWindowMaximum().maxSlidingWindowBrute(new int[]{4,2,7,1}, 4),  new int[]{7}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (java.util.Arrays.equals(new SolSlidingWindowMaximum().maxSlidingWindowOptimal(new int[]{4,2,7,1}, 4), new int[]{7}) ? "PASS" : "FAIL"));

        // Test 3: k = 1 — every element is its own max
        System.out.println("Test 3 Brute  : " + (java.util.Arrays.equals(new SolSlidingWindowMaximum().maxSlidingWindowBrute(new int[]{3,1,4,1,5}, 1),  new int[]{3,1,4,1,5}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (java.util.Arrays.equals(new SolSlidingWindowMaximum().maxSlidingWindowOptimal(new int[]{3,1,4,1,5}, 1), new int[]{3,1,4,1,5}) ? "PASS" : "FAIL"));

        // Test 4: Decreasing array — max always at left of window
        System.out.println("Test 4 Brute  : " + (java.util.Arrays.equals(new SolSlidingWindowMaximum().maxSlidingWindowBrute(new int[]{9,7,5,3,1}, 3),  new int[]{9,7,5}) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (java.util.Arrays.equals(new SolSlidingWindowMaximum().maxSlidingWindowOptimal(new int[]{9,7,5,3,1}, 3), new int[]{9,7,5}) ? "PASS" : "FAIL"));
    }
}