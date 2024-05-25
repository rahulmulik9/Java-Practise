package DataStructre.linkedList.SinglyLinkedList;
public class Node {
    private Employee emp;
    private Node next;

    public Node(Employee emp) {
        this.emp = emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Employee getEmp() {
        return emp;
    }

    public Node getNext() {
        return next;
    }
}
