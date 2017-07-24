package main;

public class Q10IterationArrays {
	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		boolean multi = false;
		
		for (int i = 0; i < 7; i ++)
		{
			System.out.println(cal(i,b,false));
		}
		
	}
	
	public static int cal (int a, int b, boolean multi)
	{
		if (a == 0 | b == 0)
		{
			return 1;
		}
		
		if (multi == false)
		{
			return a+b ;
		}
		else
		{
			return a*b ;
		}
		
	}
}
