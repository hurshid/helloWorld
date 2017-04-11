package com.codility;

/**
 * Created by Hurshid on 1/22/2015.
 */
public class FrogJmp {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 5};
//        solution(a);
        System.out.println(solution(a));
    }

    private static int solution(int[] A) {
        long N = A.length + 1;
        long total = N * (N + 1) / 2;

        for (int i : A) {
            total -= i;
        }
        return (int) total;
    }
}