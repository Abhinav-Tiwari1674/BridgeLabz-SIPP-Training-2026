import java.util.Scanner;
public class Maximum69Number {
    public static long maximum69Number(long num) {
        long temp =num;
        long place = 0;
        long multiplier = 1;
        while (temp > 0) {
            long digit = temp % 10;
            if (digit == 6) {
                place = multiplier;
            }
            multiplier *= 10;
            temp /= 10;
        }
        return num +(3*place);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        System.out.println("Maximum Number = "+maximum69Number(num));
    }
}
