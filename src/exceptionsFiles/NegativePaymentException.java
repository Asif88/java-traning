package exceptionsFiles;

public class NegativePaymentException extends Exception 
{
	double payment;
	public NegativePaymentException (double payment)
	{
		this.payment=payment;
	}
	public String toString()
	{
		return "ERROR: Cannot take Negative payment: "+ payment;
	}
	
}
