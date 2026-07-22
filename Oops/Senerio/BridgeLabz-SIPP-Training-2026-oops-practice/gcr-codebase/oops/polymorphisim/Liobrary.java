package gcr-codebase.polymorphisim;

// Superclass
class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    void calculateFine(int overdueDays) {
        System.out.println("Fine");
    }

    void printDetails() {
        System.out.println("Name : " + memberName);
        System.out.println("ID   : " + memberId);
    }
}

// Subclass 1
class StudentMember extends LibraryMember {

    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    void calculateFine(int overdueDays) {
        System.out.println("Student Fine = ₹" + (overdueDays * 2));
    }
}

// Subclass 2
class FacultyMember extends LibraryMember {

    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    void calculateFine(int overdueDays) {
        System.out.println("Faculty Fine = ₹" + (overdueDays * 1));
    }
}

// Subclass 3
class GuestMember extends LibraryMember {

    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    void calculateFine(int overdueDays) {
        System.out.println("Guest Fine = ₹" + (overdueDays * 5));
    }
}

// Main class
public class Liobrary {

    static void findMember(LibraryMember[] members, String id) {

        for (LibraryMember m : members) {

            if (m.memberId.equals(id)) {
                System.out.println("\nMember Found:");
                m.printDetails();
                return;
            }
        }

        System.out.println("Member Not Found");
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
            new StudentMember("Amit", "S101"),
            new FacultyMember("Rahul", "F201"),
            new GuestMember("Neha", "G301")
        };

        int overdueDays = 5;

        // Dynamic Method Dispatch
        for (LibraryMember m : members) {
            m.printDetails();
            m.calculateFine(overdueDays);
            System.out.println();
        }

        // Search by ID
        findMember(members, "F201");
    }
}
