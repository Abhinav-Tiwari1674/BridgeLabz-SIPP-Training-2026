import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> p = new Pair<>("Amit", 101);
        p.display();

        System.out.println();

        // Stack
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Pop: " + s.pop());

        s.display();

        System.out.println();

        // Generic Method
        Integer[] arr = {12, 55, 9, 78, 44};

        System.out.println("Maximum = " + Utility.findMax(arr));

        System.out.println();

        // Repository
        Repository<Student> repo = new Repository<>();

        repo.add(new Student(1, "Amit"));
        repo.add(new Student(2, "Rahul"));

        repo.display();

        System.out.println();

        // Wildcard
        List<String> names = Arrays.asList("Java", "Python", "C++");

        Utility.printList(names);
    }
}