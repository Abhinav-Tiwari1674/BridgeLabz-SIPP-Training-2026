package JavaString.level3;

import java.util.Scanner;

public class FreqOfCharNestedLoops {
      // Method to find frequency of characters using nested loops
    public static String[] findFrequency(String inputText) {
        char[] characters = inputText.toCharArray();  // Convert string to char array
        int[] freq = new int[characters.length];     // Frequency array

        // Count frequencies
        for (int i = 0; i < characters.length; i++) {
            freq[i] = 1; // Initialize frequency

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j] && characters[i] != '0') {
                    freq[i]++;
                    characters[j] = '0'; // Mark duplicate as visited
                }
            }
        }

        // Store results in 1D String array
        String[] result = new String[characters.length];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " -> " + freq[i];
            }
        }

        // Trim result array (remove null values)
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Call frequency method
        String[] result = findFrequency(inputText);

        // Display result
        System.out.println("Character frequencies:");
        for (String res : result) {
            System.out.println(res);
        }

        sc.close();
    }
    
}
