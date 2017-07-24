package main;

public class Q9Arrays {

	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		boolean multi = false;
		int [] x = new int [10];
		
		for (int i = 0; i < 10 ; i ++)
		{
			x[i] =cal(a,b,false) ; 
			System.out.println(x[i]);
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
