package Challenge75_DSA.June.Day19;

class SolFindMinimumInRotatedSortedArray {

    public static int findMinBrute(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) min = Math.min(min, nums[i]);
        return min;
    }

    public static int findMinOptimal(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int firstTrueIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= nums[n - 1]) { firstTrueIndex = mid; right = mid - 1; }
            else                            left = mid + 1;
        }
        return nums[firstTrueIndex];
    }
}

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {

        // Test 1: Rotated at index 3 → min = 1
        System.out.println("Test 1 Brute  : " + (SolFindMinimumInRotatedSortedArray.findMinBrute(new int[]{3,4,5,1,2})   == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolFindMinimumInRotatedSortedArray.findMinOptimal(new int[]{3,4,5,1,2}) == 1 ? "PASS" : "FAIL"));

        // Test 2: Rotated at index 4 → min = 0
        System.out.println("Test 2 Brute  : " + (SolFindMinimumInRotatedSortedArray.findMinBrute(new int[]{4,5,6,7,0,1,2})   == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolFindMinimumInRotatedSortedArray.findMinOptimal(new int[]{4,5,6,7,0,1,2}) == 0 ? "PASS" : "FAIL"));

        // Test 3: No rotation → min is first element
        System.out.println("Test 3 Brute  : " + (SolFindMinimumInRotatedSortedArray.findMinBrute(new int[]{1,2,3,4,5})   == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolFindMinimumInRotatedSortedArray.findMinOptimal(new int[]{1,2,3,4,5}) == 1 ? "PASS" : "FAIL"));

        // Test 4: Single element → min is itself
        System.out.println("Test 4 Brute  : " + (SolFindMinimumInRotatedSortedArray.findMinBrute(new int[]{7})   == 7 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolFindMinimumInRotatedSortedArray.findMinOptimal(new int[]{7}) == 7 ? "PASS" : "FAIL"));
    }
}