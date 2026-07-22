package JavaString.level1;

public class NullPoinExcep {
 
       // Method to generate NullPointerException (unhandled)
    public static void generateException() {
        String text = null;  // variable initialized to null
        // Calling a method on null object -> NullPointerException
        System.out.println("Length of string: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;  // variable initialized to null
        try {
            // This will throw NullPointerException
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("--- Generating Exception ---");
        try {
            generateException();   // unhandled inside, but caught here
        } catch (Exception e) {
            System.out.println("Program stopped abruptly: " + e);
        }

        System.out.println("\n--- Handling Exception ---");
        handleException();   // handled safely
    }
}
