package JavaMethods.level3;

import java.util.Scanner;

public class DistanceAndLine {
    
    // Method to calculate Euclidean distance between two points
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope (m) and y-intercept (b) of line y = m*x + b
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // [slope, y-intercept]
        if (x2 == x1) {
            throw new IllegalArgumentException("Slope undefined for vertical line.");
        }
        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1;           // y-intercept
        result[0] = m;
        result[1] = b;
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coordinates of point A (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter coordinates of point B (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Euclidean distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("\nEuclidean Distance between A and B: %.4f\n", distance);

        // Equation of line
        try {
            double[] line = lineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.4fx + %.4f\n", line[0], line[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Equation of line: Vertical line (x = " + x1 + ")");
        }

        sc.close();
    }
}

