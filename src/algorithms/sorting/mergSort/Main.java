package algorithms.sorting.mergSort;

import java.util.Arrays;
import java.util.Random;

/*
 * Merge sort break or split into two half,,goes on up to each array contains two
 * After that sort that two size array ans recursively goes up to main array*/
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(nums));
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void mergeSort(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return;
        }

        int mid = length / 2;

        //creating new array
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        //filling array
        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = nums[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(nums,left,right);
    }

    public static void merge(int[] arry, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arry[k] = left[i];
                i++;
            }else {
                arry[k] = right[j];
                j++;
            }
            k++;
        }

        //if left array is greater than right array
        while(i<leftSize){
            arry[k] = left[i];
            k++;
            i++;
        }

        while(j<rightSize){
            arry[k] = right[j];
            k++;
            j++;
        }


    }
}
