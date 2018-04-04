package dataStructures;

public class Arrays 
{
	public static void main(String[] args)
	{
		//Single Array
		String[] alphabet = {"a","b","c","d","e"};
		System.out.println("Using for loop");
		for(int i=0; i<5; i++)
		{
			System.out.print(alphabet[i] + " ");
			
		}
		System.out.println("\nUsing for Leangth case");
		int size= alphabet.length;
		for(int n=0; n< size; n++)
		{
			System.out.print(alphabet[n] + " ");
		}
		System.out.println("\nUsing for each method");
		for(String letter : alphabet)
		{
			System.out.print(letter + " ");
		}
		
		//Double array
		String[][] users=
			{
					{"asif","Riaz","asif.riaz.1994@gmail.com","03474885927"},
					{"asad","Riaz", "asad@gmail.com","03025212702"},
					{"fahad","riaz","fahdriaz@gmail.com","03045915837"}
			};
			System.out.println("\ndouble array using for loops");
			int numOfUsers= users.length;
			int numOfFields=users[0].length;
			System.out.println("Length of Users: " + numOfUsers);
			System.out.println("number Of Fields: " + numOfFields);
			for(int i=0;i<numOfUsers;i++)
			{
				for(int j=0;j<numOfFields;j++)
				{
					System.out.println(users[i][j]);
				}
				
			}
			for(int i=0;i<numOfUsers;i++)
			{
				String firstName= users[i][0];
				String lastName= users[i][1];
				String email= users[i][2];
				String number= users[i][3];
				System.out.println(firstName + " " + lastName + " " + email + " " + " " + number);
			}
			
			
			System.out.println("\n \nDouble array Using for each\n");
			for(String[] user:users)
			{
				System.out.print("[ ");
				for(String field:user)
				{
					System.out.print(field + "");
				}
				System.out.println(" ]");
			}
	}

}
