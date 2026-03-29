package Challenge75.Day51;


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

class SolutionPath {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }
}

public class PathSum {
    public static void main(String[] args) {
        SolutionPath sol = new SolutionPath();

        // Test Case 1: Basic tree (Expected: true)
        TreeNode root1 = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1)))
        );

        System.out.println("Test 1: " + sol.hasPathSum(root1, 22)); // true


        // Test Case 2: No valid path (Expected: false)
        System.out.println("Test 2: " + sol.hasPathSum(root1, 26)); // false


        // Test Case 3: Single node = sum (Expected: true)
        TreeNode root2 = new TreeNode(1);
        System.out.println("Test 3: " + sol.hasPathSum(root2, 1)); // true


        // Test Case 4: Single node ≠ sum (Expected: false)
        System.out.println("Test 4: " + sol.hasPathSum(root2, 2)); // false


        // Test Case 5: Negative values (Expected: true)
        TreeNode root3 = new TreeNode(-2,
                null,
                new TreeNode(-3)
        );
        System.out.println("Test 5: " + sol.hasPathSum(root3, -5)); // true


        // Test Case 6: Empty tree (Expected: false)
        System.out.println("Test 6: " + sol.hasPathSum(null, 0)); // false


        // Test Case 7: Multiple paths, only one valid (Expected: true)
        TreeNode root4 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );
        System.out.println("Test 7: " + sol.hasPathSum(root4, 4)); // true


        // Test Case 8: Deep tree (Expected: true)
        TreeNode root5 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                null),
                        null),
                null
        );
        System.out.println("Test 8: " + sol.hasPathSum(root5, 10)); // true


        // Test Case 9: Path exists but not root-to-leaf (Expected: false)
        TreeNode root6 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        null),
                null
        );
        System.out.println("Test 9: " + sol.hasPathSum(root6, 3)); // false
    }
}