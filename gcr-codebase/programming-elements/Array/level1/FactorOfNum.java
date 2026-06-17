package ArrayPracticeQuestions.level1;

import java.util.Scanner;

public class FactorOfNum {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int max = 10;
        int[] fac = new int[max];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == fac.length) {
                    max *= 2;
                    int[] tmp = new int[max];
                    for (int j = 0; j < fac.length; j++) tmp[j] = fac[j];
                    fac = tmp;
                }
                fac[idx++] = i;
            }
        }

        System.out.println("Factors:");
        for (int i = 0; i < idx; i++) {
            System.out.print(fac[i] + " ");
        }

        sc.close();
    }
    
}
