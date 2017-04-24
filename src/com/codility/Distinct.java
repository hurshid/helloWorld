package com.codility;

import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {
        int[] a = {2, 1, 1, 2, 3, 1};
        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int temp = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                temp++;
            }
        }
        return A.length - temp;
    }
}
