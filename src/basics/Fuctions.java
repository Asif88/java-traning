package basics;

public class Fuctions {
	public static void main(String[] args)
	{
		System.out.println("Program is Starting");
		print();
		int num1=20;
		int num2= 10;
		add(num1, num2);
		int product=multiplication(num1, num2);
		System.out.println("Product is " + product);
	}
	static void print()
	{
		System.out.println("Functions are very difficult");
	}
	static void add(int value1, int value2)
	{
		int sum= value1+value2;
		System.out.println("sum of " + value1 + " and " + value2 + " is " + sum);
	}
	static int multiplication(int valueA, int valueB)
	{
		int product = valueA * valueB;
		return product;
	}
}
