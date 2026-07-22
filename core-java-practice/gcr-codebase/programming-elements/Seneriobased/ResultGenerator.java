
import java.util.Scanner;


public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        int average = total / 5;
        int gradeCode = average / 10;

        System.out.println("Average = " + average);

        switch(gradeCode) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;

            case 8:
                System.out.println("Grade B");
                break;

            case 7:
                System.out.println("Grade C");
                break;

            case 6:
                System.out.println("Grade D");
                break;

            default:
                System.out.println("Fail");
        }
    }
}