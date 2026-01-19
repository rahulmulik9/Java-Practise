package Challenge75.Day14;

import java.util.Arrays;

public class Shuffle_array {
    public static void main(String[] args) {
       int[] nums = {2,5,1,3,4,7};
       int n = 3;
        Arrays.stream(new SolutionShufle().shuffle(nums, n)).forEach(System.out::println);
    }
}
class SolutionShufle {
    public int[] shuffle(int[] nums, int n) {
        // Create result array with size 2n (using bit shift for multiplication by 2)
        int[] result = new int[n << 1];

        // Iterate through first half of the array
        for (int i = 0, resultIndex = 0; i < n; i++) {
            // Add element from first half (index i)
            result[resultIndex++] = nums[i];

            // Add corresponding element from second half (index i + n)
            result[resultIndex++] = nums[i + n];
        }

        return result;
    }
}
