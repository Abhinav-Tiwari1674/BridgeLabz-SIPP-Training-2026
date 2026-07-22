package JavaMethods.level2;

import java.util.Scanner;

public class NumCheckPosNeg {
     public static boolean isPos(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int cmp(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter num " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            if (isPos(arr[i])) {
                System.out.println("Positive " + (isEven(arr[i]) ? "Even" : "Odd"));
            } else {
                System.out.println("Negative");
            }
        }
        int r = cmp(arr[0], arr[4]);
        if (r == 0) System.out.println("First=Last");
        else if (r > 0) System.out.println("First>Last");
        else System.out.println("First<Last");
        sc.close();
    }
    
}
