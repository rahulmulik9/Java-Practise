package basic.b6_exceptionHandling;

public class PrintExceptionMessage {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.m1();
    }
}

class Test1 {
    void m1() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
    }
}
