package Challenge75_DSA.May.Day19;


class SolFindPivotIndex {
    public static int pivotIndexBrute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++)                leftSum  += nums[j];
            for (int j = i + 1; j < nums.length; j++)  rightSum += nums[j];
            if (leftSum == rightSum) return i;
        }
        return -1;
    }

    public static int pivotIndexOptimal(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}

public class FindPivotIndex {
    public static void main(String[] args) {
        // Test 1: Standard case — pivot in the middle
        System.out.println("Test 1 Brute  : " + (new SolFindPivotIndex().pivotIndexBrute(new int[]{1,7,3,6,5,6})  == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolFindPivotIndex().pivotIndexOptimal(new int[]{1,7,3,6,5,6}) == 3 ? "PASS" : "FAIL"));

        // Test 2: No pivot exists
        System.out.println("Test 2 Brute  : " + (new SolFindPivotIndex().pivotIndexBrute(new int[]{1,2,3})  == -1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolFindPivotIndex().pivotIndexOptimal(new int[]{1,2,3}) == -1 ? "PASS" : "FAIL"));

        // Test 3: Pivot at index 0 — left sum is 0
        System.out.println("Test 3 Brute  : " + (new SolFindPivotIndex().pivotIndexBrute(new int[]{0,1,-1})  == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolFindPivotIndex().pivotIndexOptimal(new int[]{0,1,-1}) == 0 ? "PASS" : "FAIL"));

        // Test 4: Pivot at last index — right sum is 0
        System.out.println("Test 4 Brute  : " + (new SolFindPivotIndex().pivotIndexBrute(new int[]{1,2,3,0})  == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolFindPivotIndex().pivotIndexOptimal(new int[]{1,2,3,0}) == 3 ? "PASS" : "FAIL"));
    }
}