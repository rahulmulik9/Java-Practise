package Challenge75.Day2;

public class fibinacci_series {
    public static void main(String[] args) {
        PrintFibonacci printFibonacci = new PrintFibonacci();
        printFibonacci.mainMethod();

        new PrintFibonacci().mainMethod();
    }

}


 class PrintFibonacci {
     public PrintFibonacci() {
     }

     public  void printFibonacciSequence(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");

            a = b;
            b = c;
            c = a + b;
        }
    }

    public  void mainMethod() {
        printFibonacciSequence(10);
    }

}