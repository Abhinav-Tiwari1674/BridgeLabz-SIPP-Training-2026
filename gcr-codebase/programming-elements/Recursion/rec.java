// package gcr-codebase.recursion;

// public // {
    
// }


//reverse a string using recursion
package gcr-codebase.recursion;
public class rec {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str; // Base case: empty string
        }
        // Recursive case: last character + reverse of the rest of the string
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}