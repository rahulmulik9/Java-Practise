package Challenge75_new.Day4;

class SolMaximumSubArray{
    public int maxSubArrayBrute(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public int maxSubArrayOptimal(int[] nums) {
        int currentSum = nums[0];
        int maxSum     = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend current subarray OR start fresh from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum     = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

public class MaximumSubArray {
    public static void main(String[] args) {

        // Test 1: Mixed — best subarray [4,-1,2,1] = 6
        int[] t1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test 1 Brute  : " + (new SolMaximumSubArray().maxSubArrayBrute(t1)   == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolMaximumSubArray().maxSubArrayOptimal(t1) == 6 ? "PASS" : "FAIL"));

        // Test 2: All negative — best is single element -1
        int[] t2 = {-3, -1, -2};
        System.out.println("Test 2 Brute  : " + (new SolMaximumSubArray().maxSubArrayBrute(t2)   == -1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolMaximumSubArray().maxSubArrayOptimal(t2) == -1 ? "PASS" : "FAIL"));

        // Test 3: All positive — entire array [1,2,3,4] = 10
        int[] t3 = {1, 2, 3, 4};
        System.out.println("Test 3 Brute  : " + (new SolMaximumSubArray().maxSubArrayBrute(t3)   == 10 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolMaximumSubArray().maxSubArrayOptimal(t3) == 10 ? "PASS" : "FAIL"));

        // Test 4: Single element
        int[] t4 = {5};
        System.out.println("Test 4 Brute  : " + (new SolMaximumSubArray().maxSubArrayBrute(t4)   == 5 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolMaximumSubArray().maxSubArrayOptimal(t4) == 5 ? "PASS" : "FAIL"));
    }
}
