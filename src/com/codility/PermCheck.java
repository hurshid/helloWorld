package com.codility;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public static void main(String[] args) {
        int[] A = {5, 1, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(5, A));
    }

    public static int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.size() >= X) {
                return i;
            }
        }
        return -1;
    }
}