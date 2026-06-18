package rec_pract;


 public class TowerOfHanoi {

    static void toh(int n, char s, char h, char d) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + s + " to " + d);
            return;
        }

        toh(n - 1, s, d, h);

        System.out.println("Move disk " + n + " from " + s + " to " + d);

        toh(n - 1, h, s, d);
    }

    public static void main(String[] args) {

        int n = 3;

        toh(n, 'A', 'B', 'C');
    }
}