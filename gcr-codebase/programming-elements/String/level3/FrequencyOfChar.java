package JavaString.level3;

import java.util.Scanner;

public class FrequencyOfChar {
     public static Object[][] findFrequency(String inputText) {
        int[] frequency = new int[256]; // ASCII characters

        // Count frequency of each character
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            frequency[ch]++;
        }

        // Count distinct characters
        int distinctCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                distinctCount++;
            }
        }

        // Store characters and frequencies in 2D array
        Object[][] charFreq = new Object[distinctCount][2];
        int index = 0;

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            if (frequency[ch] > 0) {
                charFreq[index][0] = ch;
                charFreq[index][1] = frequency[ch];
                frequency[ch] = 0; // avoid duplicates
                index++;
            }
        }

        return charFreq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Call method
        Object[][] result = findFrequency(inputText);

        // Display result
        System.out.println("Character frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " -> " + result[i][1]);
        }

        sc.close();
    }
}
