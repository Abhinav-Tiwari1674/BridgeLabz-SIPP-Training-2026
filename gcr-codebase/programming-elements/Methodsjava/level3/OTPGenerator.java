package JavaMethods.level3;

import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
     // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // 100000 to 999999
    }

    // Method to check if array of OTPs is unique
    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) { // duplicate found
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated 10 OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean unique = areUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + unique);
    }
}
