package com.leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] text = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(text));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen;
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            minLen = Integer.min(prefix.length(), strs[i].length());
            prefix = prefix.substring(0, minLen);
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, minLen);
                minLen--;
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
