package Challenge75_DSA.May.Day5;


class SolFindTheDuplicateNumber {
    public static int findDuplicateBrute(int[] nums) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return num;
        }
        return -1;
    }

    public static int findDuplicateOptimal(int[] nums) {
        int slow = nums[0], fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        // Test 1: Standard case
        System.out.println("Test 1 Brute  : " + (new SolFindTheDuplicateNumber().findDuplicateBrute(new int[]{1,3,4,2,2})  == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolFindTheDuplicateNumber().findDuplicateOptimal(new int[]{1,3,4,2,2}) == 2 ? "PASS" : "FAIL"));

        // Test 2: Duplicate at start of cycle
        System.out.println("Test 2 Brute  : " + (new SolFindTheDuplicateNumber().findDuplicateBrute(new int[]{3,1,3,4,2})  == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolFindTheDuplicateNumber().findDuplicateOptimal(new int[]{3,1,3,4,2}) == 3 ? "PASS" : "FAIL"));

        // Test 3: Duplicate appears more than twice
        System.out.println("Test 3 Brute  : " + (new SolFindTheDuplicateNumber().findDuplicateBrute(new int[]{2,2,2,2,2})  == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolFindTheDuplicateNumber().findDuplicateOptimal(new int[]{2,2,2,2,2}) == 2 ? "PASS" : "FAIL"));

        // Test 4: Minimum size array
        System.out.println("Test 4 Brute  : " + (new SolFindTheDuplicateNumber().findDuplicateBrute(new int[]{1,1})  == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolFindTheDuplicateNumber().findDuplicateOptimal(new int[]{1,1}) == 1 ? "PASS" : "FAIL"));
    }
}
