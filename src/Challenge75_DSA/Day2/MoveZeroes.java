package Challenge75_DSA.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolMoveZeroes {

    public static void moveZeroesBrute(int[] nums) {
        List<Integer> nonZeros = new ArrayList<>();
        for (int num : nums) if (num != 0) nonZeros.add(num);
        for (int i = 0; i < nonZeros.size(); i++) nums[i] = nonZeros.get(i);
        for (int i = nonZeros.size(); i < nums.length; i++) nums[i] = 0;
    }

    public static void moveZeroesOptimal(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
}

public class MoveZeroes {
    public static void main(String[] args) {

        // Test 1: [0,1,0,3,12] → [1,3,12,0,0]
        int[] t1b = {0,1,0,3,12}; new SolMoveZeroes().moveZeroesBrute(t1b);
        int[] t1o = {0,1,0,3,12}; new SolMoveZeroes().moveZeroesOptimal(t1o);
        System.out.println("Test 1 Brute  : " + (Arrays.equals(t1b, new int[]{1,3,12,0,0}) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (Arrays.equals(t1o, new int[]{1,3,12,0,0}) ? "PASS" : "FAIL"));

        // Test 2: [0] → [0]  single zero stays
        int[] t2b = {0}; new SolMoveZeroes().moveZeroesBrute(t2b);
        int[] t2o = {0}; new SolMoveZeroes().moveZeroesOptimal(t2o);
        System.out.println("Test 2 Brute  : " + (Arrays.equals(t2b, new int[]{0}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (Arrays.equals(t2o, new int[]{0}) ? "PASS" : "FAIL"));

        // Test 3: [1,2,3] → [1,2,3]  no zeros → unchanged
        int[] t3b = {1,2,3}; new SolMoveZeroes().moveZeroesBrute(t3b);
        int[] t3o = {1,2,3}; new SolMoveZeroes().moveZeroesOptimal(t3o);
        System.out.println("Test 3 Brute  : " + (Arrays.equals(t3b, new int[]{1,2,3}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (Arrays.equals(t3o, new int[]{1,2,3}) ? "PASS" : "FAIL"));

        // Test 4: [0,0,1] → [1,0,0]  multiple zeros at front
        int[] t4b = {0,0,1}; new SolMoveZeroes().moveZeroesBrute(t4b);
        int[] t4o = {0,0,1}; new SolMoveZeroes().moveZeroesOptimal(t4o);
        System.out.println("Test 4 Brute  : " + (Arrays.equals(t4b, new int[]{1,0,0}) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (Arrays.equals(t4o, new int[]{1,0,0}) ? "PASS" : "FAIL"));
    }
}