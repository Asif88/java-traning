package basics;

public class Strings {

	public static void main(String[] args) 
	{
		String bookTitle;
		String wordChoice ="Ring";
		bookTitle="the lord of the Ring";
		
		if(bookTitle.contains(wordChoice))
		{
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser ="Chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("The browser is chrome");
		}
		
		String firstName="Asif";
		String lastName="Riaz";
		String SSN="03474885927";
		
		System.out.println("There are " + SSN.length() + " digits in the SSN");
		System.out.println("There are " + firstName.length() + " digits in the First name");
		
		System.out.println(firstName.substring(0,4));
		System.out.println(lastName.substring(0,4));
		System.out.println(SSN.substring(4));
		
	}

}
