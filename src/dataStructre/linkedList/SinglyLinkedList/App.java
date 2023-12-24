package dataStructre.linkedList.SinglyLinkedList;

public class App {
    public static void main(String[] args) {
        Employee e1=new Employee("abc",1);
        Employee e2=new Employee("pqr",2);
        Employee e3=new Employee("xyz",3);

        LinkedList linkedList = new LinkedList();
        linkedList.addToLast(e1);
        linkedList.addToLast(e2);
        linkedList.addToFront(e3);
        linkedList.printAll();
        linkedList.removeEnd();
        linkedList.printAll();
        linkedList.removeFront();
        linkedList.printAll();
    }
}
