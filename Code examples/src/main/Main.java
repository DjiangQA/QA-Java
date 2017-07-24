package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;


import main.Day_Enums.Day;

public class Main {

	public static void main(String[] args) {
		Hashmap();
		
		Enums();
		
		Overloading(12,false);

	}
	
	public static void Hashmap ()
	{
		HashMap<Integer,String> map = new HashMap<>();
		//make a array!!!
		
		
		map.put(1, "name1");
		map.put(2, "name2");
		map.put(3, "name3");
		map.put(4, "name4");
		
		//System.out.println(map.get(1));
		//System.out.println(map.get(2));
		
		Set set = map.entrySet();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key is:"+ mentry.getKey() + " value is:"+mentry.getValue());
		}
		
				
	}
	
	public static void Enums ()
	{
		Day day = Day.MONDAY;
		if (day == Day.FRIDAY)
		{
			System.out.println("its FRIDAY!");
		}
		else
		{
			System.out.println("Its not FRIDAY...");
		}
	}
	
	public static void Overloading(int value)
	{
		System.out.println("Your numb is:" + value);
	}
	
	public static void Overloading(int value, boolean state)
	{
		System.out.println("Your number is:" + value + " and state is:"+ state);
	}
	
	
	
	

}
