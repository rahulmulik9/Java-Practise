package basic.b3_controlFLow;

public class SumOfFirstLastDigit {
    public static void main(String[] args) {
       int a=252;
        System.out.println(sum(a));
    }

    private static int sum(int a) {
    int sum=0;
    if(a<0){
        a=a*(-1);
    }
    int n=a;
    int lastDigit=n%10;
    int firstDigit=0;
    while(a>0){
        firstDigit = a%10;
        a=a/10;
    }
    return lastDigit+firstDigit;
    }
}
