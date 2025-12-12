package basic.b7_stream.how_to_use_function_in_StreamMap;

import java.util.ArrayList;
import java.util.List;

public class FunctionInMap {
    public static void main(String[] args) {
        List<Student> lists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lists.add(new Student(i,"name_"+i));
        }

        List<Student> newList  = lists.stream().map(FunctionInMap::increaseId).toList();

//        here map(FunctionInMap::increaseId) this is method that has passed to map
//        Definaation is <R> Stream<R> map(Function<? super T, ? extends R> mapper); => functional interface:
//        this take function which take parameter and return parameter.

        for (Student st:newList){
            System.out.println(st);
        }
    }

    public static Student increaseId(Student student){
        return new Student(student.getId()+10, student.getName());
    }
}


class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
