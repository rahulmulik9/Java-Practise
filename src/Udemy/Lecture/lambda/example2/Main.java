package Udemy.Lecture.lambda.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(List.of("ABC","XYZ","PQR"));
        for(String s: list) System.out.println(s+", ");

        //using customer interface
        list.forEach((s -> System.out.println(s+", ")));

        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            myString =myString+first;
            System.out.println(myString);
        });




    }
}
