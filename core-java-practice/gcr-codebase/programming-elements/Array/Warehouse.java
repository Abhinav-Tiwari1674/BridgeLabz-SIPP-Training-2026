
/*A warehouse stores item quantities in an array. Find the max, min,
total stock, and detect duplicates. Extend: rotate the stock array by
k positions (simulate daily shift handover), and transpose a 2D shelf
grid.*/
import java.util.Scanner;
public class Warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] stock = new int[n];
        System.out.println("quantity of each item:");
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }



        int max = stock[0];
        int min = stock[0];
        int total =0;
        for (int qty : stock) {
            if (qty > max) max = qty;
            if (qty < min) min = qty;
            total += qty;
        }
        System.out.println("Max quantity: " + max);
        System.out.println("Min quantity: " + min);
        System.out.println("Total stock: " + total);
        boolean hasDuplicates = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (stock[i] == stock[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) break;
        }
        System.out.println("Duplicates detected: " + hasDuplicates);

        System.out.print("Enter rotation count k (for stock handover): ");
        int k = sc.nextInt();
        int[] rotatedStock = rotateRight(stock, k);
        System.out.print("Rotated stock: ");
        for (int qty : rotatedStock) {
            System.out.print(qty + " ");
        }
        System.out.println();

        System.out.print("Enter shelf rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter shelf columns: ");
        int cols = sc.nextInt();
        int[][] shelf = new int[rows][cols];
        System.out.println("Enter shelf quantities row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                shelf[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original shelf grid:");
        printMatrix(shelf);

        int[][] transposedShelf = transpose(shelf);
        System.out.println("Transposed shelf grid:");
        printMatrix(transposedShelf);
    }

    private static int[] rotateRight(int[] array, int k) {
        int n = array.length;
        if (n == 0) {
            return array;
        }
        k = ((k % n) + n) % n;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = array[i];
        }
        return result;
    }

    private static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
