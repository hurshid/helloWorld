package com.leetcode;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
