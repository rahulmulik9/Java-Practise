package Challenge75_DSA.June.Day16;

class SolNextGreaterElementII {

    public static int[] nextGreaterElementsBrute(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        java.util.Arrays.fill(result, -1);
        for (int i = 0; i < n; i++)
            for (int j = 1; j < n; j++) {
                int next = nums[(i + j) % n];
                if (next > nums[i]) { result[i] = next; break; }
            }
        return result;
    }

    public static int[] nextGreaterElementsOptimal(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        java.util.Arrays.fill(result, -1);
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int curr = nums[i % n];
            while (!stack.isEmpty() && curr > nums[stack.peek()])
                result[stack.pop()] = curr;
            if (i < n) stack.push(i);
        }
        return result;
    }
}

public class NextGreaterElementII {
    public static void main(String[] args) {

        // Test 1: Classic circular case → [2,-1,2]
        System.out.println("Test 1 Brute  : " + (java.util.Arrays.equals(SolNextGreaterElementII.nextGreaterElementsBrute(new int[]{1,2,1}),   new int[]{2,-1,2})      ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (java.util.Arrays.equals(SolNextGreaterElementII.nextGreaterElementsOptimal(new int[]{1,2,1}),  new int[]{2,-1,2})      ? "PASS" : "FAIL"));

        // Test 2: Wrap needed for last elements → [2,3,-1,2,3]
        System.out.println("Test 2 Brute  : " + (java.util.Arrays.equals(SolNextGreaterElementII.nextGreaterElementsBrute(new int[]{1,2,3,1,2}),   new int[]{2,3,-1,2,3}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (java.util.Arrays.equals(SolNextGreaterElementII.nextGreaterElementsOptimal(new int[]{1,2,3,1,2}),  new int[]{2,3,-1,2,3}) ? "PASS" : "FAIL"));

        // Test 3: Strictly decreasing → max is always first element
        System.out.println("Test 3 Brute  : " + (java.util.Arrays.equals(SolNextGreaterElementII.nextGreaterElementsBrute(new int[]{5,4,3,2,1}),   new int[]{-1,5,5,5,5}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (java.util.Arrays.equals(SolNextGreaterElementII.nextGreaterElementsOptimal(new int[]{5,4,3,2,1}),  new int[]{-1,5,5,5,5}) ? "PASS" : "FAIL"));

        // Test 4: All same elements → all -1
        System.out.println("Test 4 Brute  : " + (java.util.Arrays.equals(SolNextGreaterElementII.nextGreaterElementsBrute(new int[]{3,3,3}),   new int[]{-1,-1,-1})    ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (java.util.Arrays.equals(SolNextGreaterElementII.nextGreaterElementsOptimal(new int[]{3,3,3}),  new int[]{-1,-1,-1})    ? "PASS" : "FAIL"));
    }
}