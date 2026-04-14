package Challenge75_new.Day13;
class SolFindPivotIndex {

    public static int pivotIndexBrute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++)        leftSum  += nums[j];
            for (int j = i + 1; j < nums.length; j++) rightSum += nums[j];
            if (leftSum == rightSum) return i;
        }
        return -1;
    }
}
public class FindPivotIndex {
}
