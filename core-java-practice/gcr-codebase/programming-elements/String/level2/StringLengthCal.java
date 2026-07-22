package JavaString.level2;

import java.util.Scanner;

public class StringLengthCal {
      // Method to find string length without using length()
    public static int strLen(String s) {
        char[] arr = s.toCharArray();
        int cnt = 0;
        for (char c : arr) {
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter text: ");
        String txt = sc.nextLine();

        // call method
        int myLen = strLen(txt);
        int orgLen = txt.length();

        // show result
        System.out.println("Length (user method): " + myLen);
        System.out.println("Length (built-in): " + orgLen);
    }
}
