package basics;

public class Weather 
{
	public static void main(String[] args) 
	{
		int temp = 65;
		String sunCondition = "overcast";
		if (temp > 80)
		{
			System.out.println("It is a pleasure wear t shrts and jeans");
		}
		else if((temp < 60) && (sunCondition == "overcast"))
		{
			System.out.println("Owsam day");
		}
		else if((temp < 80) || (sunCondition == "overcast"))
		{
			System.out.println("Averge day");
		}
		else
		{
			System.out.println("Looks like a cold day , Bring a Sweater");
		}
	}
}
