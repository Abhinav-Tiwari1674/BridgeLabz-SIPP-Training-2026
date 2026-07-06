import java.util.*;
public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Abhinav"));
        employees.add(new Employee(102, "Rohit"));
        employees.add(new Employee(103, "Priya"));
        for(Employee e : employees){
            System.out.println(e);
        }
  }
}
