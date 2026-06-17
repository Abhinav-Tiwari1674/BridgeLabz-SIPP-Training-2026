package level1;

import java.util.Scanner;

public class AveragePCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Physics Marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry Marks: ");
        int chemistry = sc.nextInt();

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam's average mark in PCM is " + average);
    }
}
