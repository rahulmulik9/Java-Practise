package Basic.DataStructure.lnklst;

import java.util.HashMap;
import java.util.Map;

public class LnkstNode {

    Node head;


    //creating node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    //inserting node at begining
    public void pushAtBegining(int data) {
        //create new node of data
        Node new_node = new Node(data);

        //chech linkedlist is empty
        if (head == null) {
            head = new_node;
            new_node.next = null;
        } else  //making new_node point(new_node.next) to headNode and then change headnode to new_node
        {
            new_node.next = head;
            head = new_node;
        }
    }


    //inserting at last
    public void insertAtLast(int data) {
        //create new node of data
        Node new_node = new Node(data);

        //chech linkedlist is empty
        if (head == null) {
            head = new_node;
            new_node.next = null;
        } else //traversal upto last node then point the last node to new_node
        {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = null;
        }
    }

    //inserting before perticular node
    public void insertBeforeNode(int data, int value){

        //create new node of data
        Node new_node = new Node(data);

        //chech linkedlist is empty
        if (head == null) {
            head = new_node;
            new_node.next = null;
        }else //find out node using trvaersing then make new_node.next to valuenode.next and value.next to new_Node
        {
            Node temp=head;
            while(temp.data != value){
                temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
        }
    }


    //diaplay linkedlist
    public void display(){
        Node temp=head;
        while(temp.next != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}
