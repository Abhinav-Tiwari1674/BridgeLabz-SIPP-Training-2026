package JavaMethods.level2;

import java.util.Scanner;

public class StudentVoteChecker {
      public static boolean canVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + ": " +
                    (canVote(ages[i]) ? "Can Vote" : "Cannot Vote"));
        }
        sc.close();
    }
}
