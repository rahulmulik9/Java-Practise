package Basic.DataStructure.linkdlsr;

public class lnklst {
    Node head;

    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



    // insertion at end
    public void insertAtLast(int data) {
        Node nw = new Node(data);
        //empty list
//        nw.next = head;
//        head = nw;
        if (head == null) {
            head = nw;
            nw.next = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nw;
            nw.next = null;
        }

    }




    //insertion at front
    public void insertAtFront(int data){
        Node nw=new Node(data);

        if(head == null){
            head=nw;
            nw.next=null;
        }
        else {

            nw.next = head;
           head=nw;
        }
    }


    //insert at between data
    public void insertAfter(int data,int beforeData){
        Node temp=head;
        Node nw=new Node(data);
        Node bd=new Node(beforeData);
        while(temp.next == bd ){
            temp=temp.next;
        }
        nw.next=temp.next;
        temp.next=nw;
    }




    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }
    }


}
