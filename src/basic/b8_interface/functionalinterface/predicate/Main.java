package basic.b8_interface.functionalinterface.predicate;

/*Predicate are used to prediction */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> myList = List.of("Rahul","Ahijit","Sachine","Amit");
       // List<String> mylist2 = Arrays.asList("Rahul","Ahijit","Sachine","Amit");  //another way of creating list

        Predicate<String> predicate = name ->name.startsWith("A");

        for (String s : myList) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }

        myList.stream().filter(predicate).forEach(s -> System.out.println(s));

    }
}
