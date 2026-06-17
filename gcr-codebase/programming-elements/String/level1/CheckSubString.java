package JavaString.level1;

import java.util.Scanner;

public class CheckSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // manual substring
        String manualSub = "";
        for (int i = start; i < end && i < text.length(); i++) {
            manualSub += text.charAt(i); // build substring manually
        }

        // built-in substring with validation
        String builtSub = "";
        if (start >= 0 && end <= text.length() && start < end) {
            builtSub = text.substring(start, end);
        } else {
            System.out.println("Invalid index range! Cannot create built-in substring.");
        }

        // result
        System.out.println("Manual substring: " + manualSub);
        System.out.println("Built substring: " + builtSub);
        System.out.println("Match? " + manualSub.equals(builtSub));

        sc.close();
    }
      
}
