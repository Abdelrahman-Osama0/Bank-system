public class Main {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(1, 5000, 10);

        s.calculateInterestRate();
        s.deposit(5000);
        System.out.println(s.getBalance());
        s.calculateInterestRate();
        s.withdraw(5000);
        System.out.println(s.getBalance());

        System.out.println("***************************************************");
        CurrentAccount c = new CurrentAccount(2 , 5000, 500 );

        System.out.println(c.getBalance());
        c.withdraw(5000);
        System.out.println(c.getBalance());

        c.withdraw(100);
        System.out.println(c.getBalance());

        c.withdraw(600);
        System.out.println(c.getBalance());

        c.withdraw(400);
        System.out.println(c.getBalance());

        c.deposit(2000);
        System.out.println(c.getBalance());

        System.out.println("***************************************************");
        FixedDepositAccount f = new FixedDepositAccount(3 , 4000, 10 , 24 );
        System.out.println(f.getBalance());

        f.calculateInterestRate();
        f.withdraw(2000);
        System.out.println(f.getBalance());


        f.deposit(2000);
        System.out.println(f.getBalance());
        f.calculateInterestRate();

        f.setFixedTerm(0);
        f.withdraw(4000);
        System.out.println(f.getBalance());





    }
}