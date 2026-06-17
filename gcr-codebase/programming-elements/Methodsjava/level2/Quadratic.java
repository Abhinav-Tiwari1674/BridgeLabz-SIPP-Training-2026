package JavaMethods.level2;

import java.util.Scanner;

public class Quadratic {
      public static double[] getRoots(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) return new double[0];
        else if (d == 0) return new double[]{-b / (2 * a)};
        else {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            return new double[]{r1, r2};
        }
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b c: ");
        double x = sc.nextDouble(), y = sc.nextDouble(), z = sc.nextDouble();
        double[] r = getRoots(x, y, z);
        if (r.length == 0) System.out.println("No Real Roots");
        else for (double v : r) System.out.println("Root=" + v);
        sc.close();
    }
}
