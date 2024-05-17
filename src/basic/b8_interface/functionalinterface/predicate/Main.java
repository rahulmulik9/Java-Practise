package basic.b8_interface.functionalinterface.predicate;

/*Predicate are used to prediction
* it return boolean value */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Creating predicate
        Predicate<Integer> predicate = i -> (i < 18);

        System.out.println(predicate.test(10));




        List<String> myList = List.of("Rahul","Ahijit","Sachine","Amit");
       // List<String> mylist2 = Arrays.asList("Rahul","Ahijit","Sachine","Amit");  //another way of creating list

        Predicate<String> predicate1= name ->name.startsWith("A");

        for (String s : myList) {
            if (predicate1.test(s)) {
                System.out.println(s);
            }
        }

        myList.stream().filter(predicate1).forEach(s -> System.out.println(s));

    }
}
