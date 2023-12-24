package dataStructre.que.usingLinkedlist;

public class Quels {
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }




    public void add(int data){

        Node nw=new Node(data);
        if(head == null){
            head=nw;
            nw.next=null;
        }else {
            Node temp=head;
            while (temp.next != null){
                temp=temp.next;
            }

            temp.next=nw;
            nw.next=null;
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
