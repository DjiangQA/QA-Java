package main;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//ArrayList peopleList = new ArrayList();
		
		//int itemCount = peopleList.size();
		
		//System.out.println(Dave.returninfo());
		//System.out.println(Jess.returninfo());
		//System.out.println(Alex.returninfo());
		//System.out.println(Dee.returninfo());
		Readerwriter RW = new Readerwriter();
		
		
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("1 to Write to file");
		System.out.println("2 to Read from file");
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		
		if(n == 1)
		{
			RW.Writer();
			System.out.println("Done");
		}
		else if (n == 2)
		{
			RW.Reader();
			System.out.println("Done");
		}
		else
		{
			System.out.println("Please enter a valid number next time");
		}
	}
}