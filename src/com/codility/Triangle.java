package com.codility;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] a = {10, 2, 5, 1, 8, 20};
        int[] a2 = {10, 50, 5, 1};
        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        if (null == A || A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2 && A[i - 2] > 0; i--) {
            if (A[i] < (A[i - 1] + A[i - 2])) {
                return 1;
            }
        }
        return 0;
    }
}
