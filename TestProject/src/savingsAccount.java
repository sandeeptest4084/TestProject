public class savingsAccount extends BankAccount
{
	double intrest;
	double balance;
	double amount;
	public savingsAccount(double initialAmount,  String name){
		super(initialAmount,  name);
		this.balance = initialAmount;
		
	}
	public void deposit(double amount){
		this.intrest = amount * 0.3;
		this.balance = balance + amount + intrest;
	}

	public void addAmountFromcurrentAccount(double amount){
		
		this.intrest = amount * 0.3;
		this.balance=intrest+amount+balance;
	}

	public double CheckBalance(){
		return balance;
	}
}

	
