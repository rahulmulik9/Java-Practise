package Udemy.Lecture.lambda.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    //lambda using functional interface
    // is type of interface which contains only one method
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
                new Main.Person("Abhi", "Mulik"),
                new Person("Animt", "Mane"),
                new Person("Ashsih", "Patil")));


        //Using anonymous class
        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName());
            }
        };

        people.sort(comparatorLastName);
        System.out.println(people);


        //directly using anonymous class
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName());
            }
        });
        System.out.println(people);


        // using lambda expression
        people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName()));

    }
}
