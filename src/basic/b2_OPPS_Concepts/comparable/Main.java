package basic.b2_OPPS_Concepts.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //simple example
        Integer five = 5;
        Integer[] intary = {1,6,3,9,5};
        for (Integer a:intary) {
            int val = five.compareTo(a);
            System.out.println(val);
        }


        //Comparable
        Student rah = new Student("Rahul",5);
        Student[] rstdnts = {new Student("Ram",10),new Student("Sam",48),new Student("Rama",14),new Student("a",98)};
        Arrays.sort(rstdnts);
        System.out.println(Arrays.toString(rstdnts));


        //Comparator<Studentm>
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student("Vijay",23));
        al.add(new Student("Ajay",27));
        al.add(new Student("Jai",21));

        System.out.println("Sorting by Name");

        Collections.sort(al,new NameComparator());
        for(Student st: al){
            System.out.println(" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by age");

        Collections.sort(al,new AgeComparator());
        for(Student st: al){
            System.out.println(" "+st.name+" "+st.age);
        }
    }
}
