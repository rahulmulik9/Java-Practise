package basic.StringinterviewQuestion;

import java.util.Scanner;

public class PrimeNumber {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a number");
        int a = sc.nextInt();


        if (a == 0 || a == 1) System.out.println("Not a prime");
        if (a == 2) System.out.println("Not a prime");
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.println("Not prime");
                break;
            } else {
                System.out.println("Prime");
                break;
            }
        }
    }
}
