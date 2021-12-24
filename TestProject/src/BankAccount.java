public class BankAccount{
	double balance;
	String name;
	double initialAmount;
	
	public BankAccount(double initialAmount, String name){
		this.balance = initialAmount;
		this.name = name;
	}
	
	public void deposit(double amount){
		this.balance = balance + amount;
		
	}
		
	public void withdraw(double amount){
		this.balance = balance  - amount;
		
	}
	
	public void transfer( double amount,BankAccount name){		
		this.balance = this.balance - amount;	
		name.balance =name.balance + amount;		
	}
	
	public double CurrentBalance(){
		
		return balance;
	}
}
		