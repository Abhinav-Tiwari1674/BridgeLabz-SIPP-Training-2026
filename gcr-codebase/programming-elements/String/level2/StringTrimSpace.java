package JavaString.level2;

import java.util.Scanner;

public class StringTrimSpace {
      // method to trim using charAt()
    public static String myTrim(String s) {
        int st = 0, en = s.length()-1;

        while (st <= en && s.charAt(st) == ' ') st++;
        while (en >= st && s.charAt(en) == ' ') en--;

        return s.substring(st, en+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String txt = sc.nextLine();

        String t1 = myTrim(txt);
        String t2 = txt.trim();

        System.out.println("Manual trim: '" + t1 + "'");
        System.out.println("Built-in trim: '" + t2 + "'");
        System.out.println("Match? " + t1.equals(t2));
    }
}
