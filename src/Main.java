public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Brian", "Fernando", 10001, 5000);

        account1.accountSummary();

        System.out.println();
        account1.withdrawal(2000);
        account1.accountSummary();

        CheckingAccount account2 = new CheckingAccount();

        System.out.println();
        account2.setFirstName("David");
        account2.setLastName("Banos");
        account2.setAccountID(10002);
        account2.deposit(100);
        account2.displayAccount();

        account2.processWithdrawal(200);
        System.out.println();
        account2.displayAccount();
    }
}