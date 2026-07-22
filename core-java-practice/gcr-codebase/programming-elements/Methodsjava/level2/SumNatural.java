package JavaMethods.level2;

import java.util.Scanner;

public class SumNatural {
        public static int recSum(int n) {
        if (n == 0) return 0;
        return n + recSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int s1 = recSum(n);
            int s2 = formulaSum(n);
            System.out.println("Rec Sum=" + s1);
            System.out.println("Formula Sum=" + s2);
            System.out.println("Equal? " + (s1 == s2));
        }
        sc.close();
    }
}
