class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + " - " + name;
    }
}
public class HashMap{
    public static void main(String[] args) {
        java.util.HashMap<Integer, Student> map = new java.util.HashMap<>();
        map.put(101, new Student(101, "Abhinav"));
        map.put(102, new Student(102, "Raj"));
        map.put(103, new Student(103, "Simran"));
        System.out.println("Student with ID 102: " + map.get(102));
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        map.remove(103);
        System.out.println("After removing ID 103: " + map);
    }
}
