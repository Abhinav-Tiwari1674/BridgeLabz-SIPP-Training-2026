class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

class Student extends Person {
    final int studentId;
    double gpa;

    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age +
                ", studentId=" + studentId + ", gpa=" + gpa + "]";
    }
}

class GradStudent extends Student {
    String thesis;

    public GradStudent(String name, int age, int studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return "GradStudent [name=" + name + ", age=" + age +
                ", studentId=" + studentId + ", gpa=" + gpa +
                ", thesis=" + thesis + "]";
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Amit", 22, 101, 8.9,
                "Artificial Intelligence");

        System.out.println(gs);

        // Demonstrating IS-A relationship
        System.out.println("\nIS-A Relationship:");

        if (gs instanceof Student) {
            System.out.println("GradStudent IS-A Student");
        }

        if (gs instanceof Person) {
            System.out.println("GradStudent IS-A Person");
        }
    }
}