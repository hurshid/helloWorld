package com.codility;

public class MaxCounters {
    public static void main(String[] args) {
//        int[] A = {1, 3, 6, 4, 1, 2};
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        System.out.println(solution(5, A));
    }

    public static int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        int max = 0;
        int temp;
        for (int i = 0; i < A.length; i++) {
            if (1 <= A[i] && A[i] <= N) {
                counter[A[i] - 1] += 1;
                temp = counter[A[i] - 1];
                if (max < temp) {
                    max = temp;
                }
            } else {
                for (int j = 0; j < N; j++) {
                    counter[j] = max;
                }
            }
        }
        return counter;
    }

}
