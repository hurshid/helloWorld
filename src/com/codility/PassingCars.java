package com.codility;

public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        System.out.println(solution(A, 5));
    }

    public static int solution(int[] A, int N) {
        int count = 0;
        int zero = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zero += 1;
            }
            if (A[i] == 1) {
                count += zero;
                if (count > 1000000000) {
                    count = -1;
                    break;
                }
            }
        }
        return count;
    }

}
