package main;

public class Q3Parameters {

	public static void main(String[] args) {
		
		String text = "Hello Main";
		
		System.out.println(text(text));

	}
	
	public static String text(String text)
	{
		text = text + "!";
		return text;
	}

}
