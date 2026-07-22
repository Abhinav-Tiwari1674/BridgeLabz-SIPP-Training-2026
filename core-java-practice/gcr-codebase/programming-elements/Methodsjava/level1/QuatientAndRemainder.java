package JavaMethods.level1;

import java.util.Scanner;

public class QuatientAndRemainder {
       public static int[] findDiv(int n, int d) {
        int q = n / d;
        int r = n % d;
        return new int[]{q, r};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter divisor: ");
        int d = sc.nextInt();

        int[] res = findDiv(n, d);
        System.out.println("Quotient = " + res[0] + ", Remainder = " + res[1]);
    }
    
}
