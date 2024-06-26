package org.example.twodimensionalArrays;

public class SumOfDiagonal {
    public static void main(String[] args) {
        int sumOfDiagonal = 0;
        int[][] invoice = new int[3][3];
        int count = 0;
        for (int i = 0; i < invoice.length; i++) {
            for (int j = 0; j < invoice[0].length; j++) {
                invoice[i][j] = count++;
            }
        }

        for (int i = 0; i < invoice.length; i++) {
            for (int j = 0; j < invoice[0].length; j++) {
                System.out.print(invoice[i][j] + " ");
                if (i == j) {
                    sumOfDiagonal += invoice[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sumOfDiagonal);

    }

}
