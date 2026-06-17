package Challenge75_DSA.June.Day17;


class SolBinarySearch {

    public static int searchBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target) return i;
        return -1;
    }

    public static int searchOptimal(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if      (nums[mid] == target) return mid;
            else if (nums[mid] <  target) left  = mid + 1;
            else                          right = mid - 1;
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {

        // Test 1: Target exists in middle → index 4
        System.out.println("Test 1 Brute  : " + (SolBinarySearch.searchBrute(new int[]{-1,0,3,5,9,12}, 9)   == 4 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolBinarySearch.searchOptimal(new int[]{-1,0,3,5,9,12}, 9) == 4 ? "PASS" : "FAIL"));

        // Test 2: Target does not exist → -1
        System.out.println("Test 2 Brute  : " + (SolBinarySearch.searchBrute(new int[]{-1,0,3,5,9,12}, 2)   == -1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolBinarySearch.searchOptimal(new int[]{-1,0,3,5,9,12}, 2) == -1 ? "PASS" : "FAIL"));

        // Test 3: Single element — target matches → index 0
        System.out.println("Test 3 Brute  : " + (SolBinarySearch.searchBrute(new int[]{5}, 5)   == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolBinarySearch.searchOptimal(new int[]{5}, 5) == 0 ? "PASS" : "FAIL"));

        // Test 4: Target is first element → index 0
        System.out.println("Test 4 Brute  : " + (SolBinarySearch.searchBrute(new int[]{1,3,5,7,9,11}, 1)   == 0 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolBinarySearch.searchOptimal(new int[]{1,3,5,7,9,11}, 1) == 0 ? "PASS" : "FAIL"));
    }
}