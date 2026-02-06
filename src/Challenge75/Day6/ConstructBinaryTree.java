package Challenge75.Day6;
/*Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.*/

import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ConstructBinaryTree {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7}, inorder = {9, 3, 15, 20, 7};

    }
}

class SolutionCon {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inToIndex = new HashMap<>();

        for (int i = 0; i < inorder.length; ++i)
            inToIndex.put(inorder[i], i);

        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inToIndex);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart,
                           int inEnd, Map<Integer, Integer> inToIndex) {
        if (preStart > preEnd)
            return null;

        final int rootVal = preorder[preStart];
        final int rootInIndex = inToIndex.get(rootVal);
        final int leftSize = rootInIndex - inStart;

        TreeNode root = new TreeNode(rootVal);
        root.left = build(preorder, preStart + 1, preStart + leftSize, inorder, inStart,
                rootInIndex - 1, inToIndex);
        root.right = build(preorder, preStart + leftSize + 1, preEnd, inorder, rootInIndex + 1, inEnd,
                inToIndex);

        return root;
    }
}