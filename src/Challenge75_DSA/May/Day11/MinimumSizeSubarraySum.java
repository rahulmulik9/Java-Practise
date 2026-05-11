package Challenge75_DSA.May.Day11;

class SolMinimumSizeSubarraySum {
    public static int minSubArrayLenBrute(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static int minSubArrayLenOptimal(int target, int[] nums) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolMinimumSizeSubarraySum().minSubArrayLenBrute(7, new int[]{2,3,1,2,4,3})  == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolMinimumSizeSubarraySum().minSubArrayLenOptimal(7, new int[]{2,3,1,2,4,3}) == 2 ? "PASS" : "FAIL"));

        // Test 2: Entire array needed
        System.out.println("Test 2 Brute  : " + (new SolMinimumSizeSubarraySum().minSubArrayLenBrute(15, new int[]{1,2,3,4,5})  == 5 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolMinimumSizeSubarraySum().minSubArrayLenOptimal(15, new int[]{1,2,3,4,5}) == 5 ? "PASS" : "FAIL"));

        // Test 3: No valid subarray exists
        System.out.println("Test 3 Brute  : " + (new SolMinimumSizeSubarraySum().minSubArrayLenBrute(100, new int[]{1,2,3})  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolMinimumSizeSubarraySum().minSubArrayLenOptimal(100, new int[]{1,2,3}) == 0 ? "PASS" : "FAIL"));

        // Test 4: Single element equals target
        System.out.println("Test 4 Brute  : " + (new SolMinimumSizeSubarraySum().minSubArrayLenBrute(4, new int[]{1,4,2,3})  == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolMinimumSizeSubarraySum().minSubArrayLenOptimal(4, new int[]{1,4,2,3}) == 1 ? "PASS" : "FAIL"));
    }
}