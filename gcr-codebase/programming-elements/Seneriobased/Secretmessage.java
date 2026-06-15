import java.util.Scanner;

public class Secretmessage {
    public static void main(String[] args) {
        Scanner sc=new Secretmessage();
        System.out.println("Enter a message: ");
        String message=sc.nextLine();
        //Counts vowels, consonants, digits, and special characters.
        int vowels=0, consonants=0, digits=0, special=0;
        for(int i=0; i<message.length(); i++) {
            char ch=message.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                vowels++;
            } else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
                consonants++;
            } else if(ch>='0' && ch<='9') {
                digits++;
            } else {
                special++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);

        //Determines whether the code is "Strong" or "Weak" based on:
        // At least 2 digits
        // At least 1 special character
        // Minimum length of 8
        if(digits>=2 && special>=1 && message.length()>=8) {
            System.out.println("The message is Strong.");
        } else {
            System.out.println("The message is Weak.");
        }

    }


}
