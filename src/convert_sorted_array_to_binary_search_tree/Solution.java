package convert_sorted_array_to_binary_search_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

public class Solution {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,8,9,50,51,60};

        System.out.println("BST from sorted array = " + Arrays.toString(arr) + " : " + inorderRecursiveTraversal(sortedArrayToBST(arr)));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        int n = nums.length - 1;
        int mid = n/2;

        return new TreeNode(nums[mid], sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid)), sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, n + 1)));
    }

    public static List<String> inorderRecursiveTraversal(TreeNode root) {
        if(root == null) return Collections.singletonList("null");
        if(root.left == null && root.right == null) return Collections.singletonList(String.valueOf(root.val));

        List<String> ret = new ArrayList<>();

        ret.addAll(inorderRecursiveTraversal(root.left));
        ret.add(String.valueOf(root.val));
        ret.addAll(inorderRecursiveTraversal(root.right));

        return ret;
    }
}
