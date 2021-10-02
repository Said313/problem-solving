package symmetric_tree;

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

public class Solution {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(4, new TreeNode(5), null), new TreeNode(4, null, new TreeNode(5)));
        TreeNode root2 = new TreeNode(4, new TreeNode(1, new TreeNode(5), new TreeNode(9)), new TreeNode(9));

        System.out.println("Is the first tree symmetric : " + isSymmetric(root1));
        System.out.println("Is the second tree symmetric : " + isSymmetric(root2));
    }

    public static boolean isSymmetric(TreeNode root) {
        return root != null ? isSymmetric(root.left, root.right) : null;
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left != null ^ right != null) return false;
        if(left.val != right.val) return false;

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
