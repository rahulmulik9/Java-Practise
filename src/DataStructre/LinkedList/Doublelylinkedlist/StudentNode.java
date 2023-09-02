package DataStructre.LinkedList.Doublelylinkedlist;

public class StudentNode {
    private StudentNode next;
    private StudentNode privious;
    private Student student;

    public StudentNode(Student student) {
        this.student = student;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    public StudentNode getPrivious() {
        return privious;
    }

    public void setPrivious(StudentNode privious) {
        this.privious = privious;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String toString(){
        return  student.toString();
    }
}
