package Challenge75.Day21;
/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n*/
public class MergeSortedArray {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int m = 3,n=3;
       int[] nums2 = {2,5,6};
    }
}
class SolutionArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] finalAry = new int[m + n];
        int i = 0, j = 0, f = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                finalAry[f++] = nums1[i++];
            } else {
                finalAry[f++] = nums2[j++];
            }
        }

        while (i < m) {
            finalAry[f++] = nums1[i++];
        }
        while (j < n) {
            finalAry[f++] = nums2[j++];
        }
        // Copy finalAry back into nums1
        for (int k = 0; k < m + n; k++) {
            nums1[k] = finalAry[k];
        }
    }
}

