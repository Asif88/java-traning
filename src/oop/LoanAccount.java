package oop;

public class LoanAccount implements IRate{

	public void setRate()
	{
		System.out.println("Set");
	}

	@Override
	public void increaseRate() {
		
		System.out.println("Increase");

	}
	public void setTerm(int term)
	{
		System.out.println("new terms are here " + term + "years");
	}
	public void setSchedule()
	{
		System.out.println("New Schedule");
	}
}
