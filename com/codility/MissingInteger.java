package com.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hurshid on 2/4/2015.
 */
public class MissingInteger {

    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        int missing = 1;
        for (int a : A) {
            set.add(a);
        }
        for (Integer a : set) {
            if (a.equals(missing)) {
                missing++;
            }
        }
        return missing;
    }
}