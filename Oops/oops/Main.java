
//Design a simple BankAccount class that models real-world banling behavior. 
// Each account should store basic details like account number, holdr name, and balance.
//  You will implement methods to deposit and withdraw money, enuring that withdrawals don't exceed the available balance. The class should also keep track of how many accounts have been created using a static variabe. Finally, create multiple accounts and simulate transactions to observe how the system behaves.

// Key Points
// Create a class with accountNumber, holder, and balance
// Implement deposit() and withdraw() with proper balance check;
// Add getStatement() to display account details
// Use a static variable to count total accounts created
// Create 3 accounts and perform 5 transactions on each

class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited ₹" + amount);
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        } else {
            System.out.println(holder + " - Insufficient Balance");
        }
    }

    void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("101", "Amit", 10000);
        BankAccount a2 = new BankAccount("102", "Rahul", 15000);
        BankAccount a3 = new BankAccount("103", "Priya", 20000);

        // 5 Transactions for Account 1
        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);

        // 5 Transactions for Account 2
        a2.deposit(3000);
        a2.withdraw(2000);
        a2.deposit(1000);
        a2.withdraw(500);
        a2.deposit(1500);

        // 5 Transactions for Account 3
        a3.deposit(5000);
        a3.withdraw(3000);
        a3.deposit(2000);
        a3.withdraw(1000);
        a3.deposit(500);

        // Statements
        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("\nTotal Accounts Created: "
                + BankAccount.totalAccounts);
    }
}