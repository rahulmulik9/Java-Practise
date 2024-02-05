package dataStructre.recursion;

public class App {
    //A method call itself
    // Exit infinite loop
    public static void main(String[] args) {
        System.out.println(getSumNuner(3));
    }

    public static int getSumNuner(int n) {
        if (n == 0) {
            return n;
        } else {
            return n + getSumNuner(n - 1);
        }
    }
}
