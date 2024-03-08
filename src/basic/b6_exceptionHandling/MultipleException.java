package basic.b6_exceptionHandling;

import java.util.Scanner;

public class MultipleException {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("provide the division value");
        int n = s.nextInt();
        try {
            System.out.println(10 / n);
            String str = null;
            System.out.println(str.length());
        }
//catch block order is child to parent
        catch (ArithmeticException ae) {
            System.out.println("Exception" + ae);
        } catch (Exception ne) {
            System.out.println("Exception" + ne);
        }
        System.out.println("rest of the code");
    }
}
