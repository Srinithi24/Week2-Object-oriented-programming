import java.util.Scanner;
public class BankAccount{
	String accountHolder;
	int accountNumber;
	double balance;
	
	public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
    }
	public void deposit(double amount) {
		if(amount > 0){
			balance += amount;
			System.out.println("Deposited: " + amount);
		}
		
	}
	public void withdraw(double amount){
		if(amount <= balance){
			balance -= amount;
			System.out.print("Withdraw: "+amount);
		}else{
			System.out.println("Withdraw failed");
		}
	}
	public double balance(){
		return balance;
	}
	
	public void displayDetails() {
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance : " + balance);
		
		
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account Holder name: ");
		String accountHolder = scan.nextLine(); 
		System.out.print("Enter Account Number: ");
		int accountNumber = scan.nextInt(); 
		System.out.print("Enter balance: ");
		double balance =  scan.nextDouble();
		
		BankAccount b = new BankAccount(accountHolder, accountNumber, balance);
		b.displayDetails();
		System.out.print("Enter deposit amount: ");
		double depositAmt =  scan.nextDouble();
		b.deposit(depositAmt);
		System.out.println("New balance: "+ b.balance());
		System.out.print("Enter amount to withdraw: ");
        double withdrawAmt = scan.nextDouble();
        b.withdraw(withdrawAmt);
        System.out.println("Final balance: "+ b.balance());
	scan.close();
	}

}