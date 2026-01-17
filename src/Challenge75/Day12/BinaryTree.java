package Challenge75.Day12;

public class BinaryTree {
    public static void main(String[] args) {

        // Creating tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        System.out.print("Preorder Traversal: ");
        BinaryTreeExample.preorder(root);

        System.out.print("\nInorder Traversal: ");
        BinaryTreeExample.inorder(root);

        System.out.print("\nPostorder Traversal: ");
        BinaryTreeExample.postorder(root);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}
class BinaryTreeExample {
    // Preorder: Root -> Left -> Right
    static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder: Left -> Root -> Right
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    // Postorder: Left -> Right -> Root
    static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

}