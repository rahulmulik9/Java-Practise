package Challenge75.Day9;
/*Given the root of a binary search tree, return a balanced binary search tree with the same node values. If there is more than one answer, return any of them.
A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.*/

import java.util.ArrayList;
import java.util.List;

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
    public static void main(String[] args) {
        SolutionsBalanceBST sol = new SolutionsBalanceBST();

        // -------- Test Case 1 : Right Skewed --------
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.right = new TreeNode(3);
        root1.right.right.right = new TreeNode(4);

    }
}

