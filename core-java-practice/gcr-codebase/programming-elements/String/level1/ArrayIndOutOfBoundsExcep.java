package JavaString.level1;

import java.util.Scanner;

public class ArrayIndOutOfBoundsExcep {
       // generates exception (no handling)
    public void genEx(String[] arr) {
        System.out.println("Accessing invalid index:");
        System.out.println(arr[arr.length]);  // crash
    }

    // handles exception with try-catch
    public void handleEx(String[] arr) {
        System.out.println("Handling exception:");
        try {
            System.out.println(arr[arr.length]);  // crash point
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Runtime: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayIndOutOfBoundsExcep obj = new ArrayIndOutOfBoundsExcep();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // obj.genEx(names);   // uncomment to see crash
        obj.handleEx(names);   // safe handling

        System.out.println("Program continues...");
    }
}
