package basic.b8_interface.functionalinterface.function.function;

import java.util.function.Function;

/*It takes a single parameter and returns result by calling the apply() method*/
public class Main {
    public static void main(String[] args) {

        //Function<Integer, Integer>  first Integer and second integer denote parameter and return type

        Function<Integer, Integer> printNumber = a -> a*10;
        System.out.println("The number is: "+ printNumber.apply(10));
    }
}
