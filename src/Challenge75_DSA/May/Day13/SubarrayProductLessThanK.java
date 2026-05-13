package Challenge75_DSA.May.Day13;

class SolSubarrayProductLessThanK {
    public static int numSubarrayProductLessThanKBrute(int[] nums, int k) {
        if (k <= 1) return 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                if (product < k) count++;
                else break;
            }
        }
        return count;
    }

    public static int numSubarrayProductLessThanKOptimal(int[] nums, int k) {
        if (k <= 1) return 0;
        int left = 0, product = 1, count = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolSubarrayProductLessThanK().numSubarrayProductLessThanKBrute(new int[]{10,5,2,6}, 100)  == 8 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolSubarrayProductLessThanK().numSubarrayProductLessThanKOptimal(new int[]{10,5,2,6}, 100) == 8 ? "PASS" : "FAIL"));

        // Test 2: k <= 1 — no valid subarray
        System.out.println("Test 2 Brute  : " + (new SolSubarrayProductLessThanK().numSubarrayProductLessThanKBrute(new int[]{1,2,3}, 1)  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolSubarrayProductLessThanK().numSubarrayProductLessThanKOptimal(new int[]{1,2,3}, 1) == 0 ? "PASS" : "FAIL"));

        // Test 3: All single elements qualify, no pair qualifies
        System.out.println("Test 3 Brute  : " + (new SolSubarrayProductLessThanK().numSubarrayProductLessThanKBrute(new int[]{1,1,1}, 2)  == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolSubarrayProductLessThanK().numSubarrayProductLessThanKOptimal(new int[]{1,1,1}, 2) == 6 ? "PASS" : "FAIL"));

        // Test 4: Large k — all subarrays qualify
        System.out.println("Test 4 Brute  : " + (new SolSubarrayProductLessThanK().numSubarrayProductLessThanKBrute(new int[]{1,2,3}, 100)  == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolSubarrayProductLessThanK().numSubarrayProductLessThanKOptimal(new int[]{1,2,3}, 100) == 6 ? "PASS" : "FAIL"));
    }
}