package JavaString.level1;

import java.util.Scanner;

public class TextToUpperCase {
      // Method to convert text to uppercase using ASCII logic
    public static String convertToUpper(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);  // convert to uppercase
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert using user-defined method
        String manualUpper = convertToUpper(input);

        // Convert using built-in method
        String builtInUpper = input.toUpperCase();

        // Compare results
        boolean isSame = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("Manual Uppercase  : " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both results same? " + isSame);
    }
}
