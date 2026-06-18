//package gcr-codebase.recursion;

public class CountUnique {
    //count unique digits in a number using recursion in place
    public static int countUniqueDigits(int num, boolean[] seen) {
        if (num == 0) {
            return 0; // Base case: no more digits to process
        }
        
        int digit = num % 10; // Get the last digit
        int count = 0;
        if (!seen[digit]) {
            seen[digit] = true; // Mark this digit as seen
            count = 1; // Count this digit as unique
        }
        return count + countUniqueDigits(num / 10, seen); // Recur for the rest of the number
    }
    public static void main(String[] args) {
        int num = 1234567890;
        int uniqueCount = countUniqueDigits(num, new boolean[10]);
        System.out.println("Number of unique digits in " + num + " is: " + uniqueCount);
    }   
}



