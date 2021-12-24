class TestBank
{
	public static void main(String[] Args){
		BankAccount B1 = new BankAccount(500, "sai");
		System.out.println("The  Balance  in Account sai is..." +  B1.CurrentBalance());
		BankAccount B2 = new BankAccount(200, "teja");
		System.out.println("The  Balance  in Account teja is..." +  B2.CurrentBalance());
		B1.withdraw(200);
		B2.deposit(1000);
		System.out.println("The  Balance after wiyhdraw in Account sai is..." +  B1.CurrentBalance());
		System.out.println("The  Balance after deposit in Account teja is..." +  B2.CurrentBalance());
		B2.transfer(500,B1);
		System.out.println("The total Balance in Account sai is..." +  B1.CurrentBalance());
		System.out.println("The total Balance in Account teja is..." +  B2.CurrentBalance());
	}
}