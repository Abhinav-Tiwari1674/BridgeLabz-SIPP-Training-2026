package ControlFlowPractices.level3;

import java.util.Scanner;

public class GradeCalc {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int math = sc.nextInt();

        // Compute average percentage
        double avg = (phy + chem + math) / 3.0;

        // Determine grade & remarks
        String grade, remark;

        if (avg >= 80) {
            grade = "A";
            remark = "Level 4, above agency-normalized standards";
        } else if (avg >= 70) {
            grade = "B";
            remark = "Level 3, at agency-normalized standards";
        } else if (avg >= 60) {
            grade = "C";
            remark = "Level 2, below, but approaching agency-normalized standards";
        } else if (avg >= 50) {
            grade = "D";
            remark = "Level 1, well below agency-normalized standards";
        } else if (avg >= 40) {
            grade = "E";
            remark = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remark = "Remedial standards";
        }

        // Output results
        System.out.println("\nAverage Marks: " + avg + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);

        sc.close();
    }
    
}
