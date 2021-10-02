package maximum_depth_of_binary_tree;

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

    public static void main(String[] args){
        TreeNode root1 = new TreeNode(1, new TreeNode(4, new TreeNode(5), null), new TreeNode(4, null, new TreeNode(5)));
        System.out.println("Max depth of current tree : " + maxDepth(root1));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
