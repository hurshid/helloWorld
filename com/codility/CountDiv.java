package com.codility;

/**
 * Created by Hurshid on 2/4/2015.
 */
public class CountDiv {
    public static void main(String[] args) {
        System.out.println(solution(11, 345, 17));
    }

    public static int solution(int A, int B, int K) {
        int count = 0;
        if (A % K == 0) {
            count++;
        }
        if (B - A >= K) {
            count += B / K - A / K;
        }
        return count;
    }

}
