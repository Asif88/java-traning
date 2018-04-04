package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		//1.Define the file that we want to read
		String fileName= "C:\\Users\\Awais computers\\eclipse-workspace\\files\\fileToRead.txt";
		String text =null;
		//2.Create the file in java
		File file=new File(fileName);
		
		//3.open the file
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			
			//4.Read the file			
			text = br.readLine();
		}		
		catch (FileNotFoundException e) {
			System.out.println("Error: File not found " +fileName);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			System.out.println("ERROR: Could not read the data " + fileName);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finished reading the  file");
		}
		System.out.println(text);
	}

}
