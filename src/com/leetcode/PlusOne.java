package com.leetcode;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {9, 9};
        int[] aa = plusOne(nums);
        for (int i = 0; i < aa.length; i++) {
            System.out.println(aa[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int sum, carry = 1;
        for (int i = digits.length; i > 0; i--) {
            sum = digits[i - 1] + carry;
            carry = sum / 10;
            digits[i - 1] = sum % 10;
        }
        if (carry == 1) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }
}
