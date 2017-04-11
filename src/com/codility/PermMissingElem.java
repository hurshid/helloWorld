package com.codility;

/**
 * Created by Hurshid on 1/22/2015.
 */
public class PermMissingElem {
    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    private static Integer solution(Integer X, int Y, int D) {
        int s = (Y - X) % D;
        int jump = (Y - X) / D;
        if (s == 0) {
            return jump;
        } else {
            return jump + 1;
        }
    }
}
