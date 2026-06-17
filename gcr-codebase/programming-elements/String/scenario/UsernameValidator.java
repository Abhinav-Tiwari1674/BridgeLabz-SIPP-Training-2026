
import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        if (username.contains(" ")) {
            System.out.println("Username contains spaces.");
        } else {
            System.out.println("Username does not contain spaces.");
        }
        
        System.out.println("Total characters: " + username.length());
        System.out.println("Uppercase username: " + username.toUpperCase());
        String reversed = new StringBuilder(username).reverse().toString();
        if (username.equalsIgnoreCase(reversed)) {
            System.out.println("Username is a palindrome.");
        } else {
            System.out.println("Username is not a palindrome.");
        }
    }
}