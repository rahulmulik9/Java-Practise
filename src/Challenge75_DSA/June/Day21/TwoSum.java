package Challenge75_DSA.June.Day21;


class SolTwoSum {

    public static int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) return new int[]{i, j};
        return new int[]{};
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
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

        // Test 1: Classic case → [0, 1]
        System.out.println("Test 1 Brute  : " + (java.util.Arrays.equals(SolTwoSum.twoSumBrute(new int[]{2,7,11,15}, 9),   new int[]{0,1}) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (java.util.Arrays.equals(SolTwoSum.twoSumOptimal(new int[]{2,7,11,15}, 9), new int[]{0,1}) ? "PASS" : "FAIL"));

        // Test 2: Answer in the middle → [1, 2]
        System.out.println("Test 2 Brute  : " + (java.util.Arrays.equals(SolTwoSum.twoSumBrute(new int[]{3,2,4}, 6),   new int[]{1,2}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (java.util.Arrays.equals(SolTwoSum.twoSumOptimal(new int[]{3,2,4}, 6), new int[]{1,2}) ? "PASS" : "FAIL"));

        // Test 3: Duplicate values → [0, 1]
        System.out.println("Test 3 Brute  : " + (java.util.Arrays.equals(SolTwoSum.twoSumBrute(new int[]{3,3}, 6),   new int[]{0,1}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (java.util.Arrays.equals(SolTwoSum.twoSumOptimal(new int[]{3,3}, 6), new int[]{0,1}) ? "PASS" : "FAIL"));

        // Test 4: Negative numbers → [0, 2]
        System.out.println("Test 4 Brute  : " + (java.util.Arrays.equals(SolTwoSum.twoSumBrute(new int[]{-3,4,7,1}, 4),   new int[]{0,2}) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (java.util.Arrays.equals(SolTwoSum.twoSumOptimal(new int[]{-3,4,7,1}, 4), new int[]{0,2}) ? "PASS" : "FAIL"));
    }
}