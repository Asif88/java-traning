package basics;

public class SaleryCalculater 
{
	public static void main(String[] args) 
	{
		String career;
		career = "Software Developer";
		System.out.println("Peogram is starting");
		System.out.println("My Career is: " + career);
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 42.50;
		career = "Web developer";
		double salery = hoursperweek * weeksperyear * rate;
		System.out.println("My salery as " + career + " at the rate of $" + rate + " per hous is $" + salery + " per year.");
		
	}

}
