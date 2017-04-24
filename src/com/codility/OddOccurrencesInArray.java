package com.codility;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int[] B = solution(A, 3);
        for (int b : B) {
            System.out.print(b + " ");
        }
    }

    private static int[] solution(int[] A, int K) {
        for (int i = 0; i < K; i++) {
            for (int j = A.length - 1; j > 0; j--) {
                int temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
            }
        }
        return A;
    }
}
