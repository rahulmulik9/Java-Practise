package dataStructre.linkedList.SinglyLinkedList;

public class LinkedList {
    private Node head;

    public void addToLast(Employee emp) {
        //create a node
        Node node = new Node(emp);
        //check front is null
        if (head == null) {
            head = node;
        }else {
            //traver upto last point
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }


    public void addToFront(Employee emp) {
        //so first create node
        //then first node of existing linkedlist will become second after adding this
        //so this node next will be first node of linked list i.e head
        //change the head to this node so this will become firt node
        Node node = new Node(emp);
        node.setNext(head);
        head = node;
    }

    public void removeFront(){
        //to remove we want to shift head to second node and then dereference the first node
        Node temp=head;
        head=head.getNext();
        temp.setNext(null);
    }

    public void removeEnd(){
        //to remove end. first travers to end then dereference last node with second last
        Node temp=head;
        while(temp.getNext().getNext() != null){
            temp=temp.getNext();
        }
        //as we find second last node whoes next().next() is hull then set that next to null so last node will be dereference
        temp.setNext(null);
    }

    public void printAll(){
        Node temp=head;
        while(temp.getNext() != null){
            System.out.println(temp.getEmp().getId()+" "+temp.getEmp().getName());
            temp = temp.getNext();
        }
        System.out.println(temp.getEmp().getId()+" "+temp.getEmp().getName());



    }
}
