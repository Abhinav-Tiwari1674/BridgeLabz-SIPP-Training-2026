package JavaString.level2;

import java.util.Scanner;

public class RockPaperScessiorGame {
      // computer choice
    public static String compChoice() {
        int n = (int)(Math.random()*3);
        if (n==0) return "Rock";
        if (n==1) return "Paper";
        return "Scissors";
    }

    // decide winner
    public static int chkWin(String usr, String cmp) {
        if (usr.equals(cmp)) return 0; // draw
        if ((usr.equals("Rock") && cmp.equals("Scissors")) ||
            (usr.equals("Paper") && cmp.equals("Rock")) ||
            (usr.equals("Scissors") && cmp.equals("Paper"))) return 1;
        return -1; // comp wins
    }

    // show results
    public static void showRes(int uWin, int cWin, int tot) {
        double uPer = (uWin*100.0)/tot;
        double cPer = (cWin*100.0)/tot;
        System.out.println("\nStats:");
        System.out.println("User Wins: " + uWin);
        System.out.println("Comp Wins: " + cWin);
        System.out.println("Draws: " + (tot-uWin-cWin));
        System.out.printf("User Win%%: %.2f\n", uPer);
        System.out.printf("Comp Win%%: %.2f\n", cPer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter games count: ");
        int g = sc.nextInt();

        int uWin=0, cWin=0;
        for (int i=1; i<=g; i++) {
            System.out.print("\nGame " + i + " - Enter Rock/Paper/Scissors: ");
            String usr = sc.next();
            String cmp = compChoice();
            int res = chkWin(usr, cmp);

            System.out.println("Computer: " + cmp);
            if (res==0) System.out.println("Result: Draw");
            else if (res==1) { System.out.println("Result: You Win"); uWin++; }
            else { System.out.println("Result: Computer Wins"); cWin++; }
        }

        showRes(uWin, cWin, g);
    }
    
}
