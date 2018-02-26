package oop;

public class BankAccountApp 
{

	public static void main(String[] args) 
	{
		BankAccount acc1 = new BankAccount();
		//acc1.name="Asif";
		acc1.acountThumber="1230";
		acc1.deposit(3000);
		acc1.withDraw(3000);
		acc1.setName("Muhammad Asif");
		System.out.println(acc1.getName());
		acc1.setSsn("2222222");
		System.out.println(acc1.getSsn());
		System.out.println(acc1.toString());
		acc1.setRate();
		acc1.increaseRate();
		
		/*BankAccount acc2 = new BankAccount("Current Account");
		
		BankAccount acc3 = new BankAccount("Deposit Account", 500);
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
		acc3.chkBalance();
		
		CdAccount cd1=new CdAccount();
		cd1.balance=400;
		cd1.name="asif";
		cd1.accountType="cd account";
		System.out.println(cd1.toString());
		cd1.compound(); */
		
		
		
	
	}

}
