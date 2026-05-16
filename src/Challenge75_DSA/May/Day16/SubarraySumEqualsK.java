

package Challenge75_new.Day16;

class SolSubarraySumEqualsK {
    public static int subarraySumBrute(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) count++;
            }
        }
        return count;
    }

    public static int subarraySumOptimal(int[] nums, int k) {
        java.util.Map<Integer, Integer> prefixCount = new java.util.HashMap<>();
        prefixCount.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            count += prefixCount.getOrDefault(sum - k, 0);
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        // Test 1: Standard case with duplicates
        System.out.println("Test 1 Brute  : " + (new SolSubarraySumEqualsK().subarraySumBrute(new int[]{1,1,1}, 2)  == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolSubarraySumEqualsK().subarraySumOptimal(new int[]{1,1,1}, 2) == 2 ? "PASS" : "FAIL"));

        // Test 2: Negative numbers present
        System.out.println("Test 2 Brute  : " + (new SolSubarraySumEqualsK().subarraySumBrute(new int[]{1,-1,1}, 1)  == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolSubarraySumEqualsK().subarraySumOptimal(new int[]{1,-1,1}, 1) == 3 ? "PASS" : "FAIL"));

        // Test 3: Single element equals k
        System.out.println("Test 3 Brute  : " + (new SolSubarraySumEqualsK().subarraySumBrute(new int[]{3}, 3)  == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolSubarraySumEqualsK().subarraySumOptimal(new int[]{3}, 3) == 1 ? "PASS" : "FAIL"));

        // Test 4: No valid subarray
        System.out.println("Test 4 Brute  : " + (new SolSubarraySumEqualsK().subarraySumBrute(new int[]{1,2,3}, 7)  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolSubarraySumEqualsK().subarraySumOptimal(new int[]{1,2,3}, 7) == 0 ? "PASS" : "FAIL"));
    }
}