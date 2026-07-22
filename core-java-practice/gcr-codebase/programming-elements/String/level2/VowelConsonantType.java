package JavaString.level2;

import java.util.Scanner;

public class VowelConsonantType {
       // check type
    public static String chkType(char c) {
        if (!Character.isLetter(c)) return "Not Letter";
        c = Character.toLowerCase(c);
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
        return "Consonant";
    }

    // return 2D arr of char + type
    public static String[][] mapType(String s) {
        String[][] res = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res[i][0] = String.valueOf(c);
            res[i][1] = chkType(c);
        }
        return res;
    }

    // display in table
    public static void showTab(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String txt = sc.nextLine();

        String[][] out = mapType(txt);
        showTab(out);
    }
    
}
