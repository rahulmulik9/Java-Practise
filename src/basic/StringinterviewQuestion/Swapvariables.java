package basic.StringinterviewQuestion;

public class Swapvariables {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("before swap "+a+" "+b);
        swapWithThird(a,b);
        swapWithoutThird(a,b);



    }
    //swap using 3rd
    public static void swapWithThird(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap " + a + " " + b);
    }


    //without using third variables
    public static void swapWithoutThird(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap " + a + " " + b);
    }

}
