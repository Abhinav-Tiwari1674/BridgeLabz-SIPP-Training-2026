package ArrayPracticeQuestions.level1;

import java.util.Scanner;

public class MulTable {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = n * (i + 1);
            System.out.println(n + " * " + (i + 1) + " = " + tab[i]);
        }

        sc.close();
    }
    
}
