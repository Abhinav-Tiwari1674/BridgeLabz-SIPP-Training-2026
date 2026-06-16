// Build a 'Math Wizard' utility class: isPrime(n), factorial(n) using
// iteration, fibonacci(n), gcd(a,b), lcm(a,b), and power(base, exp).
// Overload factorial to also accept double. Demonstrate scope
// differences between local and instance variables.
import java.util.Scanner;
class MathWizard {
    static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2;i<= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    static int factorial(int n) {
        int result = 1;
        for(int i = 2;i <= n; i++) {
            result *= i;
        }
        return result;
    }
    static double factorial(double n) {
        double result = 1.0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    static double power(double base, int exp) {
        double result = 1.0;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String arga[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n)); 
        System.out.println(factorial(n));
        System.out.println(factorial(5.0));
        System.out.println(fibonacci(n));
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
        double base = sc.nextDouble();
        int exp = sc.nextInt();
        System.out.println(power(base, exp));
        

    }
}