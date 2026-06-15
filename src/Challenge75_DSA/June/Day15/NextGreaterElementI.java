package Challenge75_DSA.June.Day15;


class SolNextGreaterElementI {

    public static int[] nextGreaterElementBrute(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = -1;
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) found = true;
                if (found && nums2[j] > nums1[i]) { result[i] = nums2[j]; break; }
            }
        }
        return result;
    }

    public static int[] nextGreaterElementOptimal(int[] nums1, int[] nums2) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) map.put(stack.pop(), num);
            stack.push(num);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) result[i] = map.getOrDefault(nums1[i], -1);
        return result;
    }
}

public class NextGreaterElementI {
    public static void main(String[] args) {

        // Test 1: Mixed result → [-1, 3, -1]
        System.out.println("Test 1 Brute  : " + (java.util.Arrays.equals(SolNextGreaterElementI.nextGreaterElementBrute(new int[]{4,1,2},   new int[]{1,3,4,2}),  new int[]{-1,3,-1}) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (java.util.Arrays.equals(SolNextGreaterElementI.nextGreaterElementOptimal(new int[]{4,1,2}, new int[]{1,3,4,2}),  new int[]{-1,3,-1}) ? "PASS" : "FAIL"));

        // Test 2: All have next greater → [3, 3]
        System.out.println("Test 2 Brute  : " + (java.util.Arrays.equals(SolNextGreaterElementI.nextGreaterElementBrute(new int[]{2,4},   new int[]{1,2,3,4,3}),  new int[]{3,-1}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (java.util.Arrays.equals(SolNextGreaterElementI.nextGreaterElementOptimal(new int[]{2,4}, new int[]{1,2,3,4,3}),  new int[]{3,-1}) ? "PASS" : "FAIL"));

        // Test 3: Strictly decreasing nums2 → all -1
        System.out.println("Test 3 Brute  : " + (java.util.Arrays.equals(SolNextGreaterElementI.nextGreaterElementBrute(new int[]{3,2,1},   new int[]{3,2,1}),  new int[]{-1,-1,-1}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (java.util.Arrays.equals(SolNextGreaterElementI.nextGreaterElementOptimal(new int[]{3,2,1}, new int[]{3,2,1}),  new int[]{-1,-1,-1}) ? "PASS" : "FAIL"));

        // Test 4: Single element with no greater → [-1]
        System.out.println("Test 4 Brute  : " + (java.util.Arrays.equals(SolNextGreaterElementI.nextGreaterElementBrute(new int[]{1},   new int[]{1}),  new int[]{-1}) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (java.util.Arrays.equals(SolNextGreaterElementI.nextGreaterElementOptimal(new int[]{1}, new int[]{1}),  new int[]{-1}) ? "PASS" : "FAIL"));
    }
}