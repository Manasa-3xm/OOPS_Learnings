package org.example.twodimensionalArrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] invoice = new int[10][10];

        int count = 0;
        int top = 0;
        int bottom = invoice.length - 1;
        int left = 0;
        int right = invoice[0].length - 1;
        while (count < 100) {
            for (int i = left; i <= right; i++) {
                invoice[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                invoice[i][right] = count++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    invoice[bottom][i] = count++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    invoice[i][left] = count++;
                }
                left++;
            }
        }
        for (int i = 0; i < invoice.length; i++) {
            for (int j = 0; j < invoice[0].length; j++) {
                System.out.print(invoice[i][j] + "\t");
            }
        }
    }
}
