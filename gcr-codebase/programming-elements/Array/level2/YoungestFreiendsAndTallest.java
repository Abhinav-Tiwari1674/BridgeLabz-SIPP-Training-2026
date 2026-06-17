package ArrayPracticeQuestions.level2;

import java.util.*;

public class YoungestFreiendsAndTallest{   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] ht = new int[3];

        // input ages & heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i] + ": ");
            ht[i] = sc.nextInt();

            if (age[i] <= 0 || ht[i] <= 0) {
                System.out.println("Invalid input, try again.");
                i--; // repeat this friend
            }
        }

        // find youngest
        int minAge = age[0], idxAge = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                idxAge = i;
            }
        }

        // find tallest
        int maxHt = ht[0], idxHt = 0;
        for (int i = 1; i < 3; i++) {
            if (ht[i] > maxHt) {
                maxHt = ht[i];
                idxHt = i;
            }
        }

        // output
        System.out.println("\nYoungest: " + names[idxAge] + " (Age: " + minAge + ")");
        System.out.println("Tallest: " + names[idxHt] + " (Height: " + maxHt + ")");

        sc.close();
    }

}
