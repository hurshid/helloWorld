package com.codility;

import java.util.Arrays;

/**
 * Created by Hurshid on 4/8/2015.
 */
public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] a = {-3, 1, 2, -2, 5, 6};
        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 3) {
            return A[0] * A[1] * A[2];
        }
        int t1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int t2 = A[0] * A[1] * A[A.length - 1];
        return t1 > t2 ? t1 : t2;
    }


}
