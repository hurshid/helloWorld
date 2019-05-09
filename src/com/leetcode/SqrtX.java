package com.leetcode;

public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        Double d = Math.sqrt(Double.parseDouble(x+""));
        return d.intValue();
    }
}
