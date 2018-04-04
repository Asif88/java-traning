package labs;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV 
{

	public static void main(String[] args) 
	{
		ArrayList<String[]> transactions =new ArrayList<String[]>();
		String fileName = "C:\\Users\\Awais computers\\eclipse-workspace\\files\\CSVStatement.csv";
		String dataRow;
		double balance=0;
		try 
		{
			//open the file
			BufferedReader br =new BufferedReader(new FileReader(fileName));
			// read the file
			while((dataRow =br.readLine()) != null)
			{
				String[] line= dataRow.split(",");
				transactions.add(line);
			}
			
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DATE | TANSACTION | VENDOR | AMOUNT | BALANCE");
		for(String[] transaction : transactions)
		{
			String date= transaction[0];
			String type= transaction[1];
			String vendor= transaction[2];
			Double  amount=Double.parseDouble(transaction[3]);
			System.out.println(date + "| " + "  "+ type + "|      "+ vendor + "$   |" + amount);
			
			if(type.equalsIgnoreCase("credit"))
			{
				//System.out.println("Add to balance");
				balance= balance+amount;
			}
			else if(type.equalsIgnoreCase("debit"))
			{
				//System.out.println("Subtruct from balance");
				balance=balance-amount;
			}
			else
			{
				//System.out.println("Some other transaction");
			}
			System.out.print(" " + balance + "\n");
		}
		if(balance>0)
		{
			System.out.println("you have a balance of " + balance);
			System.out.println("you are a charged a 10% fee of " + balance*.10);
			System.out.println("Your new balance is" + balance *1.1);
		}
		else if(balance <0)
		{
			System.out.println("thanks for your payments");
			System.out.println("you have over payment of" + balance);
		}
		else 
		{
			System.out.println("thanks for your payment");
		}
	}

}
