import java.util.*;
class BankCust{
	static class Account{
		private static int accCounter = 1000;
		private int accNum;
		private double balance;
		private Bank bank;
		
		public Account(Bank bank){
			this.bank = bank;
			this.accNum = accCounter++;
			this.balance = 0.0;
		}
		public int getAccountNumber(){
			return accNum;
		}
		public double getBalance(){
			return balance;
		}
		public void deposit(double amount){
			balance += amount;
		}
	}
	static class Customer{
		private String name;
		private List<Account> accounts;
		public Customer(String name){
			this.name = name;
			this.accounts = new ArrayList<>();
		}
		public String getName(){
			return name;
		}
		public void addAccount(Account account){
			accounts.add(account);
		}
		public void viewBalance(){
			if(accounts.isEmpty()){
				System.out.println(name + " has no accounts.");
				return;
			}
			System.out.println("Balances for this "+name+" are: ");
			for(Account acc : accounts){
				System.out.println("Account "+acc.getAccountNumber()+" : "+acc.getBalance());
			}
		}
	}
	static class Bank{
		private String bankName;
		
		public Bank(String bankName){
			this.bankName = bankName;
			
		}
		public void openAccount(Customer customer, double initialDeposit){
			Account newAcc = new Account(this);
			newAcc.deposit(initialDeposit);
			customer.addAccount(newAcc);
			System.out.println("Account opened for " + customer.getName() + " with initial deposit " + initialDeposit);
		}
		
	}
	public static void main(String[] args){
		Bank myBank = new Bank("SBI");
		Customer alice = new Customer("Alice");
		Customer elina = new Customer("Elina");
		myBank.openAccount(alice, 1000);
		myBank.openAccount(elina, 2000);
		myBank.openAccount(elina, 4000);
		System.out.println();
        alice.viewBalance();
        System.out.println();
        elina.viewBalance();
	}
}