package main;

public class Q11IterationArray2 {

	public static void main(String[] args) {
	int a = 1;
	int d = 0;
	int []x = new int [10];
	
	for (int i = 0; i < 10; i++)
	{
		x[i] = a++;
		System.out.println(x[i]);
	}
	
	for (int y = 0; y < 10; y ++)
	{
		int b = x [y];
		int c = b*10;
		x[d] = c;
		System.out.println(x[d]);
		d++;
	}

	}

}
