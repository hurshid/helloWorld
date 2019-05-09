package com.leetcode;

public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "pi"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0 || haystack.equals(needle)) {
            return 0;
        }
        if (!haystack.contains(needle)) {
            return -1;
        }
        String ch;
        for (int i = needle.length(); i <= haystack.length(); i++) {
            ch = haystack.substring(0, i);
            if (ch.contains(needle)) {
                return i - needle.length();
            }
        }
        return -1;
    }
}
