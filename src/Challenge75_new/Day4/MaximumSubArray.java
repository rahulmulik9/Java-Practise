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

    }
}
