package level1;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        double perimeter = 4 * side;

        System.out.println("The length of the side is " + side);
        System.out.println("The perimeter is " + perimeter);
    }
}
