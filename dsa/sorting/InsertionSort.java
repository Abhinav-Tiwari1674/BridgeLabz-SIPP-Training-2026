import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empId = new int[n];

        System.out.println("Enter employee IDs:");

        for (int i = 0; i < n; i++) {
            empId[i] = sc.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {

            int key = empId[i];
            int j = i - 1;

            while (j >= 0 && empId[j] > key) {
                empId[j + 1] = empId[j];
                j--;
            }

            empId[j + 1] = key;
        }

        System.out.println("Employee IDs in Ascending Order:");

        for (int id : empId) {
            System.out.print(id + " ");
        }

        sc.close();
    }
}