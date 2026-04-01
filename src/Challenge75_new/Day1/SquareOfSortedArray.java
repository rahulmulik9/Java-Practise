package Challenge75_new.Day1;

import java.util.Arrays;

class SolSquareOfSortedArray{

    public int[] sortedArray(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n-1;
        int pos = n-1;

        while(left<=right){
            int leftSqaure = nums[left]*nums[left];
            int rightSqaure = nums[right]*nums[right];

            if(leftSqaure>rightSqaure){
                result[pos] = leftSqaure;
                left++;
            }else{
                result[pos] = rightSqaure;
                right--;
            }
            pos--;
        }

        return result;
    }
}

public class SquareOfSortedArray {
    public static void main(String[] args) {
        Arrays.stream(new SolSquareOfSortedArray().sortedArray(new int[]{-7,-3,-1,0,2,5,6,8})).forEach(System.out::println);
    }
}
