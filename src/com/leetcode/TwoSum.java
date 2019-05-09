package com.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int[] nums = {3,2,4};

        int[] res = sum.twoSum(nums, 6);
        System.out.println("[" + res[0] + "," + res[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }
}
