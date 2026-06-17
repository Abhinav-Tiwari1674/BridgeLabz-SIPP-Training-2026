package JavaMethods.level1;

import java.util.Scanner;

public class NaturalSum {
    public class NaturalSumApp {

    public static int sumN(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) s += i;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sumN(n));
    }
    
}
