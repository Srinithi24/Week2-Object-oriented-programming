interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    
    public abstract void calculateInterest();
}


class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; 

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Savings interest " + interest + " added.");
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Savings Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
        System.out.println("Current account interest " + interest + " added.");
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Current Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 25000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Alice", 15000);
        BankAccount current = new CurrentAccount("CA456", "Bob", 30000);

        BankAccount[] accounts = {savings, current};

        for (BankAccount acc : accounts) {
            System.out.println("\nAccount Holder: " + acc.getHolderName());
            acc.deposit(1000);
            acc.withdraw(500);
            acc.calculateInterest();
            System.out.println("New Balance: " + acc.getBalance());

            if (acc instanceof Loanable) {
                Loanable loanable = (Loanable) acc;
                loanable.applyForLoan();
                System.out.println("Loan Eligibility: " + (loanable.calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
            }
        }
    }
}
