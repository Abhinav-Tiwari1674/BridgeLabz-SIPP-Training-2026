package JavaMethods.level3;

import java.util.Scanner;

public class CollinearPoints {
        // Method to check collinear using slope formula
    public static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // slope AB = (y2 - y1)/(x2 - x1)
        // slope BC = (y3 - y2)/(x3 - x2)
        // slope AC = (y3 - y1)/(x3 - x1)
        // Use cross multiplication to avoid division by zero
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinear using area of triangle
    public static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // area = 0.5 * | x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2) |
        double area = 0.5 * Math.abs(x1 * (y2 - y3) +
                                     x2 * (y3 - y1) +
                                     x3 * (y1 - y2));
        return area == 0;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1 y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3): ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check collinear using slope
        boolean collinearSlope = isCollinearSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("\nCollinear using slope method? " + collinearSlope);

        // Check collinear using area
        boolean collinearArea = isCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area method? " + collinearArea);

        sc.close();
    }
}
