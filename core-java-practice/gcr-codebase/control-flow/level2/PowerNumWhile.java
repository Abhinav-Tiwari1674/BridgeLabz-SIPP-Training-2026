package ControlFlowPractices.level2;

import java.util.Scanner;

public class PowerNumWhile {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int res = 1, i = 1;

        while (i <= p) {
            res *= n;
            i++;
        }

        System.out.println(n + "^" + p + " = " + res);
        sc.close();
    }
}
