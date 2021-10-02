package same_tree;

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
        TreeNode root1 = new TreeNode(4, new TreeNode(1, new TreeNode(5), new TreeNode(9)), new TreeNode(9));
        TreeNode root2 = new TreeNode(4, new TreeNode(1, new TreeNode(6), new TreeNode(9)), new TreeNode(9));
        TreeNode root3 = new TreeNode(4, new TreeNode(1, new TreeNode(5), new TreeNode(9)), new TreeNode(9));

        System.out.println("Is the first tree the same as the second : " + isSameTree(root1, root2));
        System.out.println("Is the first tree the same as the third : " + isSameTree(root1, root3));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p != null ^ q != null) return false;
        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
