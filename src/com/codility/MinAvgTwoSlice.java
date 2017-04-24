package com.codility;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        System.out.println(solution(A));


        String sentence = "";
        StringBuilder result = new StringBuilder(sentence.length());
        boolean capitalize = true;

        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if(c == '.') {
                capitalize = true;
            }
            else if(capitalize && Character.isAlphabetic(c)) {
                c = Character.toUpperCase(c);
                capitalize = false;
            }
            result.append(c);
        }
        System.out.println(result);
    }



    public static int solution(int[] A) {
        int minP = -1;
        double average = Double.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            double nextAvg = (A[i] + A[i + 1]) / 2d;
            if (nextAvg < average) {
                minP = i;
                average = nextAvg;
            }
            if (i + 2 < A.length) {
                nextAvg = (A[i] + A[i + 1] + A[i + 2]) / 3d;
                if (nextAvg < average) {
                    minP = i;
                    average = nextAvg;
                }
            }
        }
        return minP;
    }

    public int solution5_4(int[] A) {
        int p = 0;
        double x, m = (A[0] + A[1]) / 2.0;
        for (int i = 0; i < A.length - 2; i++) {
            x = (A[i + 1] + A[i + 2]) / 2.0;
            if (x < m) {
                m = x;
                p = i + 1;
            }
            x = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            if (x < m) {
                m = x;
                p = i;
            }
        }
        return p;
    }
}
