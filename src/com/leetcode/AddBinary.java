package com.leetcode;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int maxLen = Math.max(lenA, lenB);
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLen; i++) {
            int ch1 = lenA > i ? a.charAt(lenA - 1 - i) - '0' : 0;
            int ch2 = lenB > i ? b.charAt(lenB - 1 - i) - '0' : 0;
            int temp = ch1 + ch2 + carry;
            carry = temp / 2;
            result.insert(0, (temp % 2));
        }
        return carry == 1 ? '1' + result.toString() : result.toString();
    }
}
