package Basic.DataStructure.lnklst;

public class LnkLst {
    public static void main(String[] args) {

        LnkstNode nw=new LnkstNode();

        nw.pushAtBegining(5);
        nw.pushAtBegining(6);
        nw.insertAtLast(7);
        nw.insertAtLast(8);
        nw.insertBeforeNode(3,5);
        nw.display();

    }
}
