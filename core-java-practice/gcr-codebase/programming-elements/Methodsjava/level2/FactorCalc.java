package JavaMethods.level2;

import java.util.Scanner;

public class FactorCalc {
      // method to return factors array
    public static int[] getFactors(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) cnt++;
        }
        int[] f = new int[cnt];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f[idx] = i;
                idx++;
            }
        }
        return f;
    }

    // sum of factors
    public static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    // product of factors
    public static long product(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    // sum of squares of factors
    public static int sumSq(int[] f) {
        int s2 = 0;
        for (int x : f) s2 += Math.pow(x, 2);
        return s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] f = getFactors(n);

        System.out.print("Factors: ");
        for (int x : f) System.out.print(x + " ");

        System.out.println("\nSum = " + sum(f));
        System.out.println("Product = " + product(f));
        System.out.println("Sum of Squares = " + sumSq(f));

        sc.close();
    }
}