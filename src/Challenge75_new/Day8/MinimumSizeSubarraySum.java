package Challenge75_new.Day8;

class SolMinimumSizeSubarraySum {

    public static int minSubArrayLenBrute(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
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
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

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
        int[] nums1 = {2,3,1,2,4,3};
        int target1 = 7;
        int res1Brute = SolMinimumSizeSubarraySum.minSubArrayLenBrute(target1, nums1);
        int res1Opt = SolMinimumSizeSubarraySum.minSubArrayLenOptimal(target1, nums1);
        System.out.println("Test 1 Brute  : " + (res1Brute == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (res1Opt == 2 ? "PASS" : "FAIL"));

        int[] nums2 = {1,4,4};
        int target2 = 4;
        int res2Brute = SolMinimumSizeSubarraySum.minSubArrayLenBrute(target2, nums2);
        int res2Opt = SolMinimumSizeSubarraySum.minSubArrayLenOptimal(target2, nums2);
        System.out.println("Test 2 Brute  : " + (res2Brute == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (res2Opt == 1 ? "PASS" : "FAIL"));

    }
}

