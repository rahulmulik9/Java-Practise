package Challenge75.Day9;

public class Search_Insert_Position {
}

class SolutionSearch {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>=target) {
                return i;
            }
        }
        return nums.length;
    }
}
