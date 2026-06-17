package JavaString.level1;

import java.util.Scanner;

public class StringIndexExcep {
    public static void generateException(String text) {
        // Access index beyond length (runtime error)
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method to handle the Exception with try-catch
    public static void handleException(String text) {
        try {
            // Access index beyond length
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method that generates exception
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
