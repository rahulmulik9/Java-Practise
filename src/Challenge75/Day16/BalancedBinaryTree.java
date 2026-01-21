package Challenge75.Day16;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
 class BalancedBinaryTreeSolutions {

     // Returns height if balanced, otherwise -1
     static int height(TreeNode root) {
         if (root == null) return 0;

         int leftHeight = height(root.left);
         if (leftHeight == -1) return -1;

         int rightHeight = height(root.right);
         if (rightHeight == -1) return -1;

         if (Math.abs(leftHeight - rightHeight) > 1)
             return -1;

         return Math.max(leftHeight, rightHeight) + 1;
     }

     static boolean isBalanced(TreeNode root) {
         return height(root) != -1;
     }
 }
public class BalancedBinaryTree {
    public static void main(String[] args) {
        // Creating a balanced tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println(BalancedBinaryTreeSolutions.isBalanced(root));
    }
}
