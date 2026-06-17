package JavaMethods.level2;

import java.util.Scanner;

public class QuadraticUsingMathFxn {
      // Method to compute roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;  // discriminant

        if (d < 0) { 
            return new double[0]; // no real roots
        } else if (d == 0) {
            return new double[]{ -b / (2 * a) }; // one root
        } else {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            return new double[]{ r1, r2 };
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No Real Roots");
        } else {
            for (int i = 0; i < roots.length; i++) {
                System.out.println("Root " + (i + 1) + " = " + roots[i]);
            }
        }

        sc.close();
    }
}
