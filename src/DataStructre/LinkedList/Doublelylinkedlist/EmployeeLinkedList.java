package DataStructre.LinkedList.Doublelylinkedlist;

import DataStructre.LinkedList.Doublelylinkedlist.Employee;
import DataStructre.LinkedList.Doublelylinkedlist.EmployeeNode;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if (head == null) {
            tail = node;

        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }


    public String deletFront() {
        if (!isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        return removedNode.toString();
    }

    public boolean isEmpty() {
        if (head == null) {
            return false;
        } else {

            return true;
        }

    }

    public int getSize() {
        return size;
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
