package Challenge75_new.Day21;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolFindAllDuplicatesInAnArray {

    public static List<Integer> findDuplicatesBrute(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] freq = new int[nums.length + 1];
        for (int num : nums) freq[num]++;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) result.add(i);
        }
        return result;
    }

    public static List<Integer> findDuplicatesOptimal(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0) result.add(Math.abs(nums[i]));
            else nums[idx] = -nums[idx];
        }
        return result;
    }
}

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {

        // Test 1: [4,3,2,7,8,2,3,1] → 2 and 3 appear twice
        int[] t1a = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] t1b = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> r1b = new SolFindAllDuplicatesInAnArray().findDuplicatesBrute(t1a);
        List<Integer> r1o = new SolFindAllDuplicatesInAnArray().findDuplicatesOptimal(t1b);
        System.out.println("Test 1 Brute  : " + (r1b.containsAll(Arrays.asList(2, 3)) && r1b.size() == 2 ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (r1o.containsAll(Arrays.asList(2, 3)) && r1o.size() == 2 ? "PASS" : "FAIL"));

        // Test 2: [1,1,2] → only 1 appears twice
        int[] t2a = {1, 1, 2};
        int[] t2b = {1, 1, 2};
        List<Integer> r2b = new SolFindAllDuplicatesInAnArray().findDuplicatesBrute(t2a);
        List<Integer> r2o = new SolFindAllDuplicatesInAnArray().findDuplicatesOptimal(t2b);
        System.out.println("Test 2 Brute  : " + (r2b.containsAll(Arrays.asList(1)) && r2b.size() == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (r2o.containsAll(Arrays.asList(1)) && r2o.size() == 1 ? "PASS" : "FAIL"));

        // Test 3: [1,2,3] → no duplicates → empty list
        int[] t3a = {1, 2, 3};
        int[] t3b = {1, 2, 3};
        List<Integer> r3b = new SolFindAllDuplicatesInAnArray().findDuplicatesBrute(t3a);
        List<Integer> r3o = new SolFindAllDuplicatesInAnArray().findDuplicatesOptimal(t3b);
        System.out.println("Test 3 Brute  : " + (r3b.isEmpty() ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (r3o.isEmpty() ? "PASS" : "FAIL"));

        // Test 4: [2,2] → only element duplicated → [2]
        int[] t4a = {2, 2};
        int[] t4b = {2, 2};
        List<Integer> r4b = new SolFindAllDuplicatesInAnArray().findDuplicatesBrute(t4a);
        List<Integer> r4o = new SolFindAllDuplicatesInAnArray().findDuplicatesOptimal(t4b);
        System.out.println("Test 4 Brute  : " + (r4b.containsAll(Arrays.asList(2)) && r4b.size() == 1 ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (r4o.containsAll(Arrays.asList(2)) && r4o.size() == 1 ? "PASS" : "FAIL"));
    }
}