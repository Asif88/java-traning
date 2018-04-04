package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write 
{
	public static void main(String[] args)
	{
		//1.Define the path that we want to write
		String fileName= "C:\\Users\\Awais computers\\eclipse-workspace\\files\\fileToWrite.txt";
		String message="I am writing data that will be placed to file";
		
		//2.Create the file in java
		File file=new File(fileName);
		
		//3.open the file
		try {
			FileWriter fw = new FileWriter(file);
			//4.write to the file
			fw.write(message);
			
			//5.close the resources
			fw.close();
		} catch (IOException e) {
			System.out.println("Error: Could not read the file" + fileName);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Closing the file Writer");
		}
		
		
	}

}
