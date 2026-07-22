class UserName {

    static boolean isValid(String s, int i) {
        if (i == s.length()) {
            return true;
        }

        char ch = s.charAt(i);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return isValid(s, i + 1);
    }

    public static void main(String[] args) {
        String s = "abcdxyz";

        System.out.println(isValid(s, 0));
    }
}
