package JavaMethods.level1;

import java.util.Scanner;

public class TrignometeryFunction {
    public class TrigApp {

    public static double[] calcTrig(double deg) {
        double rad = Math.toRadians(deg);
        return new double[]{
            Math.sin(rad),
            Math.cos(rad),
            Math.tan(rad)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double deg = sc.nextDouble();

        double[] res = calcTrig(deg);
        System.out.println("sin = " + res[0]);
        System.out.println("cos = " + res[1]);
        System.out.println("tan = " + res[2]);
    }
}
