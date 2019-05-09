package com.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2));
    }

    public static boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int num = 0;
        while (x > 0) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return num == temp;
    }
}
