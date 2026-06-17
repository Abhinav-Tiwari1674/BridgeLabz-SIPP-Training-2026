package ArrayPracticeQuestions.level1;

import java.util.Scanner;

public class MultiDArray {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        System.out.println("Enter matrix values:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] arr = new int[r * c];
        int idx = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[idx++] = mat[i][j];
            }
        }

        System.out.println("1D Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    
}
