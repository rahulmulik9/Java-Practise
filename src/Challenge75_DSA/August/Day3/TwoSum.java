package Challenge75_DSA.August.Day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SolTwoSum {

    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

public class TwoSum {
    public static void main(String[] args) {

        // Test 1: Normal case
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        System.out.println("Test 1 Brute : " + (Arrays.equals(new SolTwoSum().twoSumBrute(nums1, target1), expected1) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (Arrays.equals(new SolTwoSum().twoSumOptimal(nums1, target1), expected1) ? "PASS" : "FAIL"));

        // Test 2: Answer at the end
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        System.out.println("Test 2 Brute : " + (Arrays.equals(new SolTwoSum().twoSumBrute(nums2, target2), expected2) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (Arrays.equals(new SolTwoSum().twoSumOptimal(nums2, target2), expected2) ? "PASS" : "FAIL"));

        // Test 3: Duplicate values
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        System.out.println("Test 3 Brute : " + (Arrays.equals(new SolTwoSum().twoSumBrute(nums3, target3), expected3) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (Arrays.equals(new SolTwoSum().twoSumOptimal(nums3, target3), expected3) ? "PASS" : "FAIL"));

        // Test 4: Negative numbers
        int[] nums4 = {-3, 4, 3, 90};
        int target4 = 0;
        int[] expected4 = {0, 2};
        System.out.println("Test 4 Brute : " + (Arrays.equals(new SolTwoSum().twoSumBrute(nums4, target4), expected4) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (Arrays.equals(new SolTwoSum().twoSumOptimal(nums4, target4), expected4) ? "PASS" : "FAIL"));
    }
}