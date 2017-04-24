package com.codility;

public class VendingMachine {
    public static void main(String[] args) {
        int[] a = solution(4.99, 4.01);
        for (int b : a) {
            System.out.println(b);
        }
    }

    public static int[] solution(double M, double P) {

        int[] coin = {1, 5, 10, 25, 50, 100};
        int[] temp1 = {0, 0, 0, 0, 0, 0};

        int sum = (int) (100 * M - 100 * P);

        for (int i = coin.length - 1; i >= 0; i--) {
            int t = (int) (sum / coin[i]);
            sum -= t * coin[i];
            temp1[i] = t;
        }
        return temp1;
    }
}
