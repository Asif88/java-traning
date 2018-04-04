package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracitceWrite {

	public static void main(String[] args) {
		//1.Define the path that we want to write
		String fileName="C:\\Users\\Awais computers\\eclipse-workspace\\files\\write.txt";
		String message="practise makes a man perfect";
		
		//2.Create the file in java
		File file = new File(fileName);
		
		//3.open the file
		 
		try {
			FileWriter fw = new FileWriter(file);
			
			//4.write to file
			fw.write(message);
			
			//5.closeing the file
			fw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("close the file write");
		}
	}

}
