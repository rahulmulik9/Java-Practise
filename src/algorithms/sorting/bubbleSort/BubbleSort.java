package algorithms.sorting.bubbleSort;

public class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void print(int[] arr) {
        for (int a:arr) {
            System.out.println(a);
        }
    }


}
