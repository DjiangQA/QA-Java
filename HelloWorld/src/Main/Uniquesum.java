package Main;

public class Uniquesum {

	public static void main(String[] args) 
	{
		{
			int a = 3;
			int b = 3;
			int c = 3;
			int d = 0;
			
			if(a == b | b == a | b == c | c == b | a == c | c == a)
			{
				d = 0;
			}
			else if(a == b | b == a)
			{
				a = 0;
				b = 0;
				d = c;
			}
			else if (a == c | c == a)
			{
				a = 0;
				c = 0;
				d = b;
			}
			else if (b == c | c == b)
			{
				b = 0;
				c = 0;
				a = d;
			}
			else
			{
				d = a+b+c;
			}
			
			
			
			System.out.println(d);

		}

	}

}
