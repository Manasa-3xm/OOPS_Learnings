package org.example.twodimensionalArrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] invoice = new int[3][3];
        int[][] transposedMatrix = new int[3][3];

        int count = 0;
        for (int i = 0; i < invoice.length; i++) {
            for (int j = 0; j < invoice[0].length; j++) {
                invoice[i][j] = count++;
            }
        }
        for (int i = 0; i < invoice.length; i++) {
            for (int j = 0; j < invoice[0].length; j++) {
                transposedMatrix[j][i] = invoice[i][j];
            }
        }
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
