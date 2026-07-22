package JavaString.level1;

import java.util.Scanner;

public class StringCharacterReturn {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter text: ");
        String text = sc.next();

        // manual char array
        char[] arr1 = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr1[i] = text.charAt(i);
        }

        // built-in char array
        char[] arr2 = text.toCharArray();

        // compare arrays
        boolean same = true;
        if (arr1.length != arr2.length) {
            same = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    same = false;
                    break;
                }
            }
        }

        // print arrays
        System.out.println("Manual array: ");
        for (char c : arr1) System.out.print(c + " ");

        System.out.println("\nBuilt-in array: ");
        for (char c : arr2) System.out.print(c + " ");

        System.out.println("\nArrays same? " + same);

        sc.close();
    }

}
