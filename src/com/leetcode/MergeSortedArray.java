package com.leetcode;


public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 3, 5};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] array = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                array[k] = nums1[i];
                i++;
            } else {
                array[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            array[k] = nums1[i];
            k++;
            i++;
        }
        while (j < n) {
            array[k] = nums2[j];
            k++;
            j++;
        }
        System.arraycopy(array, 0, nums1, 0, m + n);
    }
}
