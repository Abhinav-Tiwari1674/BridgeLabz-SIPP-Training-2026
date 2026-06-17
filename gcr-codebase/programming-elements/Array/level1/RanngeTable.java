package ArrayPracticeQuestions.level1;

import java.util.Scanner;

public class RanngeTable {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int n = 6; n <= 9; n++) {
            System.out.println("Table of " + n + ":");
            int[] tab = new int[10];

            for (int i = 0; i < tab.length; i++) {
                tab[i] = n * (i + 1);
                System.out.println(n + " * " + (i + 1) + " = " + tab[i]);
            }
            System.out.println();
        }

        sc.close();
    }

    
}
