package Challenge75.Day15;
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
public class HeightTree {
    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);
    }
}
