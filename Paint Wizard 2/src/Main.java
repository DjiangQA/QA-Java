import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Paint  cheapoMax = new Paint("cheapoMax", 19.99,20.0,10.0);
	static Paint averageJoe = new Paint("averageJoe", 17.99,15.0,11.0);
	static Paint duluxourousPaints = new Paint("duluxourousPaints",25.0,10.0,20.0);
	
	static int roomSize;
	static String result4;
	static String result5;
	static String Q1;
	
	static double litreneeded1;
	static double litreneeded2;
	static double litreneeded3;
	
	static double ans1;
	static double ans2;
	static double ans3;
	
	public static void main(String[] args) 
	{
		
		ArrayList<Paint> Paints = new ArrayList<Paint>();
		Paints.addAll(Arrays.asList(cheapoMax, averageJoe, duluxourousPaints));
		
		Scanner reader = new Scanner(System.in); 
		System.out.print("Please enter the room size: ");
		roomSize = reader.nextInt();
		System.out.print("1");
		System.out.println(Task1());
		System.out.print("2");
		System.out.println(Task2());
		System.out.print("3");
		System.out.println(Task3());
		
	}
	
	public static String Task1 ()
	{
		litreneeded1 = roomSize/cheapoMax.coverage ;
		litreneeded2 = roomSize/averageJoe.coverage ;
		litreneeded3 = roomSize/duluxourousPaints.coverage ;
		
		
		if (litreneeded1 > litreneeded2 & litreneeded1 > litreneeded3)
		{
			Q1 = "cheapoMax";
		}
		else if (litreneeded2 > litreneeded1 & litreneeded2 > litreneeded3)
		{
			Q1 = "averageJoe";
		}
		else if (litreneeded3 > litreneeded1 & litreneeded3 > litreneeded2)
		{
			Q1 = "duluxourousPaints";
		}
		
		return Q1;
	}
	
	public static String Task2()
	{
		
		ans1 = litreneeded1 / cheapoMax.litre;
		ans2 = litreneeded2 / averageJoe.litre;
		ans3 = litreneeded3 / duluxourousPaints.litre;
		
		
		if (ans1 > ans2 & ans1 > ans3)
		{
			result4 = cheapoMax.Name;
		}
		else if (ans2 > ans1 & ans2 > ans3)
		{
			result4 = averageJoe.Name;
		}
		else if (ans3 > ans2 & ans3 > ans1)
		{
			result4 = duluxourousPaints.Name;
		}
		
		return result4;
	}
	
	public static String Task3()
	{
		
		double ans4 = ans1*cheapoMax.price;
		double ans5 = ans2*averageJoe.price;
		double ans6 = ans3*duluxourousPaints.price;
		
		
		if (ans4 > ans5 & ans4 > ans6)
		{
			result5 = cheapoMax.Name;
		}
		else if (ans5 > ans4 & ans5 > ans6)
		{
			result5 = averageJoe.Name;
		}
		else if (ans6 > ans4 & ans6 > ans5)
		{
			result5 = duluxourousPaints.Name;
		}
		
		return result5;
	}

}
