//1. Username Validator 
//A company wants to validate usernames entered by users.
//Write a program that:
//Accepts a username.
//Checks whether it contains any spaces.
//Counts the total number of characters.
//Converts the username to uppercase.
//Displays whether the username is a palindrome.



import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = sc.nextLine();

        // Check for spaces
        if (username.contains(" ")) {
            System.out.println("Username contains spaces.");
        } else {
            System.out.println("Username does not contain spaces.");
        }
        int length = username.length();
        System.out.println("Total number of characters: " + length);
        String upperUsername = username.toUpperCase();
        System.out.println("Username in uppercase: " + upperUsername);
        String reversedUsername = new StringBuilder(username).reverse().toString();
        if (username.equalsIgnoreCase(reversedUsername)) {
            System.out.println("The username is a palindrome.");
        } else {
            System.out.println("The username is not a palindrome.");
        }
    }
}





