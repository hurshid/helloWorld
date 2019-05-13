package com.leetcode.tree;

public class TreeMain {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        if (!tree.isEmpty()) {
            tree.print();
        }

        System.out.println(tree.get(26).val);

        System.out.println("Min: " + tree.min());
        System.out.println("Max: " + tree.max());
    }
}
