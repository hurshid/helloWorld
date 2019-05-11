package com.leetcode;

import com.leetcode.tree.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        treeNode.right = new TreeNode(3);

        System.out.println(isSymmetric(treeNode));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left != null && right == null) {
            return false;
        }
        if (left == null && right != null) {
            return false;
        }
        if (left != null) {
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left) && left.val == right.val;
        }
        return true;
    }
}
