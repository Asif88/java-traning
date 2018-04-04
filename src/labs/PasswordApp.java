package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordApp {

	public static void main(String[] args) 
	{
		//1. Read the Password File
		String fileName= "C:\\Users\\Awais computers\\eclipse-workspace\\files\\passwords.txt";
		String[] passwords =new String[10];
		
		File file=new File(fileName);
				
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(file));
			for(int i=0;i<passwords.length;i++)
			{
				passwords[i]=br.readLine();
			} 			
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("Error: File not found ");
		}
		catch (IOException e) {
			System.out.println("ERROR: Could not read the data ");
		}
		for(String password: passwords)
		{
			System.out.println("*****\n"+password+"\n");
			boolean hasNumber = false;
			boolean hasCharacter = false;
			boolean hasSpecialCharacter = false;
			boolean hasInvalidCharacter=false;
			for(int n=0;n<password.length();n++)
			{
				
				//Condition 1: Contains Number
				if("0123456789".contains(password.substring(n,n+1)))
				{
					hasNumber = true;
					//System.out.println("Position: " +n +"contains  number");
				}
				//Condition 2: contains letter
				else if("qwertyuiopasdfghjklzxcvbnm".contains(password.substring(n,n+1).toLowerCase()))
				{
					hasCharacter = true;
					//System.out.println("Position: " +n +" contains character");
				}
				//Condition 3: Contains Special character
				else if("!@#$().,[]{}-_+=|".contains(password.substring(n,n+1)))
				{
					hasSpecialCharacter = true;
					//System.out.println("Position: " +n +" contains  Special character");
				}
				else
				{
					try 
					{
						throw new InvalidCharException(password.substring(n,n+1));
					} 
					catch (InvalidCharException e) 
					{
						e.toString();
					}
				}
			}
			//Test & Exception Handling
			try
			{
				if(!hasNumber)
				{
					throw new NumberCriteriaException(password);
				}
				else if(!hasCharacter)
				{
					throw new LetterCriteriaException(password);
				}
				else if(!hasSpecialCharacter)
				{
					throw new SpecialCharException(password);
				}
				else
				{
					System.out.println("valid Password");
				}
				
			}
			catch(NumberCriteriaException | LetterCriteriaException | SpecialCharException e)
			{
				System.out.println("Invalid password");
				System.out.println(e.toString());
			}
		}
	}
}
class InvalidCharException extends Exception
{
	String ch;
	public InvalidCharException(String ch)
	{
		this.ch=ch;
	}
	public String toString()
	{
		return "Invalid Character Exception" +ch;
	}
}
class NumberCriteriaException extends Exception
{
	String password;
	public NumberCriteriaException(String password)
	{
		this.password=password;
	}
	public String toString()
	{
		return "Invalid Number Exception " +password;
	}
}
class LetterCriteriaException extends Exception
{
	String password;
	public LetterCriteriaException(String password)
	{
		this.password=password;
	}
	public String toString()
	{
		return "Invalid Character Exception " + password;
	}
}
class SpecialCharException extends Exception
{
	String password;
	public SpecialCharException(String password)
	{
		this.password=password;
	}
	public String toString()
	{
		return "Invalid Special Character Exception " + password;
	}
}
