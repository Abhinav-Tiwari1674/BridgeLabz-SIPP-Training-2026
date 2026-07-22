package JavaMethods.level2;

import java.util.Scanner;

public class LeapYear {
      public static boolean isLeap(int y) {
        if (y < 1582) return false;
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        if (isLeap(y)) System.out.println(y + " is Leap Year");
        else System.out.println(y + " is NOT Leap Year");
        sc.close();
    }
}
