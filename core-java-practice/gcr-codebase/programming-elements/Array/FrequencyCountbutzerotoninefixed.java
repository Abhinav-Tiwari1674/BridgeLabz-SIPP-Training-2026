import java.util.Scanner;

public class FrequencyCountbutzerotoninefixed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("No. of elements in array: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the elements of the array (each between 0 and 9):");

        String input = sc.nextLine();

        String[] tokens = input.split("[,\\s]+");

        int[] frequency = new int[10];

        try {

            for (int i = 0; i < n; i++) {

                int value = Integer.parseInt(tokens[i]);

                if (value < 0 || value > 9) {
                    System.out.println("Only numbers between 0 and 9 are allowed.");
                    return;
                }

                frequency[value]++;
            }

            System.out.println("\nDigit -> Frequency");

            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println(i + " -> " + frequency[i]);
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You entered fewer than " + n + " elements.");
        }

        sc.close();
    }
}