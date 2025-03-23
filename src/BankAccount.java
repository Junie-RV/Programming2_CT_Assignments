public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    protected double balance;

    BankAccount(){
        balance = 0;
    }

    BankAccount(String firstName, String lastName, int accountID, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdrawal(double amount){
        if(amount > 0 && amount < balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void accountSummary(){
        System.out.println(firstName + " " + lastName);
        System.out.println("AccountID: " + accountID);
        System.out.println("Balance: $" + balance);
    }
}
