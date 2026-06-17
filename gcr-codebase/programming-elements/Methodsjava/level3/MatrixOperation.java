package JavaMethods.level3;

import java.util.Random;
import java.util.Scanner;

public class MatrixOperation {
     // Method to generate a random matrix of size rows x cols
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10); // Random numbers 0-9
        return mat;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] sum = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];
        return sum;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] diff = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                diff[i][j] = a[i][j] - b[i][j];
        return diff;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;

        if (c1 != r2) {
            throw new IllegalArgumentException("Matrix multiplication not possible!");
        }

        int[][] prod = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return prod;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns for Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns for Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] matA = generateMatrix(r1, c1);
        int[][] matB = generateMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        displayMatrix(matA);

        System.out.println("\nMatrix B:");
        displayMatrix(matB);

        // Addition and subtraction only if dimensions match
        if (r1 == r2 && c1 == c2) {
            System.out.println("\nA + B:");
            displayMatrix(addMatrices(matA, matB));

            System.out.println("\nA - B:");
            displayMatrix(subtractMatrices(matA, matB));
        } else {
            System.out.println("\nAddition/Subtraction not possible due to dimension mismatch.");
        }

        // Multiplication
        if (c1 == r2) {
            System.out.println("\nA * B:");
            displayMatrix(multiplyMatrices(matA, matB));
        } else {
            System.out.println("\nMultiplication A*B not possible due to dimension mismatch.");
        }

        if (c2 == r1) {
            System.out.println("\nB * A:");
            displayMatrix(multiplyMatrices(matB, matA));
        } else {
            System.out.println("\nMultiplication B*A not possible due to dimension mismatch.");
        }

        sc.close();
    }
}
