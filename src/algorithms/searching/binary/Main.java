package algorithms.searching.binary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,5,8,9,4,5,6,87,15,36,45,85,96,45,23,21};
        int toFind = 85;
        Arrays.sort(nums);
        if(findNumIndex(nums,toFind) == -1){
            System.out.println("Value not found");
        }else {
            System.out.println("Value found at : "+findNumIndex(nums,toFind));
        }


    }
    public static int findNumIndex(int[] nums, int toFind){
       int max = nums.length-1;
       return binarySearch(nums,0,max,toFind);

    }

    public static int binarySearch(int[] nums, int min, int max,int toFind){
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == toFind)
                return mid;

            if (nums[mid] < toFind)
                low = mid + 1;

            else
                high = mid - 1;
        }
        return -1;
    }
}