package com.leetcode;

import com.leetcode.tree.TreeNode;

public class MaximumDepthBinaryTree {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);

        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.left.left = new TreeNode(5);
        tree.right.right = new TreeNode(7);

        System.out.println(maxDepth(tree));
    }

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }


}
