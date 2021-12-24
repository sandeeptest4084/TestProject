public class currentAccount extends savingsAccount
{
	double charges;
	double balance;
	double amount;
	double lessamount;
	
	public currentAccount(double initialAmount,  String name){
		super(initialAmount,  name);
		this.balance = initialAmount;
		
	}
	public void deposit(double amount){
		this.balance = balance + amount;
	}

	public void withdraw(double amount){
		this.charges = 200;
		this.balance = balance  - amount - charges;
	}
	
	public void transfer( double amount){
		this.charges = 200;	
		lessamount = amount + charges;
		this.balance = this.balance - lessamount;		
			
	}

	public double CheckBalance(){
		return balance;
	}
}

	
