package Challenge75_DSA.May.Day23;


class SolContiguousArray {
    public static int findMaxLengthBrute(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) zeros++;
                else ones++;
                if (zeros == ones) maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }

    public static int findMaxLengthOptimal(int[] nums) {
        java.util.Map<Integer, Integer> firstIndex = new java.util.HashMap<>();
        firstIndex.put(0, -1);
        int sum = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 1) ? 1 : -1;
            if (firstIndex.containsKey(sum))
                maxLen = Math.max(maxLen, i - firstIndex.get(sum));
            else
                firstIndex.put(sum, i);
        }
        return maxLen;
    }
}

public class ContiguousArray {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolContiguousArray().findMaxLengthBrute(new int[]{0,1,0,1,1,0,1})  == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolContiguousArray().findMaxLengthOptimal(new int[]{0,1,0,1,1,0,1}) == 6 ? "PASS" : "FAIL"));

        // Test 2: Entire array is balanced
        System.out.println("Test 2 Brute  : " + (new SolContiguousArray().findMaxLengthBrute(new int[]{0,1})  == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolContiguousArray().findMaxLengthOptimal(new int[]{0,1}) == 2 ? "PASS" : "FAIL"));

        // Test 3: No balanced subarray
        System.out.println("Test 3 Brute  : " + (new SolContiguousArray().findMaxLengthBrute(new int[]{0,0,0})  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolContiguousArray().findMaxLengthOptimal(new int[]{0,0,0}) == 0 ? "PASS" : "FAIL"));

        // Test 4: Balanced subarray starts from index 0 — tests {0:-1} init
        System.out.println("Test 4 Brute  : " + (new SolContiguousArray().findMaxLengthBrute(new int[]{0,1,0,1})  == 4 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolContiguousArray().findMaxLengthOptimal(new int[]{0,1,0,1}) == 4 ? "PASS" : "FAIL"));
    }
}