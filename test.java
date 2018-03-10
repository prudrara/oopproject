package oopproject;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount account = new SavingsAccount(1011, 1000, "active", 1234, "rudra");
		
		account.withdraw(200);
		System.out.println("AccountNo:"+ account.accountNumber);
		System.out.println("Balance"+ account.balance);
		/* account.accountNumber = 1011;
		account.balance =1000;
		
		account.status = "active";
		account.pin = 1234;
		account.branch= "rudra"; */
		
		SavingsAccount account2 = new SavingsAccount(1012, 10011,"active", 123412, "rudrarae" );
		account.withdraw(123412, 2000);
		System.out.println("AccountNo:"+ account2.accountNumber);
		System.out.println("Balance"+ account2.balance);
	/*	account2.accountNumber = 1012;
		account2.balance =10011;
		
		account2.status = "active";
		account2.pin = 123412;
		account2.branch= "rudrarae";  */
		System.out.println("Int Rate: "+ SavingsAccount.getInterestRate());
			
	}

}
