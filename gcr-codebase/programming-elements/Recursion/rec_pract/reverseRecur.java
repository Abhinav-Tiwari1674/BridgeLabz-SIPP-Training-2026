package rec_pract;

class reverseRecur {

    static String rev(String s) {
        if (s.length() <= 1) {
            return s;
        }

        return rev(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(rev(s));
    }
}