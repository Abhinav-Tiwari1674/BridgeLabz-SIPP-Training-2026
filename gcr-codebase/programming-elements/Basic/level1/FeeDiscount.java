package level1;

import java.util.Scanner;

public class FeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fee = 125000;
        double discountPercent = 10;

        double discount = fee * discountPercent / 100;
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount);
        System.out.println("The final discounted fee is INR " + discountedFee);
    }
}
