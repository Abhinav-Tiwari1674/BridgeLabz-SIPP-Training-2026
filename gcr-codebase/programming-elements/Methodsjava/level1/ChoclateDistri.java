package JavaMethods.level1;

import java.util.Scanner;

public class ChoclateDistri {
    public class ChocolateApp {

    public static int[] distribute(int ch, int kids) {
        int each = ch / kids;
        int rem = ch % kids;
        return new int[]{each, rem};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates: ");
        int ch = sc.nextInt();
        System.out.print("Enter children: ");
        int kids = sc.nextInt();

        int[] res = distribute(ch, kids);
        System.out.println("Each child gets " + res[0] + 
                           ", Remaining = " + res[1]);
    }
}
