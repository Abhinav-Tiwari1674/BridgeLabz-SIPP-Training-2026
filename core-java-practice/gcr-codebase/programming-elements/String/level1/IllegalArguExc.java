package JavaString.level1;

import java.util.Scanner;

public class IllegalArguExc {
      // Method to generate the Exception (no handling)
    public static void generateException(String text) {
        // Passing start index > end index
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle the Exception with try-catch
    public static void handleException(String text) {
        try {
            // Invalid substring
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method that generates exception (abrupt stop if not handled here)
        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Program stopped abruptly: " + e);
        }

        // Call method that handles exception
        System.out.println("\n--- Handling Exception ---");
        handleException(input);
    }
    
    
    
}
