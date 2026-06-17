package JavaString.level2;

import java.util.Scanner;

public class SplitText {
    // Method to split text into words manually
    public static String[] mySplit(String s) {
        int spc = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') spc++;
        }
        String[] wrds = new String[spc];
        int idx = 0, st = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wrds[idx++] = s.substring(st, i);
                st = i + 1;
            }
        }
        wrds[idx] = s.substring(st);
        return wrds;
    }

    // Compare arrays
    public static boolean cmpArr(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String txt = sc.nextLine();

        String[] arr1 = mySplit(txt);
        String[] arr2 = txt.split(" ");

        System.out.println("Match? " + cmpArr(arr1, arr2));
    }
    
}
