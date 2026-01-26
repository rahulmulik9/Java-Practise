package Challenge75.Day18;

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.*/

public class SingleNumber {
    public static void main(String[] args) {
        int[]  numsOrder = {4,1,2,1,2};
        System.out.println(new SolutionSingleNumber().singleNumber(numsOrder));
    }
}

class SolutionSingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (final int num : nums)
            ans ^= num;

        return ans;
    }
}


