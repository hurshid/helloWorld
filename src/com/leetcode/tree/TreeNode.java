package com.leetcode.tree;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public void insert(int data) {
        if (val == data) {
            return;
        }

        if (data < val) {
            if (left == null) {
                left = new TreeNode(data);
            } else {
                left.insert(data);
            }
        } else {
            if (right == null) {
                right = new TreeNode(data);
            } else {
                right.insert(data);
            }
            right.insert(data);
        }
    }

    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.println("Value: " + val);
        if (right != null) {
            right.traverseInOrder();
        }
    }

    public TreeNode get(int value) {
        if (value == val) {
            return this;
        }

        if (value < val) {
            if (left != null) {
                return left.get(value);
            }
        } else {
            if (right != null) {
                return right.get(value);
            }
        }
        return null;
    }

    public int min() {
        if (left == null) {
            return val;
        } else {
            return left.min();
        }
    }

    public int max() {
        if (right == null) {
            return val;
        } else {
            return right.max();
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
