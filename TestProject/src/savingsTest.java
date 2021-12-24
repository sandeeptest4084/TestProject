class savingsTest
{
	public static void main(String [] Args){
		savingsAccount S1 = new savingsAccount(2000,"saving");
		System.out.println("The amount in savings account ..." + S1.CheckBalance());
		S1.deposit(500);
		System.out.println("The amount in savings account ..." + S1.CheckBalance());


		currentAccount C1 = new currentAccount(2000, "current");
		System.out.println("The amount in current account ..." + C1.CheckBalance());
		C1.deposit(500);
		System.out.println("The amount in current account ..." + C1.CheckBalance());
		C1.withdraw(100);
		System.out.println("The amount in current account ..." + C1.CheckBalance());


		C1.transfer(500, S1);
		System.out.println("The amount in current account ..." + C1.CheckBalance());

		S1.addAmountFromcurrentAccount(500);
		System.out.println("The amount in savings account ..." + S1.CheckBalance());
	}
}