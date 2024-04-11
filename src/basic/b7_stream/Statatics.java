package basic.b7_stream;

import java.util.stream.IntStream;

public class Statatics {
    public static void main(String[] args) {
        var result= IntStream
                .iterate(0,i->i<1000,i->i+10)
                .summaryStatistics();
        System.out.println(result);


        var leapYear  = IntStream
                .iterate(1900,i->i<2100,i->i+1)
                .filter(i->i%4==0)
                .peek(System.out::println)
                .summaryStatistics();



    }
}
