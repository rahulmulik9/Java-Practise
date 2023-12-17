package dataStructre.linkedList.Doublelylinkedlist;

public class StudentDoublyLinkedList {
    private StudentNode head;
    private StudentNode tail;

    public void addAtFront(Student student) {
        //create node
        StudentNode node = new StudentNode(student);
        //check list is empty or not
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrivious(node);
            head = node;
        }
    }

    public void addAtLast(Student student) {
        //check list is emty or not
        StudentNode node = new StudentNode(student);
        StudentNode current;

        if (head == null) {
            System.out.println("List is empty");
        } else {
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
            node.setPrivious(current);
            tail = node;
        }
    }

    public void removeFromFirst() {
        StudentNode current;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.getNext();
            head.getPrivious().setNext(null);
            head.setPrivious(null);
        }
    }

    public void removeFromLast() {
        StudentNode current;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            tail = current.getPrivious();
            current.getPrivious().setNext(null);
            current.setPrivious(null);


        }
    }

    public void getprint() {
        StudentNode current;
        current = head;

        while (current.getNext() != null) {
            System.out.println(current.toString());
            current = current.getNext();
        }
        System.out.println(current.toString());


    }


}
