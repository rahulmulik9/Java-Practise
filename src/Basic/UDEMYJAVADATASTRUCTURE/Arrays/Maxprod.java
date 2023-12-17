package Basic.UDEMYJAVADATASTRUCTURE.Arrays;

import java.util.Scanner;

public class Maxprod {
    public static Scanner sc = new Scanner(System.in);

    public static void findPair(int[] numbers) {
        int prod = 0;
        int a=0;
        int b=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] * numbers[j]) > prod) {
                    prod = (numbers[i] * numbers[j]);
                     a=numbers[i];
                     b=numbers[j];
                }
            }
        }
        System.out.println("Numbers are "+a+", "+b);
        System.out.println("Product is " + prod);


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


        int sum = 0;


        findPair(numbers);
    }
}

