package Challenge75_DSA.June.Day23;


class SolMoveZeroes {

    public static void moveZeroesBrute(int[] nums) {
        java.util.List<Integer> nonZero = new java.util.ArrayList<>();
        for (int num : nums) if (num != 0) nonZero.add(num);
        int i = 0;
        for (int num : nonZero) nums[i++] = num;
        while (i < nums.length) nums[i++] = 0;
    }

    public static void moveZeroesOptimal(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow]; nums[slow] = nums[fast]; nums[fast] = temp;
                slow++;
            }
        }
    }
}

public class MoveZeroes {
    public static void main(String[] args) {

        // Test 1: Mixed zeroes → [1,3,12,0,0]
        int[] t1a = {0,1,0,3,12}; SolMoveZeroes.moveZeroesBrute(t1a);
        System.out.println("Test 1 Brute  : " + (java.util.Arrays.equals(t1a, new int[]{1,3,12,0,0}) ? "PASS" : "FAIL"));
        int[] t1b = {0,1,0,3,12}; SolMoveZeroes.moveZeroesOptimal(t1b);
        System.out.println("Test 1 Optimal: " + (java.util.Arrays.equals(t1b, new int[]{1,3,12,0,0}) ? "PASS" : "FAIL"));

        // Test 2: Zeroes at front → [1,0,0]
        int[] t2a = {0,0,1}; SolMoveZeroes.moveZeroesBrute(t2a);
        System.out.println("Test 2 Brute  : " + (java.util.Arrays.equals(t2a, new int[]{1,0,0}) ? "PASS" : "FAIL"));
        int[] t2b = {0,0,1}; SolMoveZeroes.moveZeroesOptimal(t2b);
        System.out.println("Test 2 Optimal: " + (java.util.Arrays.equals(t2b, new int[]{1,0,0}) ? "PASS" : "FAIL"));

        // Test 3: No zeroes → unchanged [1,2,3]
        int[] t3a = {1,2,3}; SolMoveZeroes.moveZeroesBrute(t3a);
        System.out.println("Test 3 Brute  : " + (java.util.Arrays.equals(t3a, new int[]{1,2,3}) ? "PASS" : "FAIL"));
        int[] t3b = {1,2,3}; SolMoveZeroes.moveZeroesOptimal(t3b);
        System.out.println("Test 3 Optimal: " + (java.util.Arrays.equals(t3b, new int[]{1,2,3}) ? "PASS" : "FAIL"));

        // Test 4: All zeroes → unchanged [0,0,0]
        int[] t4a = {0,0,0}; SolMoveZeroes.moveZeroesBrute(t4a);
        System.out.println("Test 4 Brute  : " + (java.util.Arrays.equals(t4a, new int[]{0,0,0}) ? "PASS" : "FAIL"));
        int[] t4b = {0,0,0}; SolMoveZeroes.moveZeroesOptimal(t4b);
        System.out.println("Test 4 Optimal: " + (java.util.Arrays.equals(t4b, new int[]{0,0,0}) ? "PASS" : "FAIL"));
    }
}