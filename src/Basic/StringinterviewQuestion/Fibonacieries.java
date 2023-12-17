package Basic.StringinterviewQuestion;

public class Fibonacieries {
    public static void main(String[] args) {
        int num = 10;
        withoutRecusrsion(num);
        System.out.print(withRecurssion(num));

    }

    //without recusrsion
    public static void withoutRecusrsion(int num) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(a + ", ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    //with recursion
    public static int withRecurssion(int num) {
        if (num <= 1) {
            return num;
        } else {
            return withRecurssion(num - 1) + withRecurssion(num - 2);
        }
    }
}
