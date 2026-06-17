package ArrayPracticeQuestions.level1;

import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Checking number
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0)
                    System.out.println(arr[i] + " is Positive Even");
                else
                    System.out.println(arr[i] + " is Positive Odd");
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        // Compare first and last
        if (arr[0] == arr[arr.length - 1])
            System.out.println("First and Last are Equal");
        else if (arr[0] > arr[arr.length - 1])
            System.out.println("First > Last");
        else
            System.out.println("First < Last");

        sc.close();

    }
    
}
