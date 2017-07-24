package main;
import java.io.*;
import java.util.Scanner;

public class Readerwriter {
	private static final String FILENAME = "C:\\Users\\David\\eclipse-workspace\\OOPpeople\\People List.txt";

	Person Dave = new Person("Dave", 23, "JT1");
	Person Jess = new Person("Jess", 23, "JT2");
	Person Alex = new Person("Alex", 25, "JT3");
	Person Allen = new Person("Allen", 28, "JT4");
	Person Dee = new Person("Dee", 35, "JT5");

	public void Writer() throws FileNotFoundException 
	{

		PrintWriter writer = new PrintWriter("People List.txt");
		writer.println(Dave.returninfo());
		writer.println(Jess.returninfo());
		writer.println(Alex.returninfo());
		writer.println(Allen.returninfo());
		writer.println(Dee.returninfo());
		writer.close();
	}

	public void Reader() throws IOException
	{
		FileReader reader = new FileReader(FILENAME);
		BufferedReader br = new BufferedReader(reader);
		
		String line;
		while((line = br.readLine())!=null)
		{
			System.out.println(line);
			
		}
	}
}