package JavaString.level1;

import java.util.Scanner;

public class NumFormatExcep {
     // Method that generates exception (no handling)
    public void genEx(String text) {
        System.out.println("Generating exception:");
        // Invalid conversion: text to number
        int num = Integer.parseInt(text);
        System.out.println("Number: " + num);
    }

    // Method that handles exception with try-catch
    public void handleEx(String text) {
        System.out.println("Handling exception:");
        try {
            int num = Integer.parseInt(text); // may fail
            System.out.println("Number: " + num);
        } 
        catch (NumberFormatException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (RuntimeException e) {
            System.out.println("Runtime: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumFormatExcep obj = new NumFormatExcep();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // obj.genEx(input);   // Uncomment to see abrupt crash
        obj.handleEx(input);   // Safe handling

        System.out.println("Program continues...");
    }
    
}
