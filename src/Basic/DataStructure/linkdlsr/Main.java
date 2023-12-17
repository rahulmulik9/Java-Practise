package Basic.DataStructure.linkdlsr;

public class Main {
    public static void main(String[] args) {
        lnklst lst=new lnklst();
        lst.insertAtFront(5);
        lst.insertAtFront(6);
        lst.insertAtFront(8);
        lst.insertAfter(7,8);
        lst.insertAtFront(9);

        lst.printList();

    }
}
