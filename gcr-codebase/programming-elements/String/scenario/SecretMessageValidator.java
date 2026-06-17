import java.util.Scanner;

public class SecretMessageValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret code: ");
        String code = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        boolean strong = (digits >= 2) && (special >= 1) && (code.length() >= 8);

        System.out.println("\n----- Detailed Report -----");
        System.out.println("Total Length      : " + code.length());
        System.out.println("Vowels            : " + vowels);
        System.out.println("Consonants        : " + consonants);
        System.out.println("Digits            : " + digits);
        System.out.println("Special Characters: " + special);

        if (strong) {
            System.out.println("Code Strength     : Strong");
        } else {
            System.out.println("Code Strength     : Weak");
        }

        sc.close();
    }
}