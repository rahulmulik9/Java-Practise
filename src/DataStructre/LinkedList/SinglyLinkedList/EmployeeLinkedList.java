package DataStructre.LinkedList.SinglyLinkedList;

public class EmployeeLinkedList {
    private EmployeeNode head;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
    }

    public String deletFront() {
        if (!isEmpty()) {
            return null;
        }
        EmployeeNode removedNode =head ;
        head = head.getNext();
        removedNode.setNext(null);
        return removedNode.toString();
    }
    public boolean isEmpty(){
        if (head ==null) {
            return false;
        }else {

            return true;
        }

    }

    public void printList() {
        EmployeeNode current = head;
        System.out.println("Head->");
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }

    }
}
