package Udemy.Lecture.comparableCompartor.example3;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Student rahul = new Student("Rahul");
        Student[] studentArray = {new Student("Rahul1"), new Student("Abhi"), new Student("Rahul"),};
        Arrays.sort(studentArray);
        System.out.println(Arrays.toString(studentArray));

        //using another class
        StudentGPAComparator gpaSorter = new StudentGPAComparator();
        Arrays.sort(studentArray,gpaSorter);
        System.out.println(Arrays.toString(studentArray));

    }
}

class Student implements Comparable<Student> {
    private static int LAST_ID = 1000;
    private static Random random = new Random();

    String name;
    private int id;
    protected double gpa;

    public Student(String name) {

        this.name = name;
        id = LAST_ID ++;
        gpa= random.nextDouble(1.0,4.0);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
       // return Double.valueOf(gpa).compareTo(Double.valueOf(o.gpa));
    }
}

//by default we implemented class which compare the id .
// Suppose we want to compare the GPA then we need to implementation of method or will create a new class
class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.valueOf(o2.gpa).compareTo(Double.valueOf(o1.gpa));
       // return Double.compare(o2.gpa, o1.gpa);   //you can use this method also
    }
}




