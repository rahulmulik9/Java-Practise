package Challenge75.Day52;


import java.util.Arrays;

class SolutionSortColor {
    public int[] sortColors(int[] nums) {

        int leftBoundary = -1;
        int rightBoundary = nums.length;
        int current = 0;

        while (current < rightBoundary) {
            if (nums[current] == 0) {
                // Move 0 to the left section and advance both pointers
                leftBoundary++;
                swap(nums, leftBoundary, current);
                current++;
            } else if (nums[current] == 2) {
                // Move 2 to the right section, don't advance current
                rightBoundary--;
                swap(nums, rightBoundary, current);
            } else {
                // Element is 1, leave it in the middle section
                current++;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
public class SortColor {
    public static void main(String[] args) {
        int[] colors = {0, 2, 0, 1, 0, 1, 2, 2, 1, 0};

        Arrays.stream(new SolutionSortColor().sortColors(colors)).forEach(System.out::println);
    }
}
