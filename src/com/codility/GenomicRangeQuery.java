package com.codility;

/**
 * Created by Hurshid on 2/4/2015.
 */
public class GenomicRangeQuery {
    public static void main(String[] args) {
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] m = solution("CAGCCTA", P, Q);
        for (int k : m) {
            System.out.print(k + ", ");
        }
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int[][] a = new int[4][S.length()];
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            switch (ch) {
                case 'A':
                    a[0][i]++;
                    break;
                case 'C':
                    a[1][i]++;
                    break;
                case 'G':
                    a[2][i]++;
                    break;
                case 'T':
                    a[3][i]++;
                    break;
                default:
                    break;
            }
        }
        int[][] prefixSum = new int[4][S.length() + 1];
        for (int k = 1; k < S.length() + 1; k++) {
            for (int j = 0; j < 4; j++) {
                prefixSum[j][k] = prefixSum[j][k - 1] + a[j][k - 1];
            }
        }
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int x = P[i];
            int y = Q[i];
            for (int j = 0; j < 4; j++) {
                if (prefixSum[j][y + 1] - prefixSum[j][x] > 0) {
                    result[i] = j + 1;
                    break;
                }
            }
        }
        return result;
    }

}
