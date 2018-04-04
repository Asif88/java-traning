package exceptionsFiles;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) 
	{
		double payment=0;
		boolean positivePymt=true;	
		do 
		{
			//1. Ask the User for Input
			System.out.print("Enter the payment Amount: ");
			//2. Get the amount and test the value
			Scanner in=new Scanner(System.in);
			
			//3. Handle Exceptions appropriately
			try 
			{
				payment =in.nextDouble();
				if(payment<0)
				{
					throw new NegativePaymentException (payment);
				}
				else
				{
					positivePymt=true;
				}
			}
			catch(NegativePaymentException  e) 
			{
				System.out.println(e.toString());
				System.out.println("Please Try Again");
				positivePymt=false;
			}
		}while(!positivePymt);
		//4. Print Confirmation
		System.out.println("Thank you for your payemnt is: $"+ payment);
		
		
	}

}
