package basic.b8_interface.functionalinterface.function.bifunction;

import java.util.function.BiFunction;


/* public interface BiFunction<T, U, R> {
      R apply(T t, U u);
}
 T – Type of the first argument to the function.
U – Type of the second argument to the function.
R – Type of the result of the function.*/
public class Main {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a+b;
       // BiFunction<Integer, Integer, Integer> add1 = Integer::sum;   //we can also use this
        System.out.println("The addition of two numbers are: "+ add.apply(3,2));
    }
}
