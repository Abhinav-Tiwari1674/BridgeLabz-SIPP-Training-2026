package level1;

import java.util.Scanner;

public class HarryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Birth Year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter Current Year: ");
        int currentYear = sc.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Harry's age is " + age);
    }
}