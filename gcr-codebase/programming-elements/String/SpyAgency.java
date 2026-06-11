/*A spy agency encodes messages. Reverse a secret message, check if
it is a palindrome, count vowels/consonants, and verify if two
intercepts are anagrams. Extend: find the first non-repeating
character in a surveillance log.*/


import java.util.HashMap;
import java.util.Map;

public class SpyAgency {

    // Method to reverse a secret message
    public static String reverseMessage(String message) {
        StringBuilder reversed = new StringBuilder(message);
        return reversed.reverse().toString();
    }

    // Method to check if a message is a palindrome
    public static boolean isPalindrome(String message) {
        String cleanedMessage = message.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedMessage = reverseMessage(cleanedMessage);
        return cleanedMessage.equals(reversedMessage);
    }

    // Method to count vowels and consonants in a message
    public static Map<String, Integer> countVowelsAndConsonants(String message) {
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "AEIOUaeiou";

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        Map<String, Integer> counts = new HashMap<>();
        counts.put("vowels", vowelCount);
        counts.put("consonants", consonantCount);
        return counts;
    }

    // Method to check if two messages are anagrams
    public static boolean areAnagrams(String message1, String message2) {
        char[] chars1 = message1.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        char[] chars2 = message2.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        
        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);
        
        return java.util.Arrays.equals(chars1, chars2);
    }

    // Method to find the first non-repeating character in a surveillance log
    public static Character firstNonRepeatingCharacter(String log) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : log.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : log.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return null; // Return null if there is no non-repeating character
    }
}