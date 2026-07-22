package ControlFlowPractices.level2;

import java.util.Scanner;

public class GreatestFactorFor {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gf = 1;

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                gf = i;
                break;
            }
        }

        System.out.println("Greatest factor = " + gf);
        sc.close();
    }
    
}
