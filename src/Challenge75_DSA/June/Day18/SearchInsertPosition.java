package Challenge75_DSA.June.Day18;

class SolSearchInsertPosition {

    public static int searchInsertBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] >= target) return i;
        return nums.length;
    }

    public static int searchInsertOptimal(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if      (nums[mid] == target) return mid;
            else if (nums[mid] <  target) left  = mid + 1;
            else                          right = mid - 1;
        }
        return left;
    }
}

public class SearchInsertPosition {
    public static void main(String[] args) {

        // Test 1: Target exists → index 2
        System.out.println("Test 1 Brute  : " + (SolSearchInsertPosition.searchInsertBrute(new int[]{1,3,5,6}, 5)   == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolSearchInsertPosition.searchInsertOptimal(new int[]{1,3,5,6}, 5) == 2 ? "PASS" : "FAIL"));

        // Test 2: Insert between elements → index 1
        System.out.println("Test 2 Brute  : " + (SolSearchInsertPosition.searchInsertBrute(new int[]{1,3,5,6}, 2)   == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolSearchInsertPosition.searchInsertOptimal(new int[]{1,3,5,6}, 2) == 1 ? "PASS" : "FAIL"));

        // Test 3: Insert at end → index 4
        System.out.println("Test 3 Brute  : " + (SolSearchInsertPosition.searchInsertBrute(new int[]{1,3,5,6}, 7)   == 4 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolSearchInsertPosition.searchInsertOptimal(new int[]{1,3,5,6}, 7) == 4 ? "PASS" : "FAIL"));

        // Test 4: Insert at start → index 0
        System.out.println("Test 4 Brute  : " + (SolSearchInsertPosition.searchInsertBrute(new int[]{1,3,5,6}, 0)   == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolSearchInsertPosition.searchInsertOptimal(new int[]{1,3,5,6}, 0) == 0 ? "PASS" : "FAIL"));
    }
}