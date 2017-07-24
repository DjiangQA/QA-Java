package main;

public class Q6Conditionals {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		boolean multi = false;
		
		System.out.println(cal(a,b,false));

	}
	
	public static int cal (int a, int b, boolean multi)
	{
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
