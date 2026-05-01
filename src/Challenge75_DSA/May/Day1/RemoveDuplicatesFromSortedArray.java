package Challenge75_DSA.May.Day1;


class SolRemoveDuplicatesFromSortedArray {
    public static int removeDuplicatesBrute(int[] nums) {
        if (nums.length == 0) return 0;
        java.util.List<Integer> unique = new java.util.ArrayList<>();
        for (int num : nums)
            if (unique.isEmpty() || unique.get(unique.size() - 1) != num) unique.add(num);
        for (int i = 0; i < unique.size(); i++) nums[i] = unique.get(i);
        return unique.size();
    }

    public static int removeDuplicatesOptimal(int[] nums) {
        if (nums.length == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) { slow++; nums[slow] = nums[fast]; }
        }
        return slow + 1;
    }
}

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        // Test 1: Normal duplicates
        System.out.println("Test 1 Brute  : " + (new SolRemoveDuplicatesFromSortedArray().removeDuplicatesBrute(new int[]{1,1,2,3,3}) == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolRemoveDuplicatesFromSortedArray().removeDuplicatesOptimal(new int[]{1,1,2,3,3}) == 3 ? "PASS" : "FAIL"));

        // Test 2: No duplicates
        System.out.println("Test 2 Brute  : " + (new SolRemoveDuplicatesFromSortedArray().removeDuplicatesBrute(new int[]{1,2,3}) == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolRemoveDuplicatesFromSortedArray().removeDuplicatesOptimal(new int[]{1,2,3}) == 3 ? "PASS" : "FAIL"));

        // Test 3: All same elements
        System.out.println("Test 3 Brute  : " + (new SolRemoveDuplicatesFromSortedArray().removeDuplicatesBrute(new int[]{2,2,2,2}) == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolRemoveDuplicatesFromSortedArray().removeDuplicatesOptimal(new int[]{2,2,2,2}) == 1 ? "PASS" : "FAIL"));

        // Test 4: Single element
        System.out.println("Test 4 Brute  : " + (new SolRemoveDuplicatesFromSortedArray().removeDuplicatesBrute(new int[]{42}) == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolRemoveDuplicatesFromSortedArray().removeDuplicatesOptimal(new int[]{42}) == 1 ? "PASS" : "FAIL"));
    }
}