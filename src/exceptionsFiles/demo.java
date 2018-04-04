package exceptionsFiles;

public class demo {

	public static void main(String[] args) {
		System.out.println("Program continuous");
		doMath(12,0);
		System.out.println("Esception Handling");
	}
	public static void doMath(int a,int b)
	{
		answer(a,b);
	}
	public static double answer(int x, int y)
	{
		return x/y;
	}

}
