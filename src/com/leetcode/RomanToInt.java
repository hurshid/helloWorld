package com.leetcode;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("CM"));
    }

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int number = 0;
        int prev = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int value = getValue(s.charAt(i));
            number += value;
            if (value > prev) {
                number -= 2 * prev;
            }
            prev = value;
        }
        return number;
    }

    static int getValue(char r) {
        switch (r) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
