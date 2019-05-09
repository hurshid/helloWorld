package com.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        int res = reverse(1234);
        System.out.println(res);
    }

    public static int reverse(int x) {
        long result = 0l;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return (int) result == result ? (int) result : 0;
    }
}
