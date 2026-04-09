package Challenge75_new.Day9;
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

}
public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] t1 = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println("Test 1 Brute  : " + (new SolMaxConsecutiveOnesIII().longestOnesBrute(t1, 2)   == 6 ? "PASS" : "FAIL"));
    }

}
