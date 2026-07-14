import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
    int id;
    int attendance;

    Employee(int id, int attendance) {
        this.id = id;
        this.attendance = attendance;
    }
}

public class EmployeeAttendanceRanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        System.out.println("Enter Employee IDs:");
        int[] ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        System.out.println("Enter Attendance Percentages:");
        for (int i = 0; i < n; i++) {
            int attendance = sc.nextInt();
            emp[i] = new Employee(ids[i], attendance);
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Arrays.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                if (e1.attendance != e2.attendance) {
                    return e2.attendance - e1.attendance; // Descending attendance
                }

                return e1.id - e2.id; // Ascending Employee ID
            }
        });

        System.out.println("Top " + k + " Employees:");

        for (int i = 0; i < k; i++) {
            System.out.print(emp[i].id + " ");
        }

        sc.close();
    }
}