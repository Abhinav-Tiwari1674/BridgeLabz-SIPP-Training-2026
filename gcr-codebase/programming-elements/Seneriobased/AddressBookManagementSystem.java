// Build an Address Book Management System that stores contact details such as name, phone number, and email address. Design the application using multiple Java Collections to achieve efficient storage, searching, and duplicate prevention. Your program should support the following functionalities:
// Store all contacts in an ArrayList to maintain an ordered list.
// Use a HashMap<String, Contact> for quick lookup of contacts by name.
// Use a HashSet to ensure that duplicate phone numbers cannot be added.
// Implement functionality to add, search, delete, and display contacts.
// Display all contacts sorted alphabetically by name using Collections.sort().
// Ensure that whenever a contact is added or deleted, all three collections remain synchronized and contain consistent data.


import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email ;







    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    @Override
    public int compareTo(Contact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ",Phone: " +phone + ", Email: " + email;
    }
}

public class AddressBookManagementSystem {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();
    static Scanner sc = new Scanner(System.in);
    static void addContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name.toLowerCase(), c);
        phoneSet.add(phone);

        System.out.println("Contact Added.");
    }

    static void searchContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine().toLowerCase();

        Contact c = map.get(name);

        if (c != null)
            System.out.println(c);
        else
            System.out.println("Contact Not Found.");
    }

    static void deleteContact() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine().toLowerCase();

        Contact c = map.get(name);

        if (c == null) {
            System.out.println("Contact Not Found.");
            return;
        }

        contacts.remove(c);
        map.remove(name);
        phoneSet.remove(c.phone);

        System.out.println("Contact Deleted.");
    }

    static void displayContacts() {
        Collections.sort(contacts);

        if (contacts.isEmpty()) {
            System.out.println("No Contacts.");
            return;
        }

        for (Contact c : contacts)
            System.out.println(c);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    displayContacts();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}