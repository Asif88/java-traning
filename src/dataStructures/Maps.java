package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Maps 
{
	public static void main(String[] args) 
	{
		//Import Map Interfaces
		Map<Integer,String> hMap=new TreeMap<Integer,String>();
		mapUtil(hMap);
		
	}
	public static void mapUtil(Map<Integer,String> map)
	{
		//1 Add key values pairs
		map.put(500,"Asif");
		map.put(200,"Asad");
		map.put(300,"Fahad");
		map.put(100,"Atif");
		map.put(400,"Ahmer");
		
		//2. Expose access Elements
		System.out.println("See all the keys" + map.keySet());
		System.out.println("See all the key value apirs" + map);
		System.out.println(map.get(500));
		
		//3.Itrate through map of key value pairs
		for(int key:map.keySet())
		{
			System.out.println("[Key: " + key + "Value: " + map.get(key) + " ]");
		}
	}
}
