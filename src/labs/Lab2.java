package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lab2 
{
	public static void main(String[] args) 
	{
		ArrayList<String[]> transactions =new ArrayList<String[]>();
		String fileName = "C:\\Users\\Awais computers\\eclipse-workspace\\files\\CSVStatement.csv";
		String dataRow;		
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
		
		for(String[] transaction : transactions)
		{
			System.out.print("[");
			for(String field:transaction)
			{
				System.out.print(field );
			}
			System.out.println("]");
			
		}
	
	}

}
