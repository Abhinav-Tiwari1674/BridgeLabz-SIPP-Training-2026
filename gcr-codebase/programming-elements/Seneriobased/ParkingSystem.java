package Seneriobased;
import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = 5;
        int occupied = 0;
        int choice;

        while(true) {

            System.out.println("\n1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    if(occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle Parked");
                    } else {
                        System.out.println("Parking Full");
                    }
                    break;

                case 2:
                    if(occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle Exited");
                    } else {
                        System.out.println("Parking Empty");
                    }
                    break;

                case 3:
                    System.out.println("Occupied Slots: " + occupied);
                    System.out.println("Available Slots: " + (capacity - occupied));
                    break;

                case 4:
                    System.out.println("System Closed");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}