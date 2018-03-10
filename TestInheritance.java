package oopproject;

public class TestInheritance {
	
	public static void main (String[] args)
	{
		JuniorSavingsAccount account = new JuniorSavingsAccount(1011,1000,"active",1234,"rudra","jack");
		account.accountNumber = 1011;
		account.balance =1000;
		
		account.status = "active";
		account.pin = 1234;
		account.branch= "rudra";
		account.withdraw(100);
		System.out.println("the balance is " + account.balance);
	}
	

}
