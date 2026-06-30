package Challenge75_DSA.June.Day30;

public class SortArray {
    /**
     * Removes duplicates from a sorted array in-place and returns the new length.
     * The array is modified to contain unique elements at the beginning.
     *
     * @param nums The sorted integer array from which to remove duplicates
     * @return The number of unique elements in the array
     */
    public int removeDuplicates(int[] nums) {
        // Initialize pointer for the position of unique elements
        int uniqueIndex = 0;

        // Iterate through each element in the array
        for (int currentElement : nums) {
            // Check if this is the first element or if it's different from the previous unique element
            if (uniqueIndex == 0 || currentElement != nums[uniqueIndex - 1]) {
                // Place the unique element at the current unique position
                nums[uniqueIndex] = currentElement;
                // Move the unique index pointer forward
                uniqueIndex++;
            }
        }

        // Return the count of unique elements
        return uniqueIndex;
    }
}