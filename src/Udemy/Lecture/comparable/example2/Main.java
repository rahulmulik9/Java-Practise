package Udemy.Lecture.comparable.example2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student rahul = new Student("Rahul");
        Student[] studentArray = {new Student("Rahul1"), new Student("Abhi"), new Student("Rahul"),};
        Arrays.sort(studentArray);
        System.out.println(Arrays.toString(studentArray));
        //this method will not work in first student class as it dont cast into student internally becasue we used only comparable not comparable<Student>
        System.out.println("Result : " + rahul.compareTo(new Student("Abhi")));
        System.out.println("Result : " + rahul.compareTo(new Student("RAHUL")));

    }
}
/*
class Student implements Comparable{
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    //this method will give natural way or sorting
//    @Override    //op : [Student{name='Rahul1'}, Student{name='Abhi'}, Student{name='Rahul'}]
//    public int compareTo(Object o) {
//        return 0;
//    }

    @Override     //op : [Student{name='Abhi'}, Student{name='Rahul'}, Student{name='Rahul1'}]
    public int compareTo(Object o) {
        Student other = (Student) o;
        return name.compareTo(other.name);
    }
}

*/


class Student implements Comparable<Student> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    //in above method we implement comparable so we have to cast into student (incoming varible)
    //in this we directly cast it in implement comparable<Student>

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}

