public class BankAccount {

    private String accountNumber;
    private double balance;

    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Display account information
    public void displayAccount() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Return the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}