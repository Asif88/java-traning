package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets
{
	public static void main(String[] args)
	{
		//1.Define the Collection
		//Linked hash is used for order that they were entered
		//hash set is random number
		//tree is alphabet order
		Set<String> animals=new LinkedHashSet<String>();
		
		//2. Adding Elements
		animals.add("horse");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Tom");
		animals.add("Lion");
		System.out.println(animals);
		
		animals.add("Hen");
		animals.add("Sparrow");
		animals.add("Tom");
		System.out.println(animals);
		
		// Create a new that we used for comparison
		Set<String> farmAnimal=new HashSet<String>();
		farmAnimal.add("horse");
		farmAnimal.add("Tom");
		farmAnimal.add("Goat");
		
		// What is the Interection between animals and farm animals
		//1.copy existing into a new set
		Set<String> intersactionSet=new HashSet<String>(animals);
		//2. Retain all the elements that in the another set
		intersactionSet.retainAll(farmAnimal);
		System.out.println("the intersaction is :" + intersactionSet);
		
		//what is the union
		Set<String> unionSet=new HashSet<String>(animals);
		unionSet.addAll(farmAnimal);
		System.out.println("the union is :" + unionSet);
		
		//what is the difference
		Set<String> differenceSet=new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimal);
		System.out.println("the differnce is " + differenceSet);

	}

}
