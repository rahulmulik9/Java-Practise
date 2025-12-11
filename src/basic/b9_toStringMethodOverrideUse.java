package basic;

import java.util.ArrayList;
import java.util.List;

public class b9_toStringMethodOverrideUse {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            studentList.add(new Student(i, "abc_" + i));
        }

        //comment out the toString method in student class to see the result
        for (Student st : studentList) {
            System.out.println(st);
        }

        //when toString method commented
        //sout will print student oject e.g. basic.Student@214c356h
        //when toString method is there e.g Student{id=0, name='abc_0'} (what ever implemented in toString)
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}