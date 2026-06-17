package JavaMethods.level3;

import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {
     // Method to generate random PCM scores for students (2-digit scores)
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        Random rand = new Random();

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(51) + 50; // Physics 50-100
            scores[i][1] = rand.nextInt(51) + 50; // Chemistry 50-100
            scores[i][2] = rand.nextInt(51) + 50; // Maths 50-100
        }

        return scores;
    }

    // Method to calculate total, average, percentage and round to 2 decimal places
    public static double[][] calculateStats(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3]; // total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // Method to determine grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");

        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(stats[i][2]);
            String remarks = getRemarks(grade);

            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t\t%s\t%s\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grade, remarks);
        }
    }

    // Method to get remarks based on grade
    public static String getRemarks(String grade) {
        switch (grade) {
            case "A": return "Level 4, above agency-normalized standards";
            case "B": return "Level 3, at agency-normalized standards";
            case "C": return "Level 2, below, but approaching agency-normalized standards";
            case "D": return "Level 1, well below agency-normalized standards";
            case "E": return "Level 1-, too below agency-normalized standards";
            case "R": return "Remedial standards";
            default: return "";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        displayScorecard(scores, stats);

        sc.close();
    }
}
