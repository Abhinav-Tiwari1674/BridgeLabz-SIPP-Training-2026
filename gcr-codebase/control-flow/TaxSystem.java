import java.util.Scanner;

public class TaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] income = new double[10];
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income of Citizen " + (i + 1) + ": ");
            income[i] = sc.nextDouble();

            double tax;
            String bracket;

            if (income[i] < 10000) {
                tax = income[i] * 0.05;
                bracket = "5% Tax Bracket";
            } 
            else if (income[i] <= 50000) {
                tax = income[i] * 0.15;
                bracket = "15% Tax Bracket";
            } 
            else {
                tax = income[i] * 0.30;
                bracket = "30% Tax Bracket";
            }

            System.out.println("Citizen " + (i + 1));
            System.out.println("Income : " + income[i]);
            System.out.println("Bracket: " + bracket);
            System.out.println("Tax    : " + tax);
            System.out.println();

            totalTax += tax;
        }

        System.out.println("Total Tax Collected = " + totalTax);

        sc.close();
    }
}