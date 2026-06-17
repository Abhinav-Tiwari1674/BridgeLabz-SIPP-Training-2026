package JavaString.level2;

import java.util.Scanner;

public class SplitStringThenLength {
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

    public static String[][] wrdWithLen(String[] arr) {
        String[][] res = new String[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            res[i][0] = arr[i];
            res[i][1] = String.valueOf(arr[i].toCharArray().length);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String txt = sc.nextLine();

        String[] wrds = mySplit(txt);
        String[][] out = wrdWithLen(wrds);

        System.out.println("Word\tLen");
        for (String[] row : out) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    
}
