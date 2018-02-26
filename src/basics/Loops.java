package basics;

public class Loops {

	public static void main(String[] args)
	{
		String[] cities= {"Lahore", "karachi", "Multan", "ISB"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		String countries[];
		countries = new String[4];
		countries[0]="pakistan";
		countries[1]="Austrelia";
		countries[2]="Japan";
		countries[3]="germeny";
		System.out.println(countries[3]);
		
		String[] states = new String[5];
		states[0]= "New york";
		states[1]= "Washington";
		states[2]= "Miammi";
		states[3]= "Californa";
		states[4]= "tesex";
			
		
		int i=0;
		do
		{
			System.out.println("States " + states[i]);
			i=i+1;
			
		}while(i<5);
		
		int n=0;
		while(n<4)
		{
			System.out.println("Countries " + n + " " + countries[n]);
			n++;
		}
		
		for(int x=0; x<5; x++)
		{
			System.out.println("States " + states[x]);
		}
	}
	

}
