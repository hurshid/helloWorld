package com.codility;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 4};
        solution(A);
//        System.out.println(solution(A));
    }

    private static void solution(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean exist = false;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                System.out.println(a[i]);
            }
        }
    }

    private static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }
}
