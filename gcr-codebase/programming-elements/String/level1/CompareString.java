package JavaString.level1;

import java.util.*;

public class CompareString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String s1 = sc.next();

    System.out.print("Enter second string: ");
    String s2 = sc.next();

    boolean charCheck = true;
    if (s1.length() != s2.length()) {
        charCheck = false;
    } else {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                charCheck = false;
                break;
            }
        }
    }

    boolean builtCheck = s1.equals(s2);

    System.out.println("By charAt: " + charCheck);
    System.out.println("By equals(): " + builtCheck);

    sc.close();
    }
 
}
    
