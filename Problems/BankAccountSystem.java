class BankAccount {
    // Static variable shared by all accounts
    private static String bankName = "Central Bank";

    // Static counter to track total accounts
    private static int totalAccounts = 0;

    // Final variable - account number cannot change once assigned
    private final int accountNumber;

    // Instance variables
    private String accountHolderName;
    private double balance;

    // Constructor with 'this' to resolve ambiguity
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber; // 'this' differentiates from constructor parameter
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    // Public method to display account details with instanceof check
    public void displayAccountDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc = (BankAccount) obj;
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + acc.accountNumber);
            System.out.println("Account Holder: " + acc.accountHolderName);
            System.out.println("Balance: $" + acc.balance);
            System.out.println("-------------------------");
        } else {
            System.out.println("Invalid object type.");
        }
    }

    // Static method to display total accounts
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Aman", 500000);
        BankAccount acc2 = new BankAccount(102, "Adarsh", 300000);

        acc1.displayAccountDetails(acc1);
        acc2.displayAccountDetails(acc2);

        BankAccount.getTotalAccounts();
    }
}
