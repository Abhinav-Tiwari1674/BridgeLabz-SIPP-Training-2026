package ArrayPracticeQuestions.level2;

import java.util.Scanner;

public class StudentGradesTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Arrays for marks, percentages, and grades
        int[][] marks = new int[n][3];   // Physics, Chemistry, Maths
        double[] percent = new double[n];
        String[] grade = new String[n];

        // Step 3: Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print("Enter marks in " + subject + ": ");
                int mark = sc.nextInt();

                // Validate marks
                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Enter again.");
                    j--; // retry same subject
                    continue;
                }

                marks[i][j] = mark;
            }

            // Step 4: Calculate percentage from 2D array
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percent[i] = total / 3.0;

            // Step 5: Assign grade
            if (percent[i] >= 80) {
                grade[i] = "A";
            } else if (percent[i] >= 70) {
                grade[i] = "B";
            } else if (percent[i] >= 60) {
                grade[i] = "C";
            } else if (percent[i] >= 50) {
                grade[i] = "D";
            } else if (percent[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-12s %-6s%n",
                "Physics", "Chemistry", "Maths", "Total", "Percent", "Grade");

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-12d %-12.2f %-6s%n",
                    marks[i][0], marks[i][1], marks[i][2], total, percent[i], grade[i]);
        }

        sc.close();
    }
    
}
