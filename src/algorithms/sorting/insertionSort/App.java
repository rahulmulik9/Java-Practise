package algorithms.sorting.insertionSort;


public class App {
    public static void main(String[] args) {

        int[] arr = {50, 20, 45, 1, 23, 57, 86, 44,63};
        InsertionSort isr = new InsertionSort();
        isr.doInsertionSort(arr);
        isr.print(arr);
    }

}
