public class FixedDepositAccount extends SavingAccount {
    private int fixedTerm;

    public FixedDepositAccount(int accountNumber, double balance, double interestRate, int fixedTerm) {
        super(accountNumber, balance, interestRate);
        this.fixedTerm = fixedTerm;
    }

    public int getFixedTerm() {
        return fixedTerm;
    }

    public void setFixedTerm(int fixedTerm) {
        this.fixedTerm = fixedTerm;
    }

    @Override
    public void withdraw(double amount) {
        if (fixedTerm == 0) {
            super.withdraw(amount);
        } else {
            System.out.println("You can't withdraw until the " + this.fixedTerm + " period ends");
        }
    }
}
