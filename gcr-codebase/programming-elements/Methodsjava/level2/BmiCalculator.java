package JavaMethods.level2;

import java.util.Scanner;

public class BmiCalculator {
      public static double getBMI(double w, double h) {
        h = h / 100.0; // cm to m
        return w / (h * h);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg): ");
            arr[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm): ");
            arr[i][1] = sc.nextDouble();
            arr[i][2] = getBMI(arr[i][0], arr[i][1]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": W=" + arr[i][0] +
                    " H=" + arr[i][1] + " BMI=" + arr[i][2] +
                    " Status=" + getStatus(arr[i][2]));
        }
        sc.close();
    }
    
}
