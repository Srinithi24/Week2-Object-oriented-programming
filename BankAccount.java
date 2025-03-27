import java.util.Scanner;
class BankAccount{
	static String bankName = "SBI";
	static int count = 0;
	String accountHolderName;
	final int accountNumber;
	
	BankAccount(String accountHolderName, int accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		count++;
	}
	static int getTotalAccounts(){
		return count;
	}
	void displayDetails(){
		if(this instanceof BankAccount){
			System.out.println("Bank Name: "+bankName);
			System.out.println("Account holder: "+accountHolderName);
			System.out.println("Account Number: "+accountNumber);
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("How many accounts to be created: ");
		int num = scan.nextInt();
		BankAccount[] accounts = new BankAccount[num];
		for(int i =0; i<num; i++){
			System.out.print("Account holder name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Enter account number: ");
			int accNum = scan.nextInt();
			accounts[i] = new BankAccount(name, accNum);
		}
		for(BankAccount acc: accounts){
			acc.displayDetails();
		}
		System.out.println("Total accounts created: "+ BankAccount.getTotalAccounts());
		scan.close();
		
	}
}