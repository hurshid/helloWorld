package com.leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        char[] ch = s.toCharArray();
        int i = len;
        while (i > 0) {
            if (ch[i - 1] == ' ') {
                len = len - i;
                break;
            }
            i--;
        }
        return len;
    }
}
