package basic.b2_OPPS_Concepts.lamdaExpression.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    record Person (String firstName, String lastName) {

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Person("Linus", "Van Pelt"),
                new Person("Peppermint", "Patty"),
                new Person("Charlie", "Brown")));


        //anonymous method calling
        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));


        //to do in regular way we have create class Comparator
        //You can also create class and implment comparator ...see another class created at the last
        people.sort(new NameComparator());

        //here I am using anonymous class,
        // Using anonymous class
        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };

        //
        people.sort(comparatorLastName);
        System.out.println(people);



        //another example
//        interface EnhancedComparator<T> extends Comparator<T> {
//            int secondLevel(T o1, T o2);
//        }
//
//        var comparatorMixed = new EnhancedComparator<Person>() {
//
//            @Override
//            public int compare(Person o1, Person o2) {
//                int result = o1.lastName().compareTo(o2.lastName());
//                return (result == 0 ? secondLevel(o1, o2) : result);
//            }
//
//            @Override
//            public int secondLevel(Person o1, Person o2) {
//                return o1.firstName().compareTo(o2.firstName());
//            }
//        };
//
//        people.sort(comparatorMixed);
//        System.out.println(people);

    }
}

class NameComparator implements Comparator<Main.Person>{
    @Override
    public int compare(Main.Person o1, Main.Person o2) {
        return o1.firstName().compareTo(o2.firstName());
    }
}
