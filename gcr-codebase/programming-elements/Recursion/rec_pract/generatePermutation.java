package rec_pract;


class generatePermutation {

    static void perm(String s, String ans) {

        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            String left = s.substring(0, i);
            String right = s.substring(i + 1);

            perm(left + right, ans + ch);
        }
    }

    public static void main(String[] args) {

        perm("ABC", "");
    }
}