package JavaMethods.level1;

import java.util.Scanner;

public class AtheleteRunning {
     public static double rounds(double a, double b, double c, double d) {
        double peri = a + b + c;
        return d / peri;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side3: ");
        double c = sc.nextDouble();

        double r = rounds(a, b, c, 5000); // 5 km = 5000 m
        System.out.println("Athlete needs " + Math.ceil(r) + " rounds.");
    }
}
