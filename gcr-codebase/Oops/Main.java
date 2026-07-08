import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks; 
    }
    @Override
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}
public class Main {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student(101, "Abhinav", 85);
        Student s2 = new Student(102, "Ravi", 75);
        Student s3 = new Student(103, "Neha", 90);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
    }
}
