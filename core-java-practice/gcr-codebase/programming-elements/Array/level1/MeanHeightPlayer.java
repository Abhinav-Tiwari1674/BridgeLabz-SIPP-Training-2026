package ArrayPracticeQuestions.level1;

import java.util.Scanner;

public class MeanHeightPlayer {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] h = new double[11];
        double sum = 0;

        System.out.println("Enter heights of 11 players:");
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextDouble();
            sum += h[i];
        }

        double mean = sum / h.length;
        System.out.println("Mean Height = " + mean);

        sc.close();
    }
 

}
