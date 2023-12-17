package dataStructre.linkedList.Doublelylinkedlist;

public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student(1, "abc");
        Student st2 = new Student(2, "xyz");
        Student st3 = new Student(3, "pqr");
        Student st4 = new Student(4, "mno");

        StudentDoublyLinkedList list = new StudentDoublyLinkedList();
        list.addAtFront(st1);
        list.addAtFront(st2);
        list.getprint();

        list.addAtLast(st3);
        list.addAtLast(st4);
        list.getprint();

        list.removeFromFirst();
        list.getprint();

        list.removeFromLast();
        list.getprint();


    }
}
