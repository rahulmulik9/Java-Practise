package basic.Practice.ComparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class implements Comparable
class Employee implements Comparable<Employee> {
    private String name;
    private int id;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(o.id, this.id);
    }
}

//class for Comparator
class Student {
    private String name;
    private int id;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}


class NameComparison implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("ABC", 3),
                new Employee("ABCDE", 5),
                new Employee("AB", 2),
                new Employee("ABCD", 4),
                new Employee("A", 1));

        List<Student> students = Arrays.asList(new Student("ABC", 3),
                new Student("ABCDE", 5),
                new Student("AB", 2),
                new Student("ABCD", 4),
                new Student("A", 1));

        //example of comparable
        Collections.sort(employees);
        employees.forEach(System.out::println);

        //example of comparator
        students.sort(new NameComparison());
        students.forEach(System.out::println);

        //using lambda function
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getId(),o2.getId());
            }
        });
        students.forEach(System.out::println);
    }
}
