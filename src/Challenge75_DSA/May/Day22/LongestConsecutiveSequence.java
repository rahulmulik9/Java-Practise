package Challenge75_DSA.May.Day22;


class SolLongestConsecutiveSequence {
    public static int longestConsecutiveBrute(int[] nums) {
        int maxLen = 0;
        for (int num : nums) {
            int current = num, streak = 1;
            while (contains(nums, current + 1)) { current++; streak++; }
            maxLen = Math.max(maxLen, streak);
        }
        return maxLen;
    }

    private static boolean contains(int[] nums, int target) {
        for (int n : nums) if (n == target) return true;
        return false;
    }

    public static int longestConsecutiveOptimal(int[] nums) {
        java.util.Set<Integer> numSet = new java.util.HashSet<>();
        for (int num : nums) numSet.add(num);
        int maxLen = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int current = num, streak = 1;
                while (numSet.contains(current + 1)) { current++; streak++; }
                maxLen = Math.max(maxLen, streak);
            }
        }
        return maxLen;
    }
}

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolLongestConsecutiveSequence().longestConsecutiveBrute(new int[]{100,4,200,1,3,2})  == 4 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolLongestConsecutiveSequence().longestConsecutiveOptimal(new int[]{100,4,200,1,3,2}) == 4 ? "PASS" : "FAIL"));

        // Test 2: Array with duplicates
        System.out.println("Test 2 Brute  : " + (new SolLongestConsecutiveSequence().longestConsecutiveBrute(new int[]{0,3,7,2,5,8,4,6,0,1})  == 9 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolLongestConsecutiveSequence().longestConsecutiveOptimal(new int[]{0,3,7,2,5,8,4,6,0,1}) == 9 ? "PASS" : "FAIL"));

        // Test 3: Single element
        System.out.println("Test 3 Brute  : " + (new SolLongestConsecutiveSequence().longestConsecutiveBrute(new int[]{42})  == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolLongestConsecutiveSequence().longestConsecutiveOptimal(new int[]{42}) == 1 ? "PASS" : "FAIL"));

        // Test 4: Empty array
        System.out.println("Test 4 Brute  : " + (new SolLongestConsecutiveSequence().longestConsecutiveBrute(new int[]{})  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolLongestConsecutiveSequence().longestConsecutiveOptimal(new int[]{}) == 0 ? "PASS" : "FAIL"));
    }
}