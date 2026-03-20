package basic.b1_datatypes.tree;

class BST {
    TreeNode root;

    // INSERT
    TreeNode insert(TreeNode root, int data) {
        if (root == null) return new TreeNode(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }

    // SEARCH
    boolean search(TreeNode root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data
                ? search(root.left, key)
                : search(root.right, key);
    }

    // DELETE
    TreeNode delete(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // Node with one or no child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            // Node with two children — get inorder successor
            TreeNode successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }

    TreeNode findMin(TreeNode root) {
        while (root.left != null) root = root.left;
        return root;
    }
}