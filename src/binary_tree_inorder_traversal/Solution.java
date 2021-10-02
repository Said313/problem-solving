package binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

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
        TreeNode root = new TreeNode(4, new TreeNode(1, new TreeNode(5), new TreeNode(9)), new TreeNode(9));

        System.out.println("Answer : " + inorderIterativeTraversal(root));
    }

    public static List<Integer> inorderIterativeTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root == null) return ans;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {
            if(current == null) {
                current = stack.pop();
            } else if(current.left != null) {
                stack.push(current);
                current = current.left;
                continue;
            }

            ans.add(current.val);
            current = current.right;
        }

        return ans;
    }

    public static List<Integer> inorderRecursiveTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        if(root.left == null && root.right == null) return Collections.singletonList(root.val);

        List<Integer> ret = new ArrayList<>();

        ret.addAll(inorderRecursiveTraversal(root.left));
        ret.add(root.val);
        ret.addAll(inorderRecursiveTraversal(root.right));

        return ret;
    }
}
