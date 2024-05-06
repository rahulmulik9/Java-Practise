package Udemy.Lecture.lambda.example3;

public class Main {

    public static void main(String[] args) {
        int addition = calculate((a,b)->a+b,5,4);
        int multiplication = calculate((a,b)->a*b,5,4);
    }

    private static <T> T calculate(Operation<T> function , T value1,T value2) {
        T result =function.operate(value1,value2);
        System.out.println(result);
        return result;
    }


}

