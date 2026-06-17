package JavaString.level2;

import java.util.Random;
import java.util.Scanner;

public class StudentGrade {
        // Generate random 2-digit marks (40–99 range for realism)
    public static int[][] genMarks(int n) {
        Random r = new Random();
        int[][] m = new int[n][3];
        for (int i=0;i<n;i++) {
            m[i][0] = 40 + r.nextInt(60); // Physics
            m[i][1] = 40 + r.nextInt(60); // Chemistry
            m[i][2] = 40 + r.nextInt(60); // Maths
        }
        return m;
    }

    // Calculate total, avg, % (rounded to 2 digits)
    public static double[][] calcRes(int[][] m) {
        double[][] res = new double[m.length][3];
        for (int i=0;i<m.length;i++) {
            int tot = m[i][0] + m[i][1] + m[i][2];
            double avg = tot/3.0;
            double per = (tot/300.0)*100;

            res[i][0] = tot;
            res[i][1] = Math.round(avg*100.0)/100.0;
            res[i][2] = Math.round(per*100.0)/100.0;
        }
        return res;
    }

    // Assign Grade by percentage
    public static String getGrade(double per) {
        if (per >= 80) return "A";
        if (per >= 70) return "B";
        if (per >= 60) return "C";
        if (per >= 50) return "D";
        if (per >= 40) return "E";
        return "R"; // Remedial
    }

    // Display Scorecard in Tabular format
    public static void showCard(int[][] m, double[][] r) {
        System.out.println("\nPhy\tChem\tMath\tTotal\tAvg\tPer\tGrade");
        for (int i=0;i<m.length;i++) {
            String g = getGrade(r[i][2]);
            System.out.println(m[i][0]+"\t"+m[i][1]+"\t"+m[i][2]+"\t"+
                               (int)r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]+"\t"+g);
        }
    }

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = genMarks(n);      // Generate PCM
        double[][] res = calcRes(marks);  // Total, Avg, Per
        showCard(marks, res);             // Display table
    }
    
}
