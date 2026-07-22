import java.util.Scanner;

public class CodingGuild {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Rank: ");
        int rank = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Membership Fees: ");
        float membershipFees = sc.nextFloat();

        double bonus = salary * 0.12;
        int annualBonus = (int) bonus;

        System.out.println("\nWelcome to Coding Guild");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Membership Fees: " + membershipFees);
        System.out.println("Annual Bonus: " + annualBonus);
    }
}