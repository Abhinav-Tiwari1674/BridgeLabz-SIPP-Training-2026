package JavaMethods.level3;

import java.util.Random;
import java.util.Scanner;

public class MoreMatrixOperation {
       // Method to generate a random matrix of size rows x cols
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] mat = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10) + 1; // Random 1-10
        return mat;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
    }

    // Method to find the transpose of a matrix
    public static double[][] transpose(double[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        double[][] trans = new double[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] mat) {
        return mat[0][0] * (mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1])
             - mat[0][1] * (mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0])
             + mat[0][2] * (mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] mat) {
        double det = determinant2x2(mat);
        if (det == 0) throw new ArithmeticException("Matrix is singular, inverse does not exist.");
        double[][] inv = {
            { mat[1][1]/det, -mat[0][1]/det },
            { -mat[1][0]/det, mat[0][0]/det }
        };
        return inv;
    }

    // Inverse of 3x3 matrix using adjoint method
    public static double[][] inverse3x3(double[][] mat) {
        double det = determinant3x3(mat);
        if (det == 0) throw new ArithmeticException("Matrix is singular, inverse does not exist.");

        double[][] adj = new double[3][3];

        adj[0][0] =  mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1];
        adj[0][1] = -(mat[0][1]*mat[2][2] - mat[0][2]*mat[2][1]);
        adj[0][2] =  mat[0][1]*mat[1][2] - mat[0][2]*mat[1][1];

        adj[1][0] = -(mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0]);
        adj[1][1] =  mat[0][0]*mat[2][2] - mat[0][2]*mat[2][0];
        adj[1][2] = -(mat[0][0]*mat[1][2] - mat[0][2]*mat[1][0]);

        adj[2][0] =  mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0];
        adj[2][1] = -(mat[0][0]*mat[2][1] - mat[0][1]*mat[2][0]);
        adj[2][2] =  mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j]/det;

        return inv;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        if (n != 2 && n != 3) {
            System.out.println("Invalid input! Only 2x2 or 3x3 supported.");
            sc.close();
            return;
        }

        double[][] mat = generateMatrix(n, n);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(mat);

        // Transpose
        double[][] trans = transpose(mat);
        System.out.println("\nTranspose:");
        displayMatrix(trans);

        // Determinant
        double det = (n == 2) ? determinant2x2(mat) : determinant3x3(mat);
        System.out.println("\nDeterminant: " + det);

        // Inverse
        try {
            double[][] inv = (n == 2) ? inverse2x2(mat) : inverse3x3(mat);
            System.out.println("\nInverse:");
            displayMatrix(inv);
        } catch (ArithmeticException e) {
            System.out.println("\n" + e.getMessage());
        }

        sc.close();
    }
}
