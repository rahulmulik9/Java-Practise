package Challenge75_DSA.June.Day20;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class SolInvertBinaryTree {

    public static TreeNode invertTreeBrute(TreeNode root) {
        if (root == null) return null;
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode temp = node.left; node.left = node.right; node.right = temp;
            if (node.left  != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return root;
    }

    public static TreeNode invertTreeOptimal(TreeNode root) {
        if (root == null) return null;
        TreeNode left  = invertTreeOptimal(root.left);
        TreeNode right = invertTreeOptimal(root.right);
        root.left  = right;
        root.right = left;
        return root;
    }

    // level-order serialisation for easy comparison
    static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) { sb.append("null,"); continue; }
            sb.append(n.val).append(",");
            q.add(n.left); q.add(n.right);
        }
        return sb.toString();
    }
}

public class InvertBinaryTree {
    public static void main(String[] args) {

        // Test 1: Full tree [4,2,7,1,3,6,9] → inverted [4,7,2,9,6,3,1]
        TreeNode t1 = new TreeNode(4);
        t1.left = new TreeNode(2); t1.right = new TreeNode(7);
        t1.left.left = new TreeNode(1); t1.left.right = new TreeNode(3);
        t1.right.left = new TreeNode(6); t1.right.right = new TreeNode(9);
        System.out.println("Test 1 Brute  : " + (SolInvertBinaryTree.serialize(SolInvertBinaryTree.invertTreeBrute(t1)).startsWith("4,7,2,9,6,3,1,")   ? "PASS" : "FAIL"));

        TreeNode t1b = new TreeNode(4);
        t1b.left = new TreeNode(2); t1b.right = new TreeNode(7);
        t1b.left.left = new TreeNode(1); t1b.left.right = new TreeNode(3);
        t1b.right.left = new TreeNode(6); t1b.right.right = new TreeNode(9);
        System.out.println("Test 1 Optimal: " + (SolInvertBinaryTree.serialize(SolInvertBinaryTree.invertTreeOptimal(t1b)).startsWith("4,7,2,9,6,3,1,") ? "PASS" : "FAIL"));

        // Test 2: Two-level tree [2,1,3] → [2,3,1]
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1); t2.right = new TreeNode(3);
        System.out.println("Test 2 Brute  : " + (SolInvertBinaryTree.serialize(SolInvertBinaryTree.invertTreeBrute(t2)).startsWith("2,3,1,")   ? "PASS" : "FAIL"));

        TreeNode t2b = new TreeNode(2);
        t2b.left = new TreeNode(1); t2b.right = new TreeNode(3);
        System.out.println("Test 2 Optimal: " + (SolInvertBinaryTree.serialize(SolInvertBinaryTree.invertTreeOptimal(t2b)).startsWith("2,3,1,") ? "PASS" : "FAIL"));

        // Test 3: Single node → unchanged
        TreeNode t3 = new TreeNode(1);
        System.out.println("Test 3 Brute  : " + (SolInvertBinaryTree.serialize(SolInvertBinaryTree.invertTreeBrute(t3)).startsWith("1,")   ? "PASS" : "FAIL"));
        System.out.println("Test 3 Optimal: " + (SolInvertBinaryTree.serialize(SolInvertBinaryTree.invertTreeOptimal(t3)).startsWith("1,") ? "PASS" : "FAIL"));

        // Test 4: null tree → null
        System.out.println("Test 4 Brute  : " + (SolInvertBinaryTree.invertTreeBrute(null)   == null ? "PASS" : "FAIL"));
        System.out.println("Test 4 Optimal: " + (SolInvertBinaryTree.invertTreeOptimal(null) == null ? "PASS" : "FAIL"));
    }
}