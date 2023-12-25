package algorithms.sorting.insertionSort;

public class InsertionSort {

public void doInsertionSort(int[] array){
    int n = array.length;

    for (int i = 1; i < n; ++i) {
        int key = array[i];
        int j = i - 1;

        // Move elements that are greater than key to one position ahead of their current position
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j = j - 1;
        }

        // Place the key in its correct position
        array[j + 1] = key;
    }
}




    public void print(int[] arr) {
        for (int a: arr) {
            System.out.println(a);
        }
    }
}
