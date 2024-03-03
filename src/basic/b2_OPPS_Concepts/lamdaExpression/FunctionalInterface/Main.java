package basic.b2_OPPS_Concepts.lamdaExpression.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        int result = calculator((a,b)->a+b,5,6);
        int resultMulitply = calculator((a,b)->a*b,5,6);
        System.out.println(result);
        System.out.println(resultMulitply);

    }
    public static <T> T calculator(Operations<T> function, T value1, T value2){

        return function.operate(value1,value2);
    }
}
