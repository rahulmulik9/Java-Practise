package basic.b7_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BingoBallChallenge {
    //this is stream simple example
    public static void main(String[] args) {
        int seed = 1;
        var streamG = Stream.of("G1","G2","G3","G4","G5","G6","G7","G8","G9","G10","G11","G12","G13","G14","G15");
        streamG.forEach(System.out::println);

        seed+=15;
        //simple type implementation
        var streamB = Stream.iterate(seed, i -> i <= 30, i -> i + 1)
                .map(i -> "B" + i);
        streamB.forEach(System.out::println);

        //2 second type
        seed += 15;
        var streamC = Stream.iterate(seed, i -> i + 1)
                .limit(15)
                .map(i -> "C" + i);
        streamC.forEach(System.out::println);

        //
        seed+=15;
        int nSeed=seed;
        String[] labels = new String[15];
        Arrays.setAll(labels,i->"N"+(nSeed+i));
        var streamN = Arrays.stream(labels);
        streamN.forEach(System.out::println);

        seed+=15;
        int rSeed = seed;


        IntStream.iterate((int)'A',i->i<=(int)'Z',i->i+1)
                .filter(Character::isAlphabetic)
                .distinct()
                  //.takeWhile(i->i<'E')
                 //.filter(i->Character.toUpperCase(i)>'E')  //for skipp first five
                // .skip(5)         //skip five
                .forEach(i-> System.out.printf("%C ",i));

    }


}
