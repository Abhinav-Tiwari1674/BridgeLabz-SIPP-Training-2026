import java.util.Arrays;
import java.util.Scanner;
public class WordMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("\nFirst String (Uppercase): " + str1.toUpperCase());
        System.out.println("Second String (Uppercase): " + str2.toUpperCase());
        System.out.println("Length of First String: " + str1.length());
        System.out.println("Length of Second String: " + str2.length());
        char[] arr1 = str1.toLowerCase().replaceAll("\\s+", "").toCharArray();
        char[] arr2 = str2.toLowerCase().replaceAll("\\s+", "").toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Result: The strings are ANAGRAMS.");
        } else {
            System.out.println("Result: The strings are NOT ANAGRAMS.");
        }
    }
}