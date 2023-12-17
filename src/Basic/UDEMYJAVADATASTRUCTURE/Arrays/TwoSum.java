package Basic.UDEMYJAVADATASTRUCTURE.Arrays;

import java.util.Scanner;

public class TwoSum {
    public static Scanner sc = new Scanner(System.in);

    public static void findPair(int[] numbers, int sum) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if ((numbers[i] + numbers[j]) == sum) {
                    System.out.println("Pair is { " + numbers[i] + ", " + numbers[j] + " }");
                    ;
                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("No of elemetns in array");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            int num = sc.nextInt();
            numbers[i] = num;
        }


        System.out.println("Enter the sum you want to find out");
        int sum = sc.nextInt();


        findPair(numbers, sum);
    }
}
