package Challenge75_DSA.Day1;

import java.util.Arrays;
import java.util.HashMap;

class SolTwoSum {

    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

public class TwoSum {
    public static void main(String[] args) {

        // Test 1: [2,7,11,15] target=9 → [0,1]
        System.out.println("Test 1 Brute  : " + (Arrays.equals(new SolTwoSum().twoSumBrute(new int[]{2,7,11,15}, 9),   new int[]{0,1}) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (Arrays.equals(new SolTwoSum().twoSumOptimal(new int[]{2,7,11,15}, 9), new int[]{0,1}) ? "PASS" : "FAIL"));

        // Test 2: [3,2,4] target=6 → [1,2]
        System.out.println("Test 2 Brute  : " + (Arrays.equals(new SolTwoSum().twoSumBrute(new int[]{3,2,4}, 6),   new int[]{1,2}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (Arrays.equals(new SolTwoSum().twoSumOptimal(new int[]{3,2,4}, 6), new int[]{1,2}) ? "PASS" : "FAIL"));

        // Test 3: duplicate values [3,3] target=6 → [0,1]
        System.out.println("Test 3 Brute  : " + (Arrays.equals(new SolTwoSum().twoSumBrute(new int[]{3,3}, 6),   new int[]{0,1}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (Arrays.equals(new SolTwoSum().twoSumOptimal(new int[]{3,3}, 6), new int[]{0,1}) ? "PASS" : "FAIL"));

        // Test 4: negative numbers [-1,-2,-3,-4,-5] target=-8 → [2,4]
        System.out.println("Test 4 Brute  : " + (Arrays.equals(new SolTwoSum().twoSumBrute(new int[]{-1,-2,-3,-4,-5}, -8),   new int[]{2,4}) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (Arrays.equals(new SolTwoSum().twoSumOptimal(new int[]{-1,-2,-3,-4,-5}, -8), new int[]{2,4}) ? "PASS" : "FAIL"));
    }
}