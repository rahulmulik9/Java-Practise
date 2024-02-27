package basic.b2_OPPS_Concepts.comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //simple example
        Integer five = 5;
        Integer[] intary = {1,6,3,9,5};
        for (Integer a:intary) {
            int val = five.compareTo(a);
            System.out.println(val);
        }


        //
        Student rah = new Student("Rahul");
        Student[] rstdnts = {new Student("Ram"),new Student("Sam"),new Student("Rama"),new Student("a")};
        Arrays.sort(rstdnts);
        System.out.println(Arrays.toString(rstdnts));
    }
}
