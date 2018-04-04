package dataStructures;

import java.util.ArrayList;

public class list
{
	public static void main(String[] args) 
	{
		//1. Crate a collection
		ArrayList<String> cities=new ArrayList<String>();
		
		//2. Add some Elements
		cities.add("lahore");
		cities.add("ISB");
		cities.add("Multan");
		cities.add("Karachi");
		
		//3.itterate the collection 
		 for(String city: cities)
		 {
			 System.out.println(city);
		 }
		 
		 //4.Get the size
		 int size= cities.size();
		 System.out.println("Total Number of cities: " + size);
		 
		 //5. Retrieve Specific Elements
		 System.out.println(cities.get(2));
		 
		 //6. Remove
		 cities.remove(1);
		 size=cities.size();
		 System.out.println("Now the total Number of cities after delete: " + size);
		 for(String city: cities)
		 {
			 System.out.println(city);
		 }
		
	}

}
