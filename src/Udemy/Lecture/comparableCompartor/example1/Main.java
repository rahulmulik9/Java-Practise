package Udemy.Lecture.comparableCompartor.example1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -15, 4, 8, 3, 6};

        for (Integer a : others) {
            int val = five.compareTo(a);
            System.out.printf("%d %s %d : comapareTo= %d %n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), a, val);
        }


        String apple = "apple";
        String[] fruits = {"banana", "guava", "apple1", "apple"};

        for (String s : fruits) {
            int val = apple.compareTo(s);
            System.out.printf("%s %s %s : comapareTo= %s %n", apple, (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }

        System.out.println("A = " + (int) 'A');
        System.out.println("a = " + (int) 'a');
        System.out.println("Z = " + (int) 'Z');
        System.out.println("z = " + (int) 'z');

        System.out.println((char) 90);
        System.out.println((char) 91);
        System.out.println((char) 92);
        System.out.println((char) 93);
        System.out.println((char) 94);
        System.out.println((char) 95);
        System.out.println((char) 96);
        System.out.println((char) 97);

        SimpleExample myxa= new SimpleExample();
        myxa.differenacBetweenComparaeVsComparator();
    }
}


//differance between comparable vs comparator

class SimpleExample {

    public void differenacBetweenComparaeVsComparator() {

        Student first = new Student(1);
        Student second = new Student(2);
        Student third = new Student(3);

        int val = first.compareTo(second);
        System.out.println(val);

        StudentComparator compa = new StudentComparator();
        int val2 = compa.compare(first, second);
        System.out.println(val2);
    }

}

class Student implements Comparable<Student> {
    int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(o.id).compareTo(this.id);
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.id, o2.id);
    }
}

