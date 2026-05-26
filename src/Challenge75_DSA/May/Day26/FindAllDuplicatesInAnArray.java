package Challenge75_DSA.May.Day26;

import java.util.*;

class SolFindAllDuplicatesInAnArray {
    public static List<Integer> findDuplicatesBrute(int[] nums) {
        int[] count = new int[nums.length + 1];
        List<Integer> result = new ArrayList<>();
        for (int num : nums) count[num]++;
        for (int i = 1; i < count.length; i++)
            if (count[i] == 2) result.add(i);
        return result;
    }

    public static List<Integer> findDuplicatesOptimal(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0) result.add(idx + 1);
            else nums[idx] = -nums[idx];
        }
        return result;
    }

    public static boolean sameElements(List<Integer> a, List<Integer> b) {
        List<Integer> sortedA = new ArrayList<>(a);
        List<Integer> sortedB = new ArrayList<>(b);
        Collections.sort(sortedA);
        Collections.sort(sortedB);
        return sortedA.equals(sortedB);
    }
}

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        // Test 1: Standard case — two duplicates
        System.out.println("Test 1 Brute  : " + (SolFindAllDuplicatesInAnArray.sameElements(SolFindAllDuplicatesInAnArray.findDuplicatesBrute(new int[]{4,3,2,7,8,2,3,1}),  Arrays.asList(2,3)) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (SolFindAllDuplicatesInAnArray.sameElements(SolFindAllDuplicatesInAnArray.findDuplicatesOptimal(new int[]{4,3,2,7,8,2,3,1}), Arrays.asList(2,3)) ? "PASS" : "FAIL"));

        // Test 2: No duplicates
        System.out.println("Test 2 Brute  : " + (SolFindAllDuplicatesInAnArray.sameElements(SolFindAllDuplicatesInAnArray.findDuplicatesBrute(new int[]{1,2,3,4}),  Arrays.asList()) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (SolFindAllDuplicatesInAnArray.sameElements(SolFindAllDuplicatesInAnArray.findDuplicatesOptimal(new int[]{1,2,3,4}), Arrays.asList()) ? "PASS" : "FAIL"));

        // Test 3: Single duplicate
        System.out.println("Test 3 Brute  : " + (SolFindAllDuplicatesInAnArray.sameElements(SolFindAllDuplicatesInAnArray.findDuplicatesBrute(new int[]{1,1,2}),  Arrays.asList(1)) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolFindAllDuplicatesInAnArray.sameElements(SolFindAllDuplicatesInAnArray.findDuplicatesOptimal(new int[]{1,1,2}), Arrays.asList(1)) ? "PASS" : "FAIL"));

        // Test 4: All elements are duplicates
        System.out.println("Test 4 Brute  : " + (SolFindAllDuplicatesInAnArray.sameElements(SolFindAllDuplicatesInAnArray.findDuplicatesBrute(new int[]{2,1,2,1}),  Arrays.asList(1,2)) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolFindAllDuplicatesInAnArray.sameElements(SolFindAllDuplicatesInAnArray.findDuplicatesOptimal(new int[]{2,1,2,1}), Arrays.asList(1,2)) ? "PASS" : "FAIL"));
    }
}