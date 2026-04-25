package Challenge75_new.Day19;

class SolMajorityElement {

    public static int majorityElementBrute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) count++;
            }
            if (count > n / 2) return nums[i];
        }
        return -1;
    }

    public static int majorityElementOptimal(int[] nums) {
        int candidate = nums[0], count = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            if (num == candidate) count++;
            else count--;
        }
        return candidate;
    }
}

public class MajorityElement {
    public static void main(String[] args) {

        // Test 1: [3,2,3] → 3 appears 2 times > n/2=1.5
        int[] t1 = {3, 2, 3};
        System.out.println("Test 1 Brute  : " + (new SolMajorityElement().majorityElementBrute(t1)   == 3 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (new SolMajorityElement().majorityElementOptimal(t1) == 3 ? "PASS" : "FAIL"));

        // Test 2: [2,2,1,1,1,2,2] → 2 appears 4 times > n/2=3.5
        int[] t2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Test 2 Brute  : " + (new SolMajorityElement().majorityElementBrute(t2)   == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (new SolMajorityElement().majorityElementOptimal(t2) == 2 ? "PASS" : "FAIL"));

        // Test 3: [1] → single element is always majority
        int[] t3 = {1};
        System.out.println("Test 3 Brute  : " + (new SolMajorityElement().majorityElementBrute(t3)   == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (new SolMajorityElement().majorityElementOptimal(t3) == 1 ? "PASS" : "FAIL"));

        // Test 4: [6,6,6,7,7] → 6 appears 3 times > n/2=2.5
        int[] t4 = {6, 6, 6, 7, 7};
        System.out.println("Test 4 Brute  : " + (new SolMajorityElement().majorityElementBrute(t4)   == 6 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (new SolMajorityElement().majorityElementOptimal(t4) == 6 ? "PASS" : "FAIL"));
    }
}