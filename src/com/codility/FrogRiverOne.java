package com.codility;

import java.util.Arrays;

public class FrogRiverOne {

    public static void main(String[] args) {
//        int[] A = {1, 3, 6, 4, 1, 2};
        int[] A = {4, 1, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int temp = 1;
        for (Integer a : A) {
            if (temp == a) {
                temp++;
            }
        }
        if (temp == A.length + 1) {
            return 1;
        }
        return 0;
    }


}
