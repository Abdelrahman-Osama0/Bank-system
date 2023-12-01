public class SavingAccount extends BankAccount{
    private double interestRate;
    // Constructor
    public SavingAccount(int accountNumber , double balance , double interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void calculateInterestRate(){
        double interest=this.getBalance()*this.interestRate/100;
        System.out.println("Your interest is $"+interest);
    }
}
