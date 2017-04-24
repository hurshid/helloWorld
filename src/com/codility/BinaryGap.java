package com.codility;


public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    private static Integer solution(Integer N) {
        int max = 0;
        int count = 0;
        int m = 0;
        while (N != 0) {
            if (N % 2 == 1) {
                m++;
                if (count > max) {
                    max = count;
                }
                count = 0;
            } else if (m > 0) {
                count++;
            }
            N = N / 2;
        }
        return max;
    }
}
