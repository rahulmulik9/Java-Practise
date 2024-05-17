package Udemy.Lecture.lambda.example1;

import java.util.*;

record Person(String firstName, String lastName) {
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1,Person o2) {
        return o1.lastName().compareTo(o2.lastName());
    }
}
public class Main {
    //lambda using functional interface
    // is type of interface which contains only one method

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Abhi", "Mulik"),
                new Person("Animt", "Mane"),
                new Person("Ashsih", "Patil")));


        //using class that impliment Comparator;
        people.sort(new NameComparator());

        //Using anonymous class
        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        people.sort(comparatorLastName);
        System.out.println(people);


        //directly using anonymous class
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        });
        System.out.println(people);


        // using lambda expression
        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));


        //another method which will give idea how compare will work
        Person p1 = new Person("ABC","ZYX");
        Person p2 = new Person("MNP","PQR");
        NameComparator nameComparator = new NameComparator();
        int result = nameComparator.compare(p1,p2);
        System.out.println(result);

    }
}
