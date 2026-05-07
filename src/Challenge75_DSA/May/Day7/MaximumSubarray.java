package Challenge75_DSA.May.Day7;

class SolMaximumSubarray {
    public static int maxSubarrayBrute(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int maxSubarrayOptimal(int[] nums) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) currentSum = 0;
        }
        return maxSum;
    }
}

public class MaximumSubarray {
    public static void main(String[] args) {
        // Test 1: Standard mixed array
        System.out.println("Test 1 Brute  : " + (new SolMaximumSubarray().maxSubarrayBrute(new int[]{-2,1,-3,4,-1,2,1,-5,4})  == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolMaximumSubarray().maxSubarrayOptimal(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6 ? "PASS" : "FAIL"));

        // Test 2: All negative — must pick least negative
        System.out.println("Test 2 Brute  : " + (new SolMaximumSubarray().maxSubarrayBrute(new int[]{-3,-1,-2})  == -1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolMaximumSubarray().maxSubarrayOptimal(new int[]{-3,-1,-2}) == -1 ? "PASS" : "FAIL"));

        // Test 3: Single element
        System.out.println("Test 3 Brute  : " + (new SolMaximumSubarray().maxSubarrayBrute(new int[]{5})  == 5 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolMaximumSubarray().maxSubarrayOptimal(new int[]{5}) == 5 ? "PASS" : "FAIL"));

        // Test 4: All positive — entire array is the answer
        System.out.println("Test 4 Brute  : " + (new SolMaximumSubarray().maxSubarrayBrute(new int[]{1,2,3,4,5})  == 15 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolMaximumSubarray().maxSubarrayOptimal(new int[]{1,2,3,4,5}) == 15 ? "PASS" : "FAIL"));
    }
}