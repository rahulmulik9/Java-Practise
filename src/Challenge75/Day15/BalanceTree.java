package Challenge75.Day15;
public class BalanceTree {
    public static void main(String[] args) {
        // Representation of input BST:
        //            10
        //           / \
        //          20   30
        //         /  \
        //        40   60
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        System.out.println(isBalanced(root) ? "true" : "false");
    }
}
