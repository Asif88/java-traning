package exceptionsFiles;

public class CommonException {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Devided by zero");
			System.out.println(e.toString());
		}
		String[] states= {"LHR","MUL","BWP","RWP","ISB"};
		for(int i=0; i<=states.length; i++)
		{
			try {
			System.out.println(states[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ERROR: Index outside of an array");
				System.out.println(e.toString());
			}
		}
	}

}
