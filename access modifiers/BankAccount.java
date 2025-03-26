public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
		
    }
	public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123456", "John Doe", 1000.0);
        System.out.println("Account number: " + savings.accountNumber);
        savings.displayAccountInfo();
        savings.deposit(500.0);
        savings.withdraw(200.0);
        savings.displayAccountInfo();
    }
}

class SavingsAccount extends BankAccount {
    
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    
    
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder: " + accountHolder); 
        System.out.println("Balance: $" + getBalance()); 
    }
}
