public class StringExample {
public static void main(String[] args) {
    String str = "Hello, World!";
    System.out.println(str);


    String s = "Hello";
    System.out.println(s.length());



    String s1 = "Hello";
    System.out.println(s1.charAt(1));

    for (int i = 0; i < s1.length(); i++) {
        System.out.println(s1.charAt(i));
    }



    String s2 = "Hello";
    String s3 = "Hello";
    System.out.println(s2 == s3); // true, because of string interning
    System.out.println(s2.equals(s3)); // true, because content is the same




    String S = "hello";
    String upper = S.toUpperCase();
    System.out.println(upper); // Output: HELLO
    // string immutable hoti hai, to original string change nahi hoti, new string create hoti hai


    String s4 = "Hello";
    String result ="";
    for (int i = s4.length() - 1; i >= 0; i--) {
        result += s4.charAt(i);
    }
    System.out.println(result);





    //pallidrome check

    String s5 ="madam";
    String rev = "";
    for (int i=s5.length() - 1; i >= 0; i--) {
        rev += s5.charAt(i);
    }
    if(s5.equals(rev)) {
        System.out.println("Palindrome");
    } else{
        System.out.println("Not Palindrome");
    }



    String s10 = "hello";
    char[] charArray = s10.toCharArray();
    for (char c : charArray) {
        System.out.println(c);
    }





    String s6 = "Hello, World!";
    System.out.println(s6.contains("World")); // true



    





}
}
