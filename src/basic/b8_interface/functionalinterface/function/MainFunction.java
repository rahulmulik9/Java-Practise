package basic.b8_interface.functionalinterface.function;

import java.util.function.Function;

interface OwnFunction<T,R>{
    public R apply(T t) ;
}

public class MainFunction {
    public static void main(String[] args) {
        //using own class
        OwnFunction<Integer,Integer> function1 = new OwnFunction<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };
        int sqr = function1.apply(7);
        int sqr1 = new Function<Integer,Integer>(){
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        }.apply(8);

        System.out.println(sqr);
        System.out.println(sqr1);

        //using in built function


        Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };

        int square = function.apply(5);


        int sqaure1 = new Function<Integer,Integer>(){
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        }.apply(8);

        System.out.println(square);
        System.out.println(sqaure1);

    }
}
