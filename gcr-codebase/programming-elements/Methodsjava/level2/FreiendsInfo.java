package JavaMethods.level2;

import java.util.Scanner;

public class FreiendsInfo {
      public static String youngest(String[] n, int[] a) {
        int idx = 0;
        for (int i = 1; i < a.length; i++) if (a[i] < a[idx]) idx = i;
        return n[idx];
    }

    public static String tallest(String[] n, int[] h) {
        int idx = 0;
        for (int i = 1; i < h.length; i++) if (h[i] > h[idx]) idx = i;
        return n[idx];
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String[] n = {"Amar", "Akbar", "Anthony"};
        int[] ag = new int[3], ht = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + n[i] + ": ");
            ag[i] = sc.nextInt();
            System.out.print("Enter height of " + n[i] + ": ");
            ht[i] = sc.nextInt();
        }
        System.out.println("Youngest: " + youngest(n, ag));
        System.out.println("Tallest: " + tallest(n, ht));
        sc.close();
    }
    
}
