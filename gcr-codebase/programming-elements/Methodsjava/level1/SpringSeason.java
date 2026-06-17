package JavaMethods.level1;

public class SpringSeason {
      public static boolean isSpring(int m, int d) {
        if (m == 3 && d >= 20) return true;
        if (m == 4 || m == 5) return true;
        if (m == 6 && d <= 20) return true;
        return false;
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        if (isSpring(m, d)) 
            System.out.println("Its a Spring Season");
        else 
            System.out.println("Not a Spring Season");
    }
}
