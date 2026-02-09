package Challenge75.Day9;
/*Given the root of a binary search tree, return a balanced binary search tree with the same node values. If there is more than one answer, return any of them.
A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
 }
class SolutionsBalanceBST{
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        // Step 1: inorder traversal
        inorder(root, list);

        // Step 2: build balanced BST
        return build(list, 0, list.size() - 1);
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    private TreeNode build(List<Integer> list, int l, int r) {
        if (l > r) return null;

        int mid = (l + r) / 2;

        TreeNode node = new TreeNode(list.get(mid));
        node.left = build(list, l, mid - 1);
        node.right = build(list, mid + 1, r);

        return node;
    }
}
public class BalanceBinarySearchTree {

    // level order print (easy to see balancing)
    static void printLevel(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            System.out.print(cur.val + " ");

            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SolutionsBalanceBST sol = new SolutionsBalanceBST();

        // -------- Test Case 1 : Right Skewed --------
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.right = new TreeNode(3);
        root1.right.right.right = new TreeNode(4);

        System.out.println("Test 1 BEFORE:");
        printLevel(root1);

        TreeNode balanced1 = sol.balanceBST(root1);

        System.out.println("Test 1 AFTER:");
        printLevel(balanced1);


        // -------- Test Case 2 : Left Skewed --------
        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(3);
        root2.left.left = new TreeNode(2);
        root2.left.left.left = new TreeNode(1);

        System.out.println("\nTest 2 BEFORE:");
        printLevel(root2);

        TreeNode balanced2 = sol.balanceBST(root2);

        System.out.println("Test 2 AFTER:");
        printLevel(balanced2);
    }
}

