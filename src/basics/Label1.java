package basics;

public class Label1 {
	public static void main(String[] args)
	{
		System.out.println(sum(10));
		System.out.println("Factorial is " + fact(4));
		
		int[] numbers= {-657, 4,6,10000};
		System.out.println("min " + findmin(numbers));
		System.out.println("max " + findmax(numbers));
		System.out.println("averege " + avg(numbers));
	}
	public static int sum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			System.out.print(sum + " + " + i);
			sum= sum+i;			
			System.out.println(" = " + sum);
		}
		return sum;
	}
	public static int fact(int n)
	{
		
		if(n==0)
		{
			return 1;
		}
		
		return fact(n-1)*n;
		
	}
	
	public static int findmin(int[] arr)
	{
		int min = arr[0];
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i]<min)
			{
				min= arr[i];
			}
		}
		return min;
	}
	
	public static int findmax(int[] arr)
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max= arr[i];
			}
		}
		return max;
	}	
	public static int avg(int[] arr)
	{
		int sum=0;
		for(int n=0; n<arr.length; n++)
		{
			sum= sum+arr[n];
		}
		return sum;
	}

}
