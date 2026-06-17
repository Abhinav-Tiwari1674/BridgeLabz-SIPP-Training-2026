package JavaMethods.level1;

import java.util.Scanner;

public class MinMax {
      public static int[] findMinMax(int a, int b, int c) {
        int min = a, max = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (b > max) max = b;
        if (c > max) max = c;
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int[] res = findMinMax(a, b, c);
        System.out.println("Smallest = " + res[0] + ", Largest = " + res[1]);
    }
    
}
