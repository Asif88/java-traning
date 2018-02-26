package oop;

public class BankAccount implements IRate
{
	String acountThumber;
	private static final String routingNumber="13579";
	private String name;
	String ssn;
	String accountType;
	double balance=10000;
	
	BankAccount()
	{
		System.out.println("New Bank Acoount");
	}
	BankAccount(String accountType)
	{
		System.out.println("The Account is " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit)
	{
		System.out.println("The Account is " + accountType);
		System.out.println("Deposit Ammount is : $" + initDeposit);
		String msg=null;
		if(initDeposit<1000)
		{
			msg="ERROR: Minimum deposit atleast 1000";
		}
		else
		{
			msg="you Deposit your amount";
		}
		System.out.println(msg);
		balance= balance+initDeposit;
	}
	
	void chkBalance()
	{
		System.out.println("Your current balance is : $" + balance );
	}
	public String toString()
	{
		return name + " " + accountType + " balance : $" + balance; 
	}
	
	public void deposit(double amount)
	{
		balance =balance + amount;
		showActivity("deposit");
	}
	
	public void withDraw(double amount)
	{
		balance =balance + amount;
		showActivity("With Draw");
	}
	private void showActivity(String activity)
	{
		System.out.println("Your Recent Transaction " + activity);
		System.out.println("Your new Balance is " + balance);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setRate()
	{
		System.out.println("set rate");
	}
	public void increaseRate()
	{
		System.out.print("Increase rate");
	}
	
}
