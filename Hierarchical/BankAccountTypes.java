class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Checking");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount;
    int durationInMonths;

    FixedDepositAccount(int accountNumber, double balance, double maturityAmount, int durationInMonths) {
        super(accountNumber, balance);
        this.maturityAmount = maturityAmount;
        this.durationInMonths = durationInMonths;
    }

    @Override
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Fixed Deposit");
        System.out.println("Maturity Amount: " + maturityAmount);
        System.out.println("Duration: " + durationInMonths + " months");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount(12345, 5000, 2.3);
        BankAccount b2 = new CheckingAccount(23456, 10000, 1500);
        BankAccount b3 = new FixedDepositAccount(34567, 20000, 25000, 12);
        b1.displayAccountType();
        b2.displayAccountType();
        b3.displayAccountType();
    }
}
