public class CurrentAccount extends BankAccount {
    private double overDraft;

    //constructor
    public CurrentAccount(int accountNumber, double balance, double overDraft) {
        super(accountNumber, balance);
        this.overDraft = overDraft;
    }

    //setter and getter
    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    private boolean checkOverDraft(double amount) {
        return ((this.getBalance() - amount) * -1 <= this.overDraft);
    }

    @Override
    public void withdraw(double amount) {
        if (this.checkOverDraft(amount)) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("You cannot withdraw $" + amount +
                    " because it will exceed the permitted overdraft value.");
        }
    }

}
