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
}

public class MaximumSubArray {
    public static void main(String[] args) {

    }
}
