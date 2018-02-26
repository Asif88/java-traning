package labs;

public class BankAccountApp
{
	public static void main(String[] args) 
	{
		BankAccount acc1=new BankAccount("456", 1000);
		BankAccount acc2=new BankAccount("789", 1200);
		BankAccount acc3=new BankAccount("123", 2000);
		
		acc1.setName("Asif");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accure();
		System.out.println(acc1.toString());
	}
}
class BankAccount implements IInterest
{
	//Properties of bank account
	private static int id=1000;
	private String accountNumber;
	private static final String routingNumber="005400567";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit)
	{
		System.out.println("New Account Created");
		balance=initDeposit;
		this.SSN = SSN;
		id++;
		setAccountNumber();
	}
	private void setAccountNumber()
	{
		int random=(int) (Math.random()*100);
		accountNumber = id + "" + random + SSN.substring(0,2) ;
		System.out.println("Your Account Number: " + accountNumber);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void payBill(double amount)
	{
		balance= balance-amount;
		System.out.println("Paybill "+ amount);
		showBalance();
	}
	public void makeDeposit(double amount)
	{
		System.out.println("Making deposit"+ amount);
		balance=balance+amount;
		showBalance();
	}
	public void showBalance()
	{
		System.out.println("Balance:" + balance);
	}
	
	@Override
	public void accure()
	{
		balance = balance*(1+rate/100);
		showBalance();
	}
	public String toString()
	{
		return "[Name: "+ name + "]\n[Account Number: " + accountNumber + "]\n" + "[Rounting Number: " + routingNumber + "]\n" + "[Balance :" + balance + "]\n";
	}
}
