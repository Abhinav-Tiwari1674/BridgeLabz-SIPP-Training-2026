package JavaString.level2;

import java.util.Scanner;

public class SplitStringShortLong {
      public static String[] mySplit(String s) {
        return s.split(" ");
    }

    public static int getLen(String w) {
        return w.toCharArray().length;
    }

    public static String[] findMinMax(String[] arr) {
        String min = arr[0], max = arr[0];
        for (String w : arr) {
            if (getLen(w) < getLen(min)) min = w;
            if (getLen(w) > getLen(max)) max = w;
        }
        return new String[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String txt = sc.nextLine();

        String[] wrds = mySplit(txt);
        String[] res = findMinMax(wrds);

        System.out.println("Shortest: " + res[0]);
        System.out.println("Longest: " + res[1]);
    }
    
}
