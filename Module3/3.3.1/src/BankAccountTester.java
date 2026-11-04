public class BankAccountTester {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("12345", 1000);
        BankAccount account2 = new BankAccount("67890", 500);

        account1.deposit(200);
        account1.withdraw(100);

        account2.deposit(300);
        account2.withdraw(1000);

        System.out.println();

        account1.displayAccount();

        System.out.println();

        account2.displayAccount();

        System.out.println();

        System.out.println("Total accounts: "
                + BankAccount.getTotalAccounts());
    }
}