package JavaString.level3;

import java.util.Scanner;

public class FreqOfCharUnique {
      // Method to find unique characters in a string using charAt() and nested loops
    public static char[] uniqueCharacters(String inputText) {
        String unique = "";

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            boolean isDuplicate = false;

            // Check if ch already exists in 'unique'
            for (int j = 0; j < unique.length(); j++) {
                if (ch == unique.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to unique
            if (!isDuplicate) {
                unique += ch;
            }
        }

        return unique.toCharArray();
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findFrequency(String inputText) {
        int[] frequency = new int[256]; // ASCII frequency

        // Count frequency
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            frequency[ch]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(inputText);

        // Create 2D array for result
        String[][] charFreq = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            charFreq[i][0] = String.valueOf(uniqueChars[i]);
            charFreq[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return charFreq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Call frequency method
        String[][] result = findFrequency(inputText);

        // Display result
        System.out.println("Character frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " -> " + result[i][1]);
        }

        sc.close();
    }
}
