
import java.util.Scanner;

public class MetroCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 200;
        int choice;

        do {
            System.out.println("\nBalance: " + balance);
            System.out.print("Enter distance (km): ");
            int distance = sc.nextInt();

            double fare = (distance <= 10) ? 20 : 40;

            if(balance >= fare) {
                balance -= fare;
                System.out.println("Fare Deducted: " + fare);
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
                break;
            }

            System.out.println("1. Continue");
            System.out.println("2. Quit");
            choice = sc.nextInt();

        } while(balance > 0 && choice == 1);
    }
}