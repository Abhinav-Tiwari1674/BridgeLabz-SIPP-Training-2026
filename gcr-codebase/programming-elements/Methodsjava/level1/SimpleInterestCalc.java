package JavaMethods.level1;

import java.util.Scanner;

public class SimpleInterestCalc {
  
    public static double findSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double si = findSI(p, r, t);
        System.out.println("Simple Interest = " + si +" for P=" + p + ", R=" + r + ", T=" + t);
    }
}
