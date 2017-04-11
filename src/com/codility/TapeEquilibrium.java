package com.codility;

/**
 * Created by Hurshid on 1/22/2015.
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int first = A[0];
        int sum = 0;
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
        }
        int min = Math.abs(sum - first);
        int temp;
        for (int i = 1; i < A.length - 1; i++) {
            first += A[i];
            sum -= A[i];
            temp = Math.abs(sum - first);
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
}
