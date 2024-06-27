package org.example.twodimensionalArrays;

public class RotationMatrix {
    public static void main(String[] args) {
        int[][] invoice = new int[3][3];
        int count = 0;

        // Fill the matrix with values
        for (int i = 0; i < invoice.length; i++) {
            for (int j = 0; j < invoice[0].length; j++) {
                invoice[i][j] = count++;
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(invoice);

        // Rotate the matrix
        rotateMatrix(invoice);

        // Print the rotated matrix
        System.out.println("\nRotated Matrix:");
        printMatrix(invoice);
    }

    // Method to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                // Swap matrix[i][left] with matrix[i][right]
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
