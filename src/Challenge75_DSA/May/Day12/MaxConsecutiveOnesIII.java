package Challenge75_DSA.May.Day12;

class SolMaxConsecutiveOnesIII {
    public static int longestOnesBrute(int[] nums, int k) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeros = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) zeros++;
                if (zeros <= k) maxLen = Math.max(maxLen, j - i + 1);
                else break;
            }
        }
        return maxLen;
    }

    public static int longestOnesOptimal(int[] nums, int k) {
        int left = 0, zeros = 0, maxLen = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;
            while (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolMaxConsecutiveOnesIII().longestOnesBrute(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2)  == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolMaxConsecutiveOnesIII().longestOnesOptimal(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2) == 6 ? "PASS" : "FAIL"));

        // Test 2: k = 0 — no flips allowed
        System.out.println("Test 2 Brute  : " + (new SolMaxConsecutiveOnesIII().longestOnesBrute(new int[]{1,1,0,1,1,1,0,1}, 0)  == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolMaxConsecutiveOnesIII().longestOnesOptimal(new int[]{1,1,0,1,1,1,0,1}, 0) == 3 ? "PASS" : "FAIL"));

        // Test 3: k >= total zeros — flip everything
        System.out.println("Test 3 Brute  : " + (new SolMaxConsecutiveOnesIII().longestOnesBrute(new int[]{0,1,0,1,0}, 3)  == 5 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolMaxConsecutiveOnesIII().longestOnesOptimal(new int[]{0,1,0,1,0}, 3) == 5 ? "PASS" : "FAIL"));

        // Test 4: All zeros
        System.out.println("Test 4 Brute  : " + (new SolMaxConsecutiveOnesIII().longestOnesBrute(new int[]{0,0,0,0}, 2)  == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolMaxConsecutiveOnesIII().longestOnesOptimal(new int[]{0,0,0,0}, 2) == 2 ? "PASS" : "FAIL"));
    }
}