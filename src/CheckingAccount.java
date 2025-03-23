public class CheckingAccount extends BankAccount {
    static double interestRate = .08;

    public void processWithdrawal(double amount){
        if(amount > balance){
            balance -= (amount+30);
            System.out.println("\nOverdraft. $30 has been charged to your account.");
        }
        else {
            balance -= amount;
        }
        System.out.println("New Balance: " + balance);
    }
    public void displayAccount(){
        super.accountSummary();
        System.out.println("Interest Rate: " + (interestRate*100) + "%");
    }
}
