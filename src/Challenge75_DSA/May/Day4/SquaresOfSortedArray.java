package Challenge75_DSA.May.Day4;

class SolSquaresOfSortedArray {
    public static int[] sortedSquaresBrute(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            result[i] = nums[i] * nums[i];
        java.util.Arrays.sort(result);
        return result;
    }

    public static int[] sortedSquaresOptimal(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, pos = n - 1;
        while (left <= right) {
            int lSq = nums[left] * nums[left];
            int rSq = nums[right] * nums[right];
            if (lSq >= rSq) { result[pos--] = lSq; left++; }
            else             { result[pos--] = rSq; right--; }
        }
        return result;
    }
}

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        // Test 1: Mix of negatives and positives
        System.out.println("Test 1 Brute  : " + (java.util.Arrays.equals(new SolSquaresOfSortedArray().sortedSquaresBrute(new int[]{-4,-1,0,3,10}),  new int[]{0,1,9,16,100}) ? "PASS" : "FAIL"));
        System.out.println("Test 1 Optimal: " + (java.util.Arrays.equals(new SolSquaresOfSortedArray().sortedSquaresOptimal(new int[]{-4,-1,0,3,10}), new int[]{0,1,9,16,100}) ? "PASS" : "FAIL"));

        // Test 2: All negatives
        System.out.println("Test 2 Brute  : " + (java.util.Arrays.equals(new SolSquaresOfSortedArray().sortedSquaresBrute(new int[]{-7,-3,-1}),  new int[]{1,9,49}) ? "PASS" : "FAIL"));
        System.out.println("Test 2 Optimal: " + (java.util.Arrays.equals(new SolSquaresOfSortedArray().sortedSquaresOptimal(new int[]{-7,-3,-1}), new int[]{1,9,49}) ? "PASS" : "FAIL"));

        // Test 3: All positives (already sorted after squaring)
        System.out.println("Test 3 Brute  : " + (java.util.Arrays.equals(new SolSquaresOfSortedArray().sortedSquaresBrute(new int[]{1,2,3,4}),  new int[]{1,4,9,16}) ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (java.util.Arrays.equals(new SolSquaresOfSortedArray().sortedSquaresOptimal(new int[]{1,2,3,4}), new int[]{1,4,9,16}) ? "PASS" : "FAIL"));

        // Test 4: Single element
        System.out.println("Test 4 Brute  : " + (java.util.Arrays.equals(new SolSquaresOfSortedArray().sortedSquaresBrute(new int[]{-5}),  new int[]{25}) ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (java.util.Arrays.equals(new SolSquaresOfSortedArray().sortedSquaresOptimal(new int[]{-5}), new int[]{25}) ? "PASS" : "FAIL"));
    }
}