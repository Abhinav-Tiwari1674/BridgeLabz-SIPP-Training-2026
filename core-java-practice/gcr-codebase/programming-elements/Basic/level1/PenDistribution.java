package level1;

import java.util.Scanner;

public class PenDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Pens: ");
        int pens = sc.nextInt();

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int pensPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " +
                pensPerStudent +
                " and the remaining pen not distributed is " +
                remainingPens);
    }
}
