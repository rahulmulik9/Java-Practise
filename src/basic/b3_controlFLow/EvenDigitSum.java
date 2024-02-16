package basic.b3_controlFLow;

/*
Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.



EXAMPLE INPUT/OUTPUT:

getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20

getEvenDigitSum(252); → should return 4 since 2 + 2 = 4

getEvenDigitSum(-22); → should return -1 since the number is negative*/
public class EvenDigitSum {
    public static void main(String[] args) {
        int a = 5645;
        System.out.println(getEvenDigitSum(a));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int numberCopy = number, remainder = 0, sum = 0;
            while (numberCopy > 0) {
                remainder = numberCopy % 10;
                if (remainder % 2 == 0) {
                    sum = sum + remainder;
                }
                numberCopy /= 10;
            }
            return sum;
        }
    }
}
