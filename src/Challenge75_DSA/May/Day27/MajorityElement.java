package Challenge75_DSA.May.Day27;

class SolMajorityElement {
    public static int majorityElementBrute(int[] nums) {
        java.util.Map<Integer, Integer> count = new java.util.HashMap<>();
        for (int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);
        for (java.util.Map.Entry<Integer, Integer> entry : count.entrySet())
            if (entry.getValue() > nums.length / 2) return entry.getKey();
        return -1;
    }

    public static int majorityElementOptimal(int[] nums) {
        int candidate = 0, count = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        // Test 1: Standard case — majority in middle
        System.out.println("Test 1 Brute  : " + (new SolMajorityElement().majorityElementBrute(new int[]{2,2,1,1,1,2,2})  == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolMajorityElement().majorityElementOptimal(new int[]{2,2,1,1,1,2,2}) == 2 ? "PASS" : "FAIL"));

        // Test 2: Majority element at start
        System.out.println("Test 2 Brute  : " + (new SolMajorityElement().majorityElementBrute(new int[]{3,2,3})  == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolMajorityElement().majorityElementOptimal(new int[]{3,2,3}) == 3 ? "PASS" : "FAIL"));

        // Test 3: All elements are the same
        System.out.println("Test 3 Brute  : " + (new SolMajorityElement().majorityElementBrute(new int[]{7,7,7,7})  == 7 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolMajorityElement().majorityElementOptimal(new int[]{7,7,7,7}) == 7 ? "PASS" : "FAIL"));

        // Test 4: Single element
        System.out.println("Test 4 Brute  : " + (new SolMajorityElement().majorityElementBrute(new int[]{1})  == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolMajorityElement().majorityElementOptimal(new int[]{1}) == 1 ? "PASS" : "FAIL"));
    }
}