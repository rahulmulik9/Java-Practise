package basic.b1_datatypes.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    // INORDER — Left → Root → Right (sorted output in BST)
    void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // PREORDER — Root → Left → Right
    void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // POSTORDER — Left → Right → Root
    void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // LEVEL ORDER (BFS)
    void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null)  queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    // HEIGHT of the tree
    int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // COUNT total nodes
    int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // SEARCH a value in BST
    boolean search(TreeNode root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data
                ? search(root.left, key)
                : search(root.right, key);
    }

    // MAIN — demo
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left        = new TreeNode(30);
        root.right       = new TreeNode(70);
        root.left.left   = new TreeNode(20);
        root.left.right  = new TreeNode(40);
        root.right.left  = new TreeNode(60);
        root.right.right = new TreeNode(80);

        TreeTraversal t = new TreeTraversal();

        System.out.print("Inorder:    "); t.inorder(root);    System.out.println();
        System.out.print("Preorder:   "); t.preorder(root);   System.out.println();
        System.out.print("Postorder:  "); t.postorder(root);  System.out.println();
        System.out.print("Level Order:"); t.levelOrder(root); System.out.println();

        System.out.println("Height:     " + t.height(root));
        System.out.println("Node count: " + t.countNodes(root));
        System.out.println("Search 40:  " + t.search(root, 40));
        System.out.println("Search 99:  " + t.search(root, 99));
    }
}
