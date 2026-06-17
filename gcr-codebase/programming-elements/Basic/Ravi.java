import java.util.Scanner;

public class Ravi {

    public static void print() {
        System.out.print("Enter your name: ");
    }

    public static int bonus(int salary) {
        return (int)(salary * 0.12);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        print();
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter rank: ");
        String rank = sc.nextLine();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter membership fee: ");
        float membership = sc.nextFloat();

        int annualBonus = bonus(salary);


        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Membership: " + membership);
        System.out.println("Annual Bonus: " + annualBonus);

        sc.close();
    }
}