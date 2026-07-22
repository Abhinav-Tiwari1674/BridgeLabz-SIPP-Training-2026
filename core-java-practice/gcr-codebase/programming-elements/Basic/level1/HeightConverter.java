package level1;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        double totalInches = heightCm / 2.54;

        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightCm);
        System.out.println("Height in feet is " + feet);
        System.out.println("Height in inches is " + inches);
    }
}
