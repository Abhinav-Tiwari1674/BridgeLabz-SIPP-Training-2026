// A recruitment portal receives two skill keywords from a candidate.
// Write a program that:
// Accepts two strings.
// Checks whether they are anagrams.
// Displays both strings in uppercase.
// Shows the total length of each string.
// Prints a suitable message based on the result.

public class WorldMatch {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        // Check if str1 and str2 are anagrams
        if (areAnagrams (str1, str2)) {

            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }   
        // Display both strings in uppercase
        System.out.println("String 1 in uppercase: " + str1.toUpperCase()); 
        System.out.println("String 2 in uppercase: " + str2.toUpperCase());
        // Show the total length of each string
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length()); 
    }

    private static boolean areAnagrams(String s1, String s2) {
        String normalized1 = s1.replaceAll("\\s+", "").toLowerCase();
        String normalized2 = s2.replaceAll("\\s+", "").toLowerCase();

        if (normalized1.length() != normalized2.length()) {
            return false;
        }

        int[] counts = new int[256];
        for (char c : normalized1.toCharArray()) {
            counts[c]++;
        }
        for (char c : normalized2.toCharArray()) {
            counts[c]--;
            if (counts[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
