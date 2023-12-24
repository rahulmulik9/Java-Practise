package algorithms.sorting.bubbleSort;

public class App {
    public static void main(String[] args) {
        int[] arr = {50, 20, 45, 1, 23, 57, 86, 44};
        BubbleSort br = new BubbleSort();
        br.sort(arr);
        br.print(arr);

    }
}
