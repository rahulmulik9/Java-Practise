package Udemy.Lecture.comparableCompartor.example4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Abhi", "Mulik"),
                new Person("Prakash", "Mane"),
                new Person("Animt", "Mane"),
                new Person("Ashsih", "Patil")));




        interface EnhancedComparator<T>extends Comparator<T>{
            int secondLevel(T o1, T o2);
        }

        //in this first sorting is done by using last name then another sorting is done by using first name on first sorted list
        var comapratorMixed  = new EnhancedComparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result ==0?secondLevel(o1,o2):result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName);
            }
        };

        people.sort(comapratorMixed);
        System.out.println(people);

    }
}
