package oop;

public class CdAccount extends BankAccount implements IRate {
	
	String intrestRate;
	void compound()
	{
		System.out.println("Compunding Intrest");
	}

}
