package basic.DataStructure.stack.usingLinkedList;

public class lnkst {

    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    public void push(int data){
        Node nw=new Node(data);
        if(head == null){
            head=nw;
            nw.next=null;
        }

        else{
            nw.next=head;
            head=nw;
        }
    }


    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }



}
