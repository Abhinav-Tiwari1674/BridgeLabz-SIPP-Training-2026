package JavaString.level3;

import java.util.Scanner;

public class UniqueCharacter {
     // Method to count occurrences of a character in a string
    public static int countOccurrences(String inputText, char searchChar) {
        int count = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input for string
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // take user input for character
        System.out.print("Enter a character to search: ");
        char searchChar = sc.next().charAt(0);

        // calculate occurrences
        int occurrences = countOccurrences(inputText, searchChar);

        // display result
        System.out.println("The character '" + searchChar + "' occurred " + occurrences + " times in the string.");

        sc.close();
    }
    
}
