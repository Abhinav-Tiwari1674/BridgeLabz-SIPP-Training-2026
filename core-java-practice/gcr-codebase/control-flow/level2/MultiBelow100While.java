package ControlFlowPractices.level2;

import java.util.Scanner;

public class MultiBelow100While {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i < 100) {
            if (i % n == 0) System.out.println(i);
            i++;
        }

        sc.close();
    }
    
}
