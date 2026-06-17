package ControlFlowPractices.level2;

import java.util.Scanner;

public class GratestFactorWhile {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gf = 1, i = n - 1;

        while (i >= 1) {
            if (n % i == 0) {
                gf = i;
                break;
            }
            i--;
        }

        System.out.println("Greatest factor = " + gf);
        sc.close();
    }
}
