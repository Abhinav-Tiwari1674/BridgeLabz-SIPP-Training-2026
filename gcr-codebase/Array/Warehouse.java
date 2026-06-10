
//A warehouse stores item quantities in an array. Find the max, min,
//total stock, and detect duplicates. Extend: rotate the stock array by
//k positions (simulate daily shift handover), and transpose a 2D shelf
//grid.
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
        int max = stock[0], min = stock[0], total = 0;
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
    }


    
}
