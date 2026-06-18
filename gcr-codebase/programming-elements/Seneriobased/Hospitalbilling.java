// A hospital billing system must never crash. Wrap division-by-zero 
// (bills with zero items), array out-of-bounds (invalid patient index), 
// and number format exceptions (bad input) with meaningful 
// messages. Create a custom InsufficientFundsException for payment 
// failures


import java.util.Scanner;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Hospitalbilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of items: ");
            int items = sc.nextInt();
            System.out.println("Enter the total bill amount: ");
            double billAmount = sc.nextDouble();
            System.out.println("Enter the payment amount: ");
            double payment = sc.nextDouble();

            if (items == 0) {
                throw new ArithmeticException("Cannot divide by zero - no items in the bill.");
            }

            if (payment < billAmount) {
                throw new InsufficientFundsException("Payment failed - insufficient funds.");
            }

            double change = payment - billAmount;
            System.out.println("Payment successful. Change: " + change);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index - please check the patient list.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input - please enter numeric values for items, bill amount, and payment.");
        } finally {
            sc.close();
        }
    }
}