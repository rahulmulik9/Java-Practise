package algorithms.sorting.selectionSort;


public class App {
    public static void main(String[] args) {
        int[] arr = {50, 20, 45, 1, 23, 57, 86, 44,63};
        SelectionSort sl = new SelectionSort();
        sl.sort(arr);
        sl.print(arr);

    }
}