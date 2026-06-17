package JavaString.level2;

import java.util.Random;
import java.util.Scanner;

public class VoteCheck {
       // generate random ages
    public static int[] genAge(int n) {
        Random r = new Random();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = 10 + r.nextInt(90); // random 2-digit
        }
        return arr;
    }

    // check eligibility
    public static String[][] chkVote(int[] arr) {
        String[][] res = new String[arr.length][2];
        for (int i=0;i<arr.length;i++) {
            res[i][0] = String.valueOf(arr[i]);
            res[i][1] = (arr[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return res;
    }

    // show table
    public static void showTab(String[][] arr) {
        System.out.println("Age\tVote?");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of students: ");
        int n = sc.nextInt();

        int[] ages = genAge(n);
        String[][] out = chkVote(ages);

        showTab(out);
    }
}
