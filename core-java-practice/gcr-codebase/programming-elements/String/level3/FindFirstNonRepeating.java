package JavaString.level3;

import java.util.Scanner;

public class FindFirstNonRepeating {
      // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String inputText) {
        int[] frequency = new int[256]; // ASCII has 256 characters

        // count frequency of each character
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            frequency[ch]++;
        }

        // find the first character with frequency 1
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // return null character if no non-repeating found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // find first non-repeating character
        char result = findFirstNonRepeating(inputText);

        // display result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        sc.close();
    }
    
}
