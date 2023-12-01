public class BankAccount {
    // Attributes
    private int accountNumber;
    private double balance;

    // constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // setter and getter
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("$" + amount + " Withdrawal is successfully");
        } else {
            System.out.println("your balance is " + this.balance + "you can't withdraw $" + amount);
        }
    }

    // Deposit method
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("$" + amount + " Deposited successfully");
    }

}
