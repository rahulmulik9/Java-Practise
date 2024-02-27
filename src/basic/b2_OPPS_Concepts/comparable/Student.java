package basic.b2_OPPS_Concepts.comparable;

public class Student implements Comparable {
    public String name;
    public int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    /*This is default method which will sort as decent*/
    //    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

    //custom made comparison
    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        return name.compareTo(other.name);
    }
}
